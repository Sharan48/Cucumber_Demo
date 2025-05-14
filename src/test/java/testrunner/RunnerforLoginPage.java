package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/feature/LoginPage.feature" }, glue = { "stepdefinitions",
		"apphooks" }, plugin = { "pretty",
				"json:target/myreport/jsonreport.json" }, monochrome = true, dryRun = true)

public class RunnerforLoginPage {

}
