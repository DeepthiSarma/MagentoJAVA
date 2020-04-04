package com.cts.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {

	
	private static By firstnameLoc	= By.id("firstname");
	private static By lastnameLoc	= By.id("lastname");
	private static By emailLoc		= By.id("email_address");
	private static By countryLoc =By.id("country");
	private static By companyLoc=By.name("company_type");
	private static By roleloc=By.id("customer_individual_role");
	private static By passwordLoc	= By.name("password");
	private static By confirmLoc	= By.name("confirmation");
	private static By agreeLoc=By.id("agree_terms");
	

	public static void fillRegisterForm(WebDriver driver, String firstname,String lastname, String email, String password, 
			String confirm,String country, String company, String role) {

		driver.findElement(firstnameLoc).sendKeys(firstname);
		driver.findElement(lastnameLoc).sendKeys(lastname);
		driver.findElement(emailLoc).sendKeys( email);
		
		Select selectCountry = new Select(driver.findElement(countryLoc));
		selectCountry.selectByVisibleText(country);
		
		Select companiee = new Select( driver.findElement(companyLoc));
		companiee.selectByVisibleText(company);
		
	 
		Select Roles = new Select(driver.findElement(roleloc));
		Roles.selectByVisibleText(role);
		
		driver.findElement(passwordLoc).sendKeys(password);
		driver.findElement(confirmLoc).sendKeys(confirm);
		
		WebElement checkBox= driver.findElement(agreeLoc);
		checkBox.click();
}
		
}
			
	


