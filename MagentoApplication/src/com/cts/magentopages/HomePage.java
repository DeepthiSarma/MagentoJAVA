package com.cts.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
private static By myAccLoc = By.xpath("//*[@data-adobe-name='Header|GlobalNav|MyAccountClick']");

	public static void clickOnMyAccountIcon(WebDriver driver) {
		
	driver.findElement(myAccLoc).click();
	}
	
}
