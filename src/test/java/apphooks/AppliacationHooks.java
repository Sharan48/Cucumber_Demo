package apphooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.bdd.magicbricks.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppliacationHooks {
	private DriverFactory driverfactory;
	private WebDriver driver;

	public AppliacationHooks() {
		driverfactory = new DriverFactory();
		driver = DriverFactory.getDriver();
	}

	// @Before(order = 0)
	public void launchbrowser() throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Asus\\eclipse-workspace2\\com.bdd.magicbricks\\src\\test\\resources\\config\\config.properties");
		Properties prop = new Properties();
		prop.load(file);
		String browserName = prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver = driverfactory.init_driver(browserName);
	}

	// @After(order = 0)
	public void quitbrowser() {
		driver.quit();
	}

}
