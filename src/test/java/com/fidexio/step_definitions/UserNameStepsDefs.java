package com.fidexio.step_definitions;

import com.fidexio.pages.DashboardPage;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserNameStepsDefs {


   @When("the user enter valid credentials {string} {string}")
   public void enter_valid_credentials(String email, String password) {
      Driver.get().get(ConfigurationReader.get("url"));

      new LoginPage().login(email, password);
   }

   @Then("the user should be able to login see their {string} on the top menu")
   public void username_on_the_top_menu(String usernameTop) {
      BrowserUtils.waitFor(2);
      Assert.assertTrue(new DashboardPage().topUsername.getText().contains(usernameTop));

   }

}










