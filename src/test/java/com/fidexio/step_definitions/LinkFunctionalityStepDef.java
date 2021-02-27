package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.DashboardPage;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkFunctionalityStepDef {
    @When("the user navigate to {string}")
    public void the_user_navigate_to(String module) {

         new DashboardPage().navigateTo(module);
        new DashboardPage().waitUntilScreenLoaderDisappear();
        BrowserUtils.waitFor(2);
        if (module.equals("Website")){
            new WebDriverWait(Driver.get(),10).until(ExpectedConditions.visibilityOf(new LoginPage().Email));
        }
    }

    @Then("the user should get {string}")
    public void the_user_should_get(String title) {
       Assert.assertEquals(title, Driver.get().getTitle());
    }
}
