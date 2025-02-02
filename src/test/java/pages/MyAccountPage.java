package pages;

import models.MyAccountModel;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
import utils.ScenarioContext;

public class MyAccountPage {
    WebDriver driver;
    ElementHelper helper;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkTextAccountName(String name) {
        helper.checkText(MyAccountModel.ACCOUNT_NAME_VALUE_TEXT, name);
    }

    public void checkTextAccountType(String type) {
        helper.checkText(MyAccountModel.ACCOUNT_TYPE_VALUE_TEXT, type);
    }

    public void checkTextCreationTime(String time) {
        helper.checkText(MyAccountModel.CREATION_TYPE_VALUE_TEXT, time);
    }

    public void checkTextAmount(String amount) {
        helper.checkText(MyAccountModel.AMOUNT_VALUE_TEXT, amount);
    }

    public void checkTextRandomAccountName() {
        String randomText = ScenarioContext.get("randomText", String.class);
        helper.checkText(MyAccountModel.ACCOUNT_NAME_VALUE_TEXT, randomText);
    }
}
