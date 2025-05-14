package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/feature/SignPage.feature" }, glue = { "stepdefinitions", "apphooks"
}, plugin = { "pretty", "json:target/myreport/jsonreport.json" }, monochrome = true)
public class RunnerForSignPage extends AbstractTestNGCucumberTests {

}
