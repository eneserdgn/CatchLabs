package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.TransactionsPage;
import utils.DriverManager;

public class TransactionsSteps {
    TransactionsPage transactionsPage;

    public TransactionsSteps() {
        transactionsPage = new TransactionsPage(DriverManager.getDriver());
    }

    @Then("Transactions, Check Text, Last Sender: {string}")
    public void transactionsCheckTextLastSender(String sender) {
        transactionsPage.checkTextLastSender(sender);
    }

    @Then("Transactions, Check Text, Last Receiver: {string}")
    public void transactionsCheckTextLastReceiver(String rec) {
        transactionsPage.checkTextLastReceiver(rec);
    }

    @Then("Transactions, Should See, Last Time")
    public void transactionsShouldSeeLastTime() {
        transactionsPage.shouldSeeLastTime();
    }

    @Then("Transactions, Check Text, Last Amount: {string}")
    public void transactionsCheckTextLastAmount(String amount) {
        transactionsPage.checkTextLastAmount(amount);
    }
}
