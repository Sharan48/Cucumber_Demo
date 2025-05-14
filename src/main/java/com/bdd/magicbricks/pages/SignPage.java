package com.bdd.magicbricks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignPage {

    private WebDriver driver;

    private By username = By.id("outlined-basic");
    private By password = By.id("outlined-adornment-password");
    private By signInButton = By.xpath("//button[text()='Login']");

    public SignPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String usernam) {
        driver.findElement(username).sendKeys(usernam);
    }

    public void enterPassword(String passwor) {
        driver.findElement(password).sendKeys(passwor);
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void getTitle() {
        System.out.println("Sign Page Title: " + driver.getTitle());
    }
}
