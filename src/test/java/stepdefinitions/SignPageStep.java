package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.bdd.magicbricks.pages.SignPage;

import apphooks.BrowserHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignPageStep {

    private WebDriver driver;
    private SignPage sign;

    public SignPageStep() {
        this.driver = BrowserHooks.getDriver();
        this.sign = new SignPage(driver);

    }

    @Given("User is on the sign Page")
    public void user_on_sign_page() throws IOException, InterruptedException {
        driver.get("http://dev-opera.bscxpress.com.s3-website.ap-south-1.amazonaws.com/login");
        Thread.sleep(5000);

    }

    @When("User enters the username {string} and password {string}")
    public void user_enters_the_username_and_password(String username, String password) {
        sign.enterUsername(username);
        sign.enterPassword(password);
    }

    @When("user click on the sign button")
    public void user_clicks_on_the_sign_button() {
        sign.clickSignInButton();
    }

    @Then("User should be logged in successfully")
    public void User_should_be_logged_successfully() {

    }

    @Then("User get the sign page title")
    public void user_get_Title() {
        sign.getTitle();
    }

}
