package com.cts.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static By userNameLoc = By.id("email");
	private static By passLoc = By.id("pass");
	private static By loginLoc = By.id("send2");
	private static By errorLoc= By.xpath("//div[contains(text(),'Invalid')]");
	private static By buttonLoc		= By.xpath("//span[text()='Register']");
	
	public static void enterUserName(WebDriver driver, String username) {

		driver.findElement(userNameLoc).sendKeys(username);
	}

	public static void enterPassword(WebDriver driver, String password) {

		driver.findElement(passLoc).sendKeys(password);
	}

	public static void clickOnLogin(WebDriver driver) {
		driver.findElement(loginLoc).click();
	}

	public static String errorMessage(WebDriver driver) {
		WebElement errorEle = driver.findElement(errorLoc);
		String actualMessage= errorEle.getText();
		return actualMessage;
	}
	
	public static void clickOnRegister(WebDriver driver) {
		driver.findElement(buttonLoc).click();
	}

}
