package org.example.PageActions;

import org.example.PageDefinitions.CommonSteps;
import org.example.PageElements.RegistrationPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageActions {
 WebDriver driver;
 RegistrationPageElements registrationPageElements;

    public RegistrationPageActions(CommonSteps commonSteps, RegistrationPageElements registrationPageElements) {
        this.driver = commonSteps.getDriver();
        this.registrationPageElements =  registrationPageElements;
    }
     public void maleButton(){
        registrationPageElements.maleButton.click();
     }

    public void firstName(){
        registrationPageElements.firstName.sendKeys("Rishi");
    }

    public void Lastname(){
        registrationPageElements.lastName.sendKeys("arya");
    }

    public void email (){
        registrationPageElements.email.sendKeys("rishi123@gmail.com");
    }
    public  void password (){
        registrationPageElements.password.sendKeys("Rishi@123");
    }

    public void confirmPassword (){
        registrationPageElements.confirmPassword.sendKeys("Rishi@123");
    }

    public void registration (){
        registrationPageElements.registrationButton.click();

    }

    public RegistrationPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver ,this);
    }
}
