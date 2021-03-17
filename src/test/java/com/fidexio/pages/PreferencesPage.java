package com.fidexio.pages;

import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PreferencesPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Change password')]")
    public WebElement changePasswordLink;

    @FindBy(xpath = "(//tbody/tr/td/input)[1]")
    public WebElement oldPasswordInputBox;

    @FindBy(xpath = "(//tbody/tr/td/input)[2]")
    public WebElement newPasswordInputBox;

    @FindBy(xpath = "(//tbody/tr/td/input)[3]")
    public WebElement confirmNewPasswordInputBox;

    @FindBy(xpath = "//button[contains(text(),'Change Password')]")
    public WebElement changePasswordSubmitButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "(//input[@type='file'])[3]")
    public WebElement editButtonOnTheAvatar;

    public void clickOnChangePasswordLink() {
        BrowserUtils.waitFor(2);
        changePasswordLink.click();
    }

    public void enterOldPassword(String oldPassword) {
        BrowserUtils.waitFor(1);
        oldPasswordInputBox.sendKeys(oldPassword);
    }

    public void enterNewPassword(String newPassword) {
        BrowserUtils.waitFor(1);
        newPasswordInputBox.sendKeys(newPassword);
    }

    public void enterNewPasswordAgain(String newPassword) {
        BrowserUtils.waitFor(1);
        confirmNewPasswordInputBox.sendKeys(newPassword);
    }

    public void clickOnChangePasswordSubmitButton() {
        BrowserUtils.waitFor(1);
        changePasswordSubmitButton.click();
    }

    public void changeTheAvatar(String newImageName) {
        String newImagePath = "C:\\Users\\A\\IdeaProjects\\BriteERP\\src\\test\\resources\\images\\" + newImageName + ".jpg";
        BrowserUtils.waitFor(1);
        editButtonOnTheAvatar.sendKeys(newImagePath);
        BrowserUtils.waitFor(1);
        saveButton.click();
    }
}

