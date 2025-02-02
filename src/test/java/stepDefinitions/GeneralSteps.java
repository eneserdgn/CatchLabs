package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GeneralPage;
import pages.LoginPage;
import utils.DriverManager;

public class GeneralSteps {
    GeneralPage generalPage;
    LoginPage loginPage;

    public GeneralSteps() {
        generalPage = new GeneralPage(DriverManager.getDriver());
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @Then("General, Check Url, Url: {string}")
    public void generalCheckUrlUrl(String url) {
        generalPage.checkUrl(url);
    }

    @When("General, Click, Transfer Money Button")
    public void generalClickTransferMoneyButton() {
        generalPage.clickTransferMoneyButton();
    }

    @When("General, Click, Add Money Button")
    public void generalClickAddMoneyButton() {
        generalPage.clickAddMoneyButton();
    }

    @When("General, Click, Edit Account Button")
    public void generalClickEditAccountButton() {
        generalPage.clickEditAccountButton();
    }

    @Given("User open app with Username: {string} and Password: {string}")
    public void userOpenAppWithUsernameAndPassword(String name, String pass) {
        loginPage.sendKeysUsername(name);
        loginPage.sendKeysPassword(pass);
        loginPage.clickLogin();
        loginPage.clickOpenMoneyTransfer();
    }

    @When("General, Click, Alert Popup")
    public void generalClickAlertPopup() {
        loginPage.clickAlertPopup();
    }
}
