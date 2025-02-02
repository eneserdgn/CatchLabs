package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@ADD3",
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "utils"},
        plugin = {
                "pretty",
                "utils.StepDetails",
                "html:Reports/Report.html",
        }
)
public class testRunner extends AbstractTestNGCucumberTests {
}