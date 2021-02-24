
package com.fidexio.pages;

import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css="#login")
    public WebElement Email;

    @FindBy(xpath="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath= "//button[contains(text(),'Log in')]")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr) {
        Email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    public void loginAsA(String userType){

        String username, password;

        if (userType.startsWith("POS Manager")) {
            username = ConfigurationReader.get("posManagerUsername");
            password = ConfigurationReader.get("posManagerPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Sales Manager")) {
            username = ConfigurationReader.get("salesManagerUsername");
            password = ConfigurationReader.get("salesManagerPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Expenses Manager")){
            username = ConfigurationReader.get("expensesManagerUsername");
            password = ConfigurationReader.get("expensesManagerPassword");
            enterCredentials(username,password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Inventory Manager")) {
            username = ConfigurationReader.get("inventoryManagerUsername");
            password = ConfigurationReader.get("inventoryManagerPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Manufacturing User")) {
            username = ConfigurationReader.get("manufacturerUserUsername");
            password = ConfigurationReader.get("manufacturerUserPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
    }

    public void enterCredentials(String usernameStr,String passwordStr){
        Email.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
    }

    public void clickOnLoginButton(){
        submit.click();
    }

}