package com.fidexio.step_definitions;

import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import com.fidexio.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    /*There is no connection between feature files and hooks.
     Hooks will run always so we need to be careful about what we use inside.
      But we have also custom hooks that is running if we have same tag on top of scenarios.
      Tagged hooks will only run before/after scenario(s) with that given tag.
     */

    @Before
    public void setUp() {
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();

    }

    @Before("@db")
    public void setUpdb(){
        System.out.println("\tconnecting to database...");
    }

    @After("@db")
    public void closeDb(){
        System.out.println("\tdisconnecting to database...");

    }



}