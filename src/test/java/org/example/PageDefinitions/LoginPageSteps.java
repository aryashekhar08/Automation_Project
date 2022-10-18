package org.example.PageDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.LoginPageActions;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps {
     WebDriver driver;
     LoginPageActions loginPageActions;

    public LoginPageSteps(CommonSteps commonSteps , LoginPageActions loginPageActions) {
        this.driver = commonSteps.getDriver();
        this.loginPageActions = loginPageActions;
    }

    @Given("When i entered url i am on login page")
    public void when_i_entered_url_i_am_on_login_page() {
        driver.get("https://www.demo.guru99.com/V4/index.php");
    }
    @When("When i entered my {string} and {string}")
    public void when_i_entered_my_and(String Username, String Password) {
        loginPageActions.Username(Username);
        loginPageActions.Password(Password);
        loginPageActions.loginButton();
    }
    @Then("I should Successfully logged in")
    public void i_should_successfully_logged_in() {
        System.out.println("successfully");

    }

}
