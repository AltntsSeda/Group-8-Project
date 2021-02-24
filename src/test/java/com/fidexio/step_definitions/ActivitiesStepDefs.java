package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class ActivitiesStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user should be able to see Activities link on the top menu")
    public void the_user_should_be_able_to_see_Activities_link_on_the_top_menu() {
//        dashboardPage.verifyActivitiesIsDisplayed();
    }

}
