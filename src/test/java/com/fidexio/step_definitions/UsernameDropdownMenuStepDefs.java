package com.fidexio.step_definitions;

import com.fidexio.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UsernameDropdownMenuStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @When("click on the username on the basepage")
    public void click_on_the_username_on_the_basepage() {
        dashboardPage.clickOnTheUsername();
    }

    @When("click on the {string}")
    public void click_on_the(String dropdownItem) {
        dashboardPage.clickOnTheDropdownItem(dropdownItem);
    }

    @Then("user should be able to go {string} page")
    public void user_should_be_able_to_go_page(String dropdownItem) {
        dashboardPage.verifyYouAreOnTheRelatedPage(dropdownItem);
    }

}
