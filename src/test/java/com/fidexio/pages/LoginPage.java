
package com.fidexio.pages;

import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#login")
    public WebElement Email;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    public WebElement submit;

    @FindBy(className = "alert")
    public WebElement wrongMessage;

    @FindBy(id = "login")
    public WebElement blankUsernameMessage;

    @FindBy(id = "password")
    public WebElement blankPasswordMessage;

    public void login(String userNameStr, String passwordStr) {
        Email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    public void loginAsA(String userType) {

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
        if (userType.startsWith("Expenses Manager")) {
            username = ConfigurationReader.get("expensesManagerUsername");
            password = ConfigurationReader.get("expensesManagerPassword");
            enterCredentials(username, password);
            clickOnLoginButton();
        }
        if (userType.startsWith("Inventory Manager")) {
            username = ConfigurationReader.get("Inventory_Manager_Email");
            password = ConfigurationReader.get("Inventory_Manager_password");
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

    public void enterCredentials(String usernameStr, String passwordStr) {
        Email.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
    }

    public void clickOnLoginButton() {
        submit.click();
    }


    public void verifyWrongMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, wrongMessage.getText());
    }

    public void verifyBlankMessage(String expectedMessage, String username, String password) {
        if (username.contains("-")) {
            Assert.assertEquals(expectedMessage, blankUsernameMessage.getAttribute("validationMessage"));
        }
        if (password.contains("-")) {
            Assert.assertEquals(expectedMessage, blankPasswordMessage.getAttribute("validationMessage"));
        }
    }
}
