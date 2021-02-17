
package com.fidexio.pages;

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


}