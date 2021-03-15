package com.fidexio.step_definitions;

import com.fidexio.pages.DashboardPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ChangeAvatarStepDef {
    @Then("the user click {string} button on the UserMenu")
    public void the_user_click_button_on_the_UserMenu(String string) {
       new DashboardPage().GetuserMenuOption(string).click();
       BrowserUtils.waitFor(3);
    }

    @Then("the user able to click edit sign")
    public void the_user_able_to_click_edit_sign() throws InterruptedException, AWTException {
        Actions action = new Actions(Driver.get());
        action.moveToElement(new DashboardPage().getAvatarOption("Edit"));
        String projectPath= "/Users/karanfilyigit/Desktop/avatar-2-3-filmloverss.jpeg";
        //new DashboardPage().getAvatarOption("Edit").sendKeys(projectPath);
        new DashboardPage().getAvatarOption("Edit").click();
        Thread.sleep(5000);
        new DashboardPage().setClipboardData(projectPath);
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
