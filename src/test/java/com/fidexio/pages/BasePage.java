package com.fidexio.pages;

import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {


    @FindBy(css = ".oe_topbar_name")
    public WebElement topUsername;

    @FindBy(xpath = "//li[@class='o_user_menu']//img[1]")
    public WebElement AvataronTheMenu;

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;




    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    }

