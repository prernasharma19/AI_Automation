package Project.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "Project.step.defination",
    		plugin = {
    				  "pretty",
    				  "html:target/cucumber-report.html",
    				  "json:target/cucumber.json",
    				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    				},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}