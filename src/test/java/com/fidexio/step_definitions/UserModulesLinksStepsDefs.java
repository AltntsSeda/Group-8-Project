package com.fidexio.step_definitions;

import com.fidexio.pages.DashboardPage;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UserModulesLinksStepsDefs {
    //new branch is created
    //everything will be fine

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userModules) {

    }


    @Then("the user should see following modules")
    public void the_user_should_see_following_modules(List<String> menuOptions) {

        BrowserUtils.waitFor(2);
        List<String> actualOptions=BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);
    }

}
