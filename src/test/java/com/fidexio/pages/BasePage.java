package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".oe_topbar_name")
    public WebElement topUsername;

    @FindBy(xpath = "//li[@class='o_user_menu']//img[1]")
    public WebElement AvataronTheMenu;

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//*[@title='Activities']")
    public WebElement activities;

    public void verifyActivitiesIsDisplayed(){
        Assert.assertTrue(activities.isDisplayed());
    }

}

