package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateProjectDetailInfoStepDefs {
    @Given("the user navigates to {string} tab")
    public void the_user_navigates_to_tab(String tab) throws InterruptedException {
        new DashboardPage().navigateTo(tab);
        new DashboardPage().waitUntilScreenLoaderDisappear();

    }


    @Then("the user click {string} button on Project page")
    public void the_user_click_button_on_Project_page(String string) {


    }
    @Then("the user able to write {string} on Project Name box")
    public void the_user_able_to_write_on_Project_Name_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user able to write {string} on Choose a Project Email box")
    public void the_user_able_to_write_on_Choose_a_Project_Email_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user able to click {string} button")
    public void the_user_able_to_click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user able to write {string} on Customer box")
    public void the_user_able_to_write_on_Customer_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user able select {string} dropdown on Customer box")
    public void the_user_able_select_dropdown_on_Customer_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user able to click {string} button on the Projects page tab")
    public void the_user_able_to_click_button_on_the_Projects_page_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user able to search {string} on serach box as Project Name")
    public void the_user_able_to_search_on_serach_box_as_Project_Name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user able to see {string} Kanban on Project Dashboard search page")
    public void the_user_able_to_see_Kanban_on_Project_Dashboard_search_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
