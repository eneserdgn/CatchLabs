package utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;

import java.time.Duration;

public class DriverManager {

    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static void setDriver(String browser) {
        switch (browser) {
            case "Chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                threadLocal.set(new ChromeDriver(chromeOptions));
                break;
            case "Firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                threadLocal.set(new FirefoxDriver(firefoxOptions));
                break;
            case "Safari":
                SafariOptions safariOptions = new SafariOptions();
                safariOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                threadLocal.set(new SafariDriver(safariOptions));
                break;
            default:
                Assert.fail("Lütfen doğru bir browser giriniz!!");
        }
        threadLocal.get().manage().window().maximize();
        threadLocal.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        threadLocal.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        threadLocal.get().get("https://catchylabs-webclient.testinium.com/signIn");
    }

    public static WebDriver getDriver() {
        return threadLocal.get();
    }

    public static void quitDriver() {
        if (threadLocal.get() != null) {
            threadLocal.get().quit();
            threadLocal.remove();
        }
    }
}
