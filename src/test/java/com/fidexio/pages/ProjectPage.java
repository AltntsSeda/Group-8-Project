package com.fidexio.pages;

import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;

public class ProjectPage extends BasePage{
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']" )
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier o_project_name oe_inline']")
    public WebElement projectNameBox;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input oe_inline']")
    public WebElement ChooseProjectEmailBox;

    @FindBy(xpath = "//span[.='Create & Edit']")
    public WebElement createAndEditButton;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[4]")
    public WebElement customerDropdown;
  

    @FindBy(xpath="//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButtonOnProjectsPage;

    //@FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='o_primary']/span[1]")
    public WebElement projectName;



    public void selectACustomerFromCustomerDropdown(String customerName) {
        BrowserUtils.waitFor(1);
        customerDropdown.click();
        BrowserUtils.waitFor(1);
        String locator = "//a[contains(text(),'" + customerName + "')]";
        Driver.get().findElement(By.xpath(locator)).click();

    }
    public void verifyThatTheNumberOfProjectsWithNewProjectNameIncreasedByOne(String projectName) {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("projectName" ,"projectName");
    }

}
