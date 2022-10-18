package org.example.PageElements;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    WebDriver driver;

    @FindBy(name = "uid")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement Password;

    @FindBy(name = "btnLogin")
    public WebElement Login;

    @FindBy(name = "btnReset")
    public WebElement Reset;

   public LoginPageElements(WebDriver driver){
        this.driver = driver;
       PageFactory.initElements(driver , this);
    }
}
