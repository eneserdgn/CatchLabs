package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PopupPage;
import utils.DriverManager;

public class PopupSteps {
    PopupPage popupPage;

    public PopupSteps() {
        popupPage = new PopupPage(DriverManager.getDriver());
    }

    @Then("Popup, Check Text, Title: {string}")
    public void popupCheckTextTitle(String title) {
        popupPage.checkTextTitle(title);
    }

    @When("Popup, Click, Sender Account")
    public void popupClickSenderAccount() {
        popupPage.clickSenderAccount();
    }

    @When("Popup, Click List Item, Sender Account: {string}")
    public void popupClickListItemSenderAccount(String sender) {
        popupPage.clickListItemSenderAccount(sender);
    }

    @When("Popup, Click, Receiver Account")
    public void popupClickReceiverAccount() {
        popupPage.clickReceiverAccount();
    }

    @When("Popup, Click List Item, Receiver Account: {string}")
    public void popupClickListItemReceiverAccount(String receiver) {
        popupPage.clickListItemReceiverAccount(receiver);
    }

    @When("Popup, SendKeys, Transfer Amount: {string}")
    public void popupSendKeysTransferAmount(String amount) {
        popupPage.sendKeysTransferAmount(amount);
    }

    @When("Popup, Click, Send Button")
    public void popupClickSendButton() {
        popupPage.clickSendButton();
    }

    @When("Popup, Click, Close Icon")
    public void popupClickCloseIcon() {
        popupPage.clickCloseIcon();
    }

    @When("Popup, SendKeys, Card Number: {string}")
    public void popupSendKeysCardNumber(String no) {
        popupPage.sendKeysCardNumber(no);
    }

    @When("Popup, SendKeys, Card Holder: {string}")
    public void popupSendKeysCardHolder(String holder) {
        popupPage.sendKeysCardHolder(holder);
    }

    @When("Popup, SendKeys, Expiry Date: {string}")
    public void popupSendKeysExpiryDate(String date) {
        popupPage.sendKeysExpiryDate(date);
    }

    @When("Popup, SendKeys, CVV: {string}")
    public void popupSendKeysCVV(String cvv) {
        popupPage.sendKeysCVV(cvv);
    }

    @When("Popup, SendKeys, Add Money Amount: {string}")
    public void popupSendKeysAddMoneyAmount(String amount) {
        popupPage.sendKeysAddMoneyAmount(amount);
    }

    @When("Popup, Click, Add Button")
    public void popupClickAddButton() {
        popupPage.clickAddButton();
    }

    @When("Popup, SendKeys, Account Name: {string}")
    public void popupSendKeysAccountName(String name) {
        popupPage.sendKeysAccountName(name);
    }

    @When("Popup, Click, Update Button")
    public void popupClickUpdateButton() {
        popupPage.clickUpdateButton();
    }

    @Then("Popup, Should See, Disable Update Button")
    public void popupShouldSeeDisableUpdateButton() {
        popupPage.shouldSeeDisableUpdateButton();
    }

    @When("Popup, Clear, Account Name")
    public void popupClearAccountName() {
        popupPage.clearAccountName();
    }

    @When("Popup, SendKeys, Random Account Name")
    public void popupSendKeysRandomAccountName() {
        popupPage.sendKeysRandomAccountName();
    }

    @Then("Popup, Check Text, Card Number Required: {string}")
    public void popupCheckTextCardNumberRequired(String no) {
        popupPage.checkTextCardNumberRequired(no);
    }

    @Then("Popup, Check Text, Card Holder Required: {string}")
    public void popupCheckTextCardHolderRequired(String holder) {
        popupPage.checkTextCardHolderRequired(holder);
    }

    @Then("Popup, Check Text, Expiry Date Required: {string}")
    public void popupCheckTextExpiryDateRequired(String date) {
        popupPage.checkTextExpiryDateRequired(date);
    }

    @Then("Popup, Check Text, CVV Required: {string}")
    public void popupCheckTextCVVRequired(String cvv) {
        popupPage.checkTextCVVRequired(cvv);
    }

    @Then("Popup, Check Text, Add Money Amount Required: {string}")
    public void popupCheckTextAddMoneyAmountRequired(String amount) {
        popupPage.checkTextAddMoneyAmountRequired(amount);
    }
}
