package com.fidexio.runners;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports", "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "com/fidexio/step_definitions",
        dryRun =false,
        tags = "@FID-202"

)
public class CukesRunner {


}
