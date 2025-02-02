package pages;

import models.GeneralModel;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class GeneralPage {
    WebDriver driver;
    ElementHelper helper;

    public GeneralPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkUrl(String url){
        helper.checkUrl(url);
    }

    public void clickTransferMoneyButton(){
        helper.click(GeneralModel.TRASFER_MONEY_BUTTON);
    }

    public void clickAddMoneyButton(){
        helper.click(GeneralModel.ADD_MONEY_BUTTON);
    }

    public void clickEditAccountButton(){
        helper.click(GeneralModel.EDIT_ACCOUNT_BUTTON);
    }
}
