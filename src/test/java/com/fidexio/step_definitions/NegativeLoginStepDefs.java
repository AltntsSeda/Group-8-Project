package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLoginStepDefs {
    LoginPage loginPage = new LoginPage();



    @When("the user enter wrong credentials {string} {string}")
    public void the_user_enter_wrong_credentials(String userNameStr, String passwordStr) {
        loginPage.login(userNameStr,passwordStr);
    }

    @When("the user enter blank credentials {string} {string}")
    public void the_user_enter_blank_credentials(String userNameStr, String passwordStr) {
        if (userNameStr.contains("-")) userNameStr="";
        if (passwordStr.contains("-")) passwordStr="";
        loginPage.login(userNameStr,passwordStr);
    }

    @Then("the user should see wrong message {string}")
    public void the_user_should_see_wrong_message(String message) {
        loginPage.verifyWrongMessage(message);
    }

    @Then("the user should see blank message {string} {string} {string}")
    public void theUserShouldSeeBlankMessage(String message, String username, String password) {
        loginPage.verifyBlankMessage(message,username,password);


    }
}
