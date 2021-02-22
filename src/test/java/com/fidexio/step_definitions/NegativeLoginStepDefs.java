package com.fidexio.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLoginStepDefs {

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
