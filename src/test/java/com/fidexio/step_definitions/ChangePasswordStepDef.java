package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.PreferencesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordStepDef {
    PreferencesPage preferencesPage = new PreferencesPage();
    LoginPage loginPage = new LoginPage();


    @And("click on the Change Password button")
    public void click_on_the_Change_Password_button() {
        System.out.println("change password link: " + preferencesPage.changePasswordLink.isDisplayed());
        preferencesPage.clickOnChangePasswordLink();
    }

    @And("enter Old Password {string}")
    public void enter_Old_Password(String oldPassword) {
        System.out.println("old password input box: " + preferencesPage.oldPasswordInputBox.isDisplayed());
        preferencesPage.enterOldPassword(oldPassword);
    }

    @And("enter New Password {string}")
    public void enter_New_Password(String newPassword) {

        preferencesPage.enterNewPassword(newPassword);
    }
    

    @And("enter New Password again {string}")
    public void enter_New_Password_again(String newPassword) {
        preferencesPage.enterNewPasswordAgain(newPassword);
    }

    @And("click on Change Password button")
    public void click_on_Change_Password_button() {
        
        preferencesPage.clickOnChangePasswordSubmitButton();
    }
    

    @Then("the user should be in the Login Page")
    public void the_user_should_be_in_the_Login_Page() {
        
        loginPage.submit.isDisplayed();
    }
    }














