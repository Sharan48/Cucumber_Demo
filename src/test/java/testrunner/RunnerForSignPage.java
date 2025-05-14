package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/SignPage.feature", glue = { "stepdefinitions", "apphooks"
}, plugin = { "pretty", "json:target/myreport/jsonreport.json" }, monochrome = true)
public class RunnerForSignPage extends AbstractTestNGCucumberTests {

}
