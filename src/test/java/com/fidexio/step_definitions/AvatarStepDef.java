package com.fidexio.step_definitions;

import com.fidexio.pages.DashboardPage;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AvatarStepDef {


    private boolean AvataronTheMenu;

    @When("the user enter wright credentials {string} {string}")
        public void user_enter_valid_credentials(String email, String password) {
            Driver.get().get(ConfigurationReader.get("url"));

            new LoginPage().login(email, password);
        }

        @Then("the user should be able to see their {string} on the top menu")
        public void avatar_on_the_top_menu(String avatarTop) {
            BrowserUtils.waitFor(2);
            DashboardPage dashboardPage= new DashboardPage();
            Assert.assertTrue(dashboardPage.AvataronTheMenu.isDisplayed());
        }


    }


