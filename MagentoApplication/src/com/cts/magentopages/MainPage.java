package com.cts.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

	private static By implicityLoc = By.linkText("Log Out");
	private static By logoutLoc = By.linkText("Log Out");

	public static void implicitlywait(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(implicityLoc));
	}

	public static String getTitle(WebDriver driver) {
		String actualtitle = driver.getTitle();
		return actualtitle;
	}

	public static void logout(WebDriver driver) {
		driver.findElement(logoutLoc).click();
	}
}
