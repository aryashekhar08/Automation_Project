package org.example.PageDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.RegistrationPageActions;
import org.openqa.selenium.WebDriver;

public class RegistrationSteps {
    WebDriver driver;
    RegistrationPageActions registrationPageActions;

    public RegistrationSteps(CommonSteps commonSteps, RegistrationPageActions registrationPageActions) {
        this.driver = commonSteps.getDriver();
        this.registrationPageActions = registrationPageActions;
    }

    @Given("i am on registration page")
    public void i_am_on_registration_page() {
        driver.get("https://demowebshop.tricentis.com/register");

    }
    @Given("i entered my details")
    public void i_entered_my_details() {
        registrationPageActions.maleButton();
        registrationPageActions.firstName();
        registrationPageActions.Lastname();
        registrationPageActions.email();
        registrationPageActions.password();
        registrationPageActions.confirmPassword();

    }
    @When("i click on register")
    public void i_click_on_register() {
        registrationPageActions.registration();

    }
    @Then("i should get {string} message")
    public void i_should_get_message(String string) {
        System.out.println(string);

    }
}
