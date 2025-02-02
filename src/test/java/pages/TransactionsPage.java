package pages;

import models.TransactionsModel;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class TransactionsPage {
    WebDriver driver;
    ElementHelper helper;

    public TransactionsPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkTextLastSender(String sender) {
        helper.checkText(TransactionsModel.LAST_SENDER_TEXT, sender);
    }

    public void checkTextLastReceiver(String rec) {
        helper.checkText(TransactionsModel.LAST_RECEIVER_TEXT, rec);
    }

    public void shouldSeeLastTime() {
        helper.findElement(TransactionsModel.LAST_TIME_TEXT);
    }

    public void checkTextLastAmount(String amount) {
        helper.checkText(TransactionsModel.LAST_AMOUNT_TEXT, amount);

    }
}
