package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.DashboardPage;
import com.fidexio.pages.ProjectPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class CreateProjectDetailInfoStepDefs {

    ProjectPage projectPage = new ProjectPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user navigates to {string} tab")
    public void the_user_navigates_to_tab(String tab) throws InterruptedException {
        projectPage.navigateTo(tab);
        dashboardPage.waitUntilScreenLoaderDisappear();
        Thread.sleep(300);
    }

    @Then("the user click Create button on Project page")
    public void the_user_click_Create_button_on_Project_page() {
        projectPage.createButton.click();
        dashboardPage.waitUntilScreenLoaderDisappear();
    }


    @Then("the user able to write {string} on Project Name box")
    public void the_user_able_to_write_on_Project_Name_box(String string) {
        projectPage.projectNameBox.sendKeys(string);

    }

    @And("the user able to write {string} on Choose a Project Email box")
    public void the_user_able_to_write_on_Choose_a_Project_Email_box(String string) {
        projectPage.ChooseProjectEmailBox.sendKeys(string);

    }

    @Then("the user able to click Create&Edit button")
    public void the_user_able_to_click_Create_Edit_button(){

        projectPage.createAndEditButton.click();
    }

    @Then("select a customer from the customer dropdown {string}")
    public void select_a_customer_from_the_customer_dropdown(String customerName) {

        BrowserUtils.waitFor(1);
        projectPage.selectACustomerFromCustomerDropdown(customerName);
    }

    @Then("the user able to click Save button on the Projects page tab")
    public void the_user_able_to_click_Save_button_on_the_Projects_page_tab() {

        BrowserUtils.waitFor(1);
        projectPage.saveButtonOnProjectsPage.click();
        BrowserUtils.waitFor(1);
        projectPage.navigateTo("Project");

    }
    @Then("the user should see one additional project with the new project name {string}")
    public void the_user_should_see_one_additional_project_with_the_new_project_name(String projectName) {

        projectPage.verifyThatTheNumberOfProjectsWithNewProjectNameIncreasedByOne(projectName);

    }
}
