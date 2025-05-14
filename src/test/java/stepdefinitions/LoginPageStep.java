package stepdefinitions;

import org.junit.Assert;

import com.bdd.magicbricks.factory.DriverFactory;
import com.bdd.magicbricks.pages.HomePage;
import com.bdd.magicbricks.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {

	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private HomePage homepage = new HomePage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://accounts.magicbricks.com/userauth/login?logout=success");

	}

	@When("user enter username {string}")
	public void user_enter_username(String username) {
		loginpage.enterUsername(username);
		loginpage.clickOnNext();
	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
		loginpage.enterPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
		loginpage.clickOnNext();

	}

	@Then("user get the title of the home page")
	public void user_get_the_title_of_the_home_page() {
		String title = homepage.getTitle();
		System.out.println(title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectdTitle) {
		String actualtitle = homepage.getTitle();
		Assert.assertEquals(expectdTitle, actualtitle);

	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {

	}

	@When("user click on Rent link")
	public void user_click_on_Rent_link() {

	}

	@Then("rent page should be displayed")
	public void rent_page_should_be_displayed() {

	}

	@When("user click on help center link")
	public void user_click_on_help_center_link() {

	}

	@Then("help center page should be displayed")
	public void help_center_page_should_be_displayed() {

	}

}
