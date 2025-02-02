package pages;

import models.PopupModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
import utils.ScenarioContext;

public class PopupPage {
    WebDriver driver;
    ElementHelper helper;

    public PopupPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkTextTitle(String title) {
        helper.checkText(PopupModel.TITLE_TEXT, title);
    }

    public void clickSenderAccount() {
        helper.click(PopupModel.SENDER_ACCOUNT_DROPDOWN);
    }

    public void clickListItemSenderAccount(String sender) {
        helper.clickListItem(PopupModel.SENDER_ACCOUNT_OPTIONS, sender);
    }

    public void clickReceiverAccount() {
        helper.click(PopupModel.RECEIVER_ACCOUNT_DROPDOWN);
    }

    public void clickListItemReceiverAccount(String receiver) {
        helper.select(PopupModel.RECEIVER_ACCOUNT_DROPDOWN, receiver);
    }

    public void sendKeysTransferAmount(String amount) {
        helper.sendKeys(PopupModel.TRANSFER_AMOUNT_TEXTBOX, amount);
    }

    public void clickSendButton() {
        helper.click(PopupModel.SEND_BUTTON);
    }

    public void clickCloseIcon() {
        helper.click(PopupModel.CLOSE_ICON);
    }

    public void sendKeysCardNumber(String no) {
        helper.sendKeys(PopupModel.CARD_NUMBER_TEXTBOX, no);
    }

    public void sendKeysCardHolder(String holder) {
        helper.sendKeys(PopupModel.CARD_HOLDER_TEXTBOX, holder);
    }

    public void sendKeysExpiryDate(String date) {
        helper.sendKeys(PopupModel.EXPIRITY_DATE_TEXTBOX, date);
    }

    public void sendKeysCVV(String cvv) {
        helper.sendKeys(PopupModel.CVV_TEXTBOX, cvv);
    }

    public void sendKeysAddMoneyAmount(String amount) {
        helper.sendKeys(PopupModel.ADD_AMOUNT_TEXTBOX, amount);
    }

    public void clickAddButton() {
        helper.click(PopupModel.ADD_BUTTON);
    }

    public void sendKeysAccountName(String name) {
        helper.sendKeys(PopupModel.ACCOUNT_NAME_TEXTBOX, name);
    }

    public void clickUpdateButton() {
        helper.click(PopupModel.ACTIVE_UPDATE_BUTTON);
    }

    public void shouldSeeDisableUpdateButton() {
        helper.findElement(PopupModel.DISABLE_UPDATE_BUTTON);
    }

    public void clearAccountName() {
        helper.clear(PopupModel.ACCOUNT_NAME_TEXTBOX);
    }

    public void sendKeysRandomAccountName() {
        String randomText = RandomStringUtils.randomAlphanumeric(8).toUpperCase();
        ScenarioContext.set("randomText", randomText);
        helper.sendKeys(PopupModel.ACCOUNT_NAME_TEXTBOX, randomText);
    }

    public void checkTextCardNumberRequired(String no) {
        helper.checkText(PopupModel.CARD_NUMBER_REQUIRED, no);
    }

    public void checkTextCardHolderRequired(String holder) {
        helper.checkText(PopupModel.CARD_HOLDER_REQUIRED, holder);
    }

    public void checkTextExpiryDateRequired(String date) {
        helper.checkText(PopupModel.EXPIRITY_DATE_REQUIRED, date);
    }

    public void checkTextCVVRequired(String cvv) {
        helper.checkText(PopupModel.CVV_REQUIRED, cvv);
    }

    public void checkTextAddMoneyAmountRequired(String amount) {
        helper.checkText(PopupModel.ADD_AMOUNT_REQUIRED, amount);
    }
}
