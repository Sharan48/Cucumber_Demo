package com.bdd.magicbricks.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	

	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	
//	this method is used to initialize the ThreadLocal driver on the basis of given browser
	
	public WebDriver init_driver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver()); 
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
	}
//this is used get the driver with ThreadLocal
	
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}

}
