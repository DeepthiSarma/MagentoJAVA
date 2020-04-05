package com.cts.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {

	
	private static By firstnameLoc	= By.id("firstname");
	private static By lastnameLoc	= By.id("lastname");
	private static By emailLoc		= By.id("email_address");
	private static By companyLoc=By.name("company_type");
	private static By roleloc=By.id("individual_role");
	private static By countryLoc =By.id("country");
	private static By passwordLoc	= By.name("password");
	private static By confirmLoc	= By.id("password-confirmation");
	private static By agreeLoc=By.id("agree_terms");
	

	public static void fillRegisterForm(WebDriver driver, String firstname,String lastname, String email,String company, 
			String role,String country,String password, String confirm) {

		driver.findElement(firstnameLoc).sendKeys(firstname);
		driver.findElement(lastnameLoc).sendKeys(lastname);
		driver.findElement(emailLoc).sendKeys( email);
		
		Select companiee = new Select( driver.findElement(companyLoc));
		companiee.selectByVisibleText(company);
		
		//companiee = new Select( driver.findElement(companyLoc));
		//instead of creating multiple select refernce varibles we can use single varible for diff select elements
		
		Select Roles = new Select(driver.findElement(roleloc));
		Roles.selectByVisibleText(role);
		
		Select selectCountry = new Select(driver.findElement(countryLoc));
		selectCountry.selectByVisibleText(country);
		
		driver.findElement(passwordLoc).sendKeys(password);
		driver.findElement(confirmLoc).sendKeys(confirm);
		
		WebElement checkBox= driver.findElement(agreeLoc);
		checkBox.click();
}
		
}
			
	


