package com.fidexio.step_definitions;

import com.fidexio.pages.DashboardPage;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ModuleLinkFunctionaltyStepDefSü {



    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> followingOptions) {
        System.out.println(followingOptions);
        List<WebElement> menu = new DashboardPage().menuOptions;
        List<String> actualResult = BrowserUtils.getElementsText(menu);
        Assert.assertEquals(followingOptions,actualResult);

    }    }



