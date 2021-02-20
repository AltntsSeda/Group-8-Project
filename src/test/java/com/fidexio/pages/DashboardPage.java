package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[@title='Activities']")
    public WebElement activities;

    public void verifyActivitiesIsDisplayed(){
        Assert.assertTrue(activities.isDisplayed());
    }

}
