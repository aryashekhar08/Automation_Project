package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPageElements {
    WebDriver driver;

    @FindBy(linkText = "Manager")
    public WebElement manager;

    @FindBy(linkText = "New Customer")
    public WebElement newCustomer;

    @FindBy(linkText = "Edit Customer")
    public WebElement editCustomer;

    @FindBy(linkText = "Delete Customer")
    public WebElement deleteCustomer;

    @FindBy(linkText = "New Account")
    public WebElement newAccount;

    @FindBy(linkText = "Edit Account")
    public WebElement editAccount;

    @FindBy(linkText = "Delete Account")
    public WebElement deleteAccount;

    @FindBy(linkText = "Deposit")
    public WebElement deposit;

    @FindBy(linkText = "Withdrawal")
    public WebElement withdrawal;

    @FindBy(linkText = "Fund Transfer")
    public WebElement fundTransfer;

    @FindBy(linkText = "Change Password")
    public WebElement changePassword;

    @FindBy(linkText = "Balance Enquiry")
    public WebElement balanceEnquiry;

    @FindBy(linkText = "Mini Statement")
    public WebElement miniStatement;

    @FindBy(linkText = "Customised Statement")
    public WebElement customisedStatement;

    @FindBy(linkText = "Log out")
    public WebElement logOut;

    public ManagerPageElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
}
