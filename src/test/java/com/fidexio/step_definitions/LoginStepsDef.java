package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepsDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
    }

    @When("the user enters the Manufacturing_User information")
    public void the_user_enters_the_Manufacturing_User_information() {
        String username = ConfigurationReader.get("Manufacturing_User_Email");
        String password = ConfigurationReader.get("Manufacturing_User_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);

    }

    @When("the user enters the Expenses_Manager information")
    public void the_user_enters_the_Expenses_Manager_information() {
        String username = ConfigurationReader.get("Expenses_Manager_Email");
        String password = ConfigurationReader.get("Expenses_Manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enters the Inventory_Manager information")
    public void the_user_enters_the_Inventory_Manager_information() {
        String username = ConfigurationReader.get("Inventory_Manager_Email");
        String password = ConfigurationReader.get("Inventory_Manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enters the Point_of_Sales_Manager information")
    public void the_user_enters_the_Point_of_Sales_Manager_information() {
        String username = ConfigurationReader.get("Point_of_Sales_Manager_Email");
        String password = ConfigurationReader.get("Point_of_Sales_Manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enters the Sales_manager information")
    public void the_user_enters_the_store_manager_information() {
        String username = ConfigurationReader.get("Sales_manager_Email");
        String password = ConfigurationReader.get("Sales_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enter wrong credentials {string} {string}")
    public void the_user_enter_wrong_credentials(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click on login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should see wrong message {string}")
    public void the_user_should_see_wrong_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enter blank credentials {string} {string}")
    public void the_user_enter_blank_credentials(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should see blank message {string}")
    public void the_user_should_see_blank_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
