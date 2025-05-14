package apphooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHooks {

    private static WebDriver driver;

    @Before
    public void setupBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println("🔹 Browser Launched");
    }

    @After
    public void tearDownBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot screen = (TakesScreenshot) driver;
            byte[] out = screen.getScreenshotAs(OutputType.BYTES);
            scenario.attach(out, "png/jpg", "Failed scenario");
        }
        if (driver != null) {
            driver.quit();
            System.out.println("🔹 Browser Closed");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
