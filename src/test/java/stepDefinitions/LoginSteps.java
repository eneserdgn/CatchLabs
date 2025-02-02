package stepDefinitions;

import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverManager;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("Login Page, SendKeys, Username: {string}")
    public void loginPageSendKeysUsername(String name) {
        loginPage.sendKeysUsername(name);
    }

    @When("Login Page, SendKeys, Password: {string}")
    public void loginPageSendKeysPassword(String pass) {
        loginPage.sendKeysPassword(pass);
    }

    @When("Login Page, Click, Login")
    public void loginPageClickLogin() {
        loginPage.clickLogin();
    }

    @When("Login Page, Click, Open Money Transfer")
    public void loginPageClickOpenMoneyTransfer() {
        loginPage.clickOpenMoneyTransfer();
    }

    @When("Login Page, Click, Back Button")
    public void loginPageClickBackButton() {
        loginPage.clickBackButton();
    }
}
