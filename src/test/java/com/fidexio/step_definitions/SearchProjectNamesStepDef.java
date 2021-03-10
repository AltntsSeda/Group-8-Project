package com.fidexio.step_definitions;

import com.fidexio.pages.ProjectPage;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SearchProjectNamesStepDef {

        @Then("the user should be able to enter valid project name")
        public void enterValidProjectName() {
            ProjectPage project= new ProjectPage();

            BrowserUtils.waitFor(2);

            //WebDriver driver = null;
            //driver.findElement(By.xpath("//a[@href='/web#menu_id=333&action=']/span[@class='oe_menu_text']")).click();
            project.projectButton.click();

            BrowserUtils.waitFor(3);
            //driver.findElement(By.xpath("//input[@class='o_searchview_input']")).sendKeys("E-Learning Integration");
        project.searchProjectBox.sendKeys("E-Learning Integration");
        project.searchProjectBox.sendKeys(Keys.ENTER);



        BrowserUtils.waitFor(3);
        Assert.assertEquals("E-Learning Integration",project.ProjectE_Learning_Integration.getText());



            //String search= driver.findElement(By.xpath("//span[.='E-Learning Integration']")).getText();
            //System.out.println(search);

            //Assert.assertEquals("E-Learning Integration", search);


           // Assert.assertTrue(new DashboardPage().topUsername.getText().contains(usernameTop));
        }

        }

