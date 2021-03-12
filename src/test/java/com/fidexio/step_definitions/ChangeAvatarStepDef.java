package com.fidexio.step_definitions;

import com.fidexio.pages.DashboardPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class ChangeAvatarStepDef {
    @Then("the user click {string} button on the UserMenu")
    public void the_user_click_button_on_the_UserMenu(String string) {
       new DashboardPage().GetuserMenuOption(string).click();
       BrowserUtils.waitFor(3);
    }

    @Then("the user able to click edit sign")
    public void the_user_able_to_click_edit_sign() {
        Actions action = new Actions(Driver.get());
        action.moveToElement(new DashboardPage().getAvatarOption("Edit"));
        String projectPath= "/Users/karanfilyigit/Desktop/avatar-2-3-filmloverss.jpeg";
        new DashboardPage().getAvatarOption("Edit").sendKeys(projectPath);
    }
}
