package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.MyAccountPage;
import utils.DriverManager;

public class MyAccountSteps {
    MyAccountPage myAccountPage;

    public MyAccountSteps() {
        myAccountPage = new MyAccountPage(DriverManager.getDriver());
    }

    @Then("My Account, Check Text, Account Name: {string}")
    public void myAccountCheckTextAccountName(String name) {
        myAccountPage.checkTextAccountName(name);
    }

    @Then("My Account, Check Text, Account Type: {string}")
    public void myAccountCheckTextAccountType(String type) {
        myAccountPage.checkTextAccountType(type);
    }

    @Then("My Account, Check Text, Creation Time: {string}")
    public void myAccountCheckTextCreationTime(String time) {
        myAccountPage.checkTextCreationTime(time);
    }

    @Then("My Account, Check Text, Amount: {string}")
    public void myAccountCheckTextAmount(String amount) {
        myAccountPage.checkTextAmount(amount);
    }

    @Then("My Account, Check Text, Random Account Name")
    public void myAccountCheckTextRandomAccountName() {
        myAccountPage.checkTextRandomAccountName();
    }
}
