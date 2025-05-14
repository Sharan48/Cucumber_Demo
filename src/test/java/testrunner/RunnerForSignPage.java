package testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/SignPage.feature", glue = { "stepdefinitions", "apphooks"
}, plugin = { "pretty", "json:target/myreport/jsonreport.json" }, monochrome = true)
public class RunnerForSignPage extends AbstractTestNGCucumberTests {

    // if have to achieve parallele execution then
    // @Override
    // @DataProvider(parallel = true)
    // public Object[][] scenarios() {
    // return super.scenarios();
    // }
}
