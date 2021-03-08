package com.fidexio.pages;

import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void verifyActivitiesIsDisplayed() {
        Assert.assertTrue(activities.isDisplayed());

    }
        @FindBy(xpath = "//li[@id='menu_more_container']/a")
        public WebElement menuMoreContainer;

        @FindBy(xpath = "//div[@class='o_loading']")
        public WebElement screenLoader;

        public void navigateTo (String tab){
            String tabLoc = "//span[normalize-space()='" + tab + "' and contains(@class, 'oe_menu_text')]";
            WebElement module = Driver.get().findElement(By.xpath(tabLoc));
            if (!module.isDisplayed()) {
                menuMoreContainer.click();
                BrowserUtils.waitFor(1);
            }
            module.click();
        }

        public void waitUntilScreenLoaderDisappear () {
            new WebDriverWait(Driver.get(), 10).until(ExpectedConditions.visibilityOf(screenLoader));
            new WebDriverWait(Driver.get(), 10).until(ExpectedConditions.invisibilityOf(screenLoader));
        }

    }









    /*discuss xpath="//a[@*='115']"
    caledar xpyth= "//a[@*='136']"
    notes = xpath ="//a[@*='220']"
     contacts ="//a[@*='68']"
website= "//a[@*='382']"
iventory="//a[@*='347']"
manufactoring="//a[@*='415']"
more="//li[@*='menu_more_container']"
more dropdown toggle="//b[@*='caret']"
repairs="//a[@*='723']"
invoicing="//a[@*='199']"
timesheets="//a[@*='404']"
employees="//a[@*='157']"
leaves="//a[@*='295']"
expenses="//a[@*='388']"
lunch=" //a[@*='49']"
meintenance="//a[@*='165']"
dashboard="//a[@*='1']" */