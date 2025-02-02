package pages;

import models.LoginModel;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class LoginPage {
    WebDriver driver;
    ElementHelper helper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void sendKeysUsername(String name) {
        helper.sendKeys(LoginModel.USERNAME_TEXTBOX, name);
    }

    public void sendKeysPassword(String pass) {
        helper.sendKeys(LoginModel.PASSWORD_TEXTBOX, pass);
    }

    public void clickLogin() {
        helper.click(LoginModel.LOGIN_BUTTON);
    }

    public void clickOpenMoneyTransfer() {
        helper.click(LoginModel.OPEN_MONEY_TRANSFER_BUTTON);
    }

    public void clickBackButton() {
        helper.click(LoginModel.BACK_BUTTON);
    }

    public void clickAlertPopup(){
        driver.switchTo().alert().accept();
    }
}
