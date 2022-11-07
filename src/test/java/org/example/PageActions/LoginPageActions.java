package org.example.PageActions;

import org.example.PageDefinitions.CommonSteps;
import org.example.PageElements.LoginPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

    WebDriver driver;

    LoginPageElements loginPageElements;

    public void LoginActions(CommonSteps commonSteps , LoginPageElements loginPageElements){
        this.driver = commonSteps.getDriver();
        this.loginPageElements =  loginPageElements;
    }

    public void Username(String username){
        loginPageElements.username.sendKeys(username);
    }
    public void Password(String password){
        loginPageElements.Password.sendKeys(password);
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
