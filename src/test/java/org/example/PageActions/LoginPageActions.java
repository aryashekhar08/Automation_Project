package org.example.PageActions;

import org.example.PageDefinitions.CommonSteps;
import org.example.PageElements.LoginPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

    WebDriver driver;

    LoginPageElements loginPageElements;

    public void LoginActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
        this.loginPageElements = new LoginPageElements(driver);
    }

    public void Username(String username){
        loginPageElements.username.sendKeys("mngr448836");
    }
    public void Password(String password){
        loginPageElements.Password.sendKeys("Yvavehu");
    }

    public void loginButton(){
        loginPageElements.Login.click();
    }

    public void Reset(){
        loginPageElements.Reset.click();
    }

    public LoginPageActions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

}
