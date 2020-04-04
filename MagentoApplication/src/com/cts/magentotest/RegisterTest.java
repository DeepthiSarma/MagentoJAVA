package com.cts.magentotest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cts.magentoBase.LaunchWebDriver;
import com.cts.magentopages.HomePage;
import com.cts.magentopages.LoginPage;
import com.cts.magentopages.RegisterForm;
import com.cts.utils.ExcelUtils;

public class RegisterTest extends  LaunchWebDriver  {
	
	@DataProvider
	public String[][] registrationData() throws IOException {
		
		String[][] main=ExcelUtils.getSheetIntoStringArray("resources/my data.xlsx", "data");
	    return main;
	}
	
	@Test(dataProvider ="registrationData")
	public void RegistrationTest(String firstname,String lastname, String email, String password, 
			String confirm,String country, String company, String role) {

		HomePage.clickOnMyAccountIcon(driver);
		LoginPage.clickOnRegister(driver);
		RegisterForm.fillRegisterForm(driver, firstname, lastname, email, password, confirm, country, company, role);

		//WebElement checkBox = driver.findElement(By.id("agree_terms"));
//		if (!checkBox.isSelected()) {
//		checkBox.click();	}
	}

}
