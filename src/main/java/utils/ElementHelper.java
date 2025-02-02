package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    JavascriptExecutor js;

    public ElementHelper(WebDriver webDriver) {
        driver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(40));
        actions = new Actions(driver);
        js = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        js.executeScript("arguments[0].scrollIntoView({\n" + "            behavior: 'instant',\n" + "            block: 'center',\n" + "            inline: 'center'\n" + "        });", element);
        actions.moveToElement(element).build().perform();
        return element;
    }

    public List<WebElement> findElements(By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void clear(By by) {
        for (int i = 0; i < 12; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
        findElement(by).clear();
    }

    public void checkUrl(String url) {
        wait.until(ExpectedConditions.urlContains(url));
    }

    public void checkText(By by, String name) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, name));
    }

    public void clickListItem(By by, String text) {
        boolean check = false;
        List<WebElement> elements = findElements(by);
        for (WebElement element : elements) {
            js.executeScript("arguments[0].scrollIntoView({\n" + "            behavior: 'instant',\n" + "            block: 'center',\n" + "            inline: 'center'\n" + "        });", element);
            actions.moveToElement(element).build().perform();
            if (element.getText().contains(text)) {
                check = true;
                element.click();
                break;
            }
        }
        Assert.assertTrue(check, "Listede aranan element bulunamadı!!");
    }

    public void select(By by,String text){
        new Select(wait.until(ExpectedConditions.presenceOfElementLocated(by))).selectByVisibleText(text);
    }
}
