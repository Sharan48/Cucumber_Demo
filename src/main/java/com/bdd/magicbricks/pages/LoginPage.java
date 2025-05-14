package com.bdd.magicbricks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By enmailid=By.id("//input[@id='emailOrMobile']");
	private By next=By.id("//button[@id='btnStep1']");
	private By password=By.id("//input[@id='password']");
	private By login=By.id("//button[@id='btnLogin']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getLoginPageTitle() {
	  return driver.getTitle();
	}
	
	public void enterUsername(String uesrname) {
		driver.findElement(enmailid).sendKeys(uesrname);
	}
	public void clickOnNext() {
		driver.findElement(next).click();
	}
	
	public void enterPassword(String passwrd) {
		driver.findElement(password).sendKeys(passwrd);
	}
	
	public HomePage clickOnLogin() {
		driver.findElement(login).click();
		return new HomePage(driver);
	}
	
	public HomePage loginToApplication(String user, String pwd) {
		driver.findElement(enmailid).sendKeys(user);
		driver.findElement(next).click();
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		return new HomePage(driver);
	}
}
