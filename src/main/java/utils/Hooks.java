package utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Hooks {

    @Before
    public void before() {
        DriverManager.setDriver(PropertiesReader.getProperty("browser"));
    }

    @AfterStep
    public void afterStep(Scenario scenario) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        String base64Screenshot = ts.getScreenshotAs(OutputType.BASE64);
        byte[] imageBytes = Base64.getDecoder().decode(base64Screenshot);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
        BufferedImage originalImage = ImageIO.read(byteArrayInputStream);
        int scaledWidth = originalImage.getWidth() / 4;  // Yarıya indir
        int scaledHeight = originalImage.getHeight() / 4; // Yarıya indir
        Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
        BufferedImage bufferedImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bufferedImage.createGraphics();
        g.drawImage(scaledImage, 0, 0, null);
        g.dispose();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageWriter writer = ImageIO.getImageWritersByFormatName("jpeg").next();
        ImageWriteParam param = writer.getDefaultWriteParam();
        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(0.5f);  // %50 kalite sıkıştırma
        writer.setOutput(ImageIO.createImageOutputStream(byteArrayOutputStream));
        writer.write(null, new IIOImage(bufferedImage, null, null), param);
        writer.dispose();
        byte[] resizedImageBytes = byteArrayOutputStream.toByteArray();
        String resizedBase64Screenshot = Base64.getEncoder().encodeToString(resizedImageBytes);
        scenario.attach(Base64.getDecoder().decode(resizedBase64Screenshot), "image/jpeg", StepDetails.getStepName());

    }

    @After
    public void after() {
        DriverManager.quitDriver();
    }
}
