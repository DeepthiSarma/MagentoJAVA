package com.cts.magentotest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cts.magentoBase.LaunchWebDriver;
import com.cts.magentopages.HomePage;
import com.cts.magentopages.LoginPage;
import com.cts.magentopages.MainPage;
import com.cts.utils.ExcelUtils;

public class LoginTest extends LaunchWebDriver {

	
	@DataProvider

	public String[][] invalidCredentialData() throws IOException {

		
	String[][] main=ExcelUtils.getSheetIntoStringArray("resources/Book1.xlsx", "sheet1");
    return main;
	}

	@Test(dataProvider ="invalidCredentialData")
	public void invalidCredentialTest(String username,String password,String message) {

		// icon
		HomePage.clickOnMyAccountIcon(driver);

		// email
		LoginPage.enterUserName(driver, username);

		// password
		LoginPage.enterPassword(driver, password);

		// login
		LoginPage.clickOnLogin(driver);

		LoginPage.errorMessage(driver);

		// alert
		String actualErrorMessage = LoginPage.errorMessage(driver);

		Assert.assertTrue(actualErrorMessage.contains("Invalid login or password."),
				"Assertion on invalid credentials");
	}

	@Test
	public void validCredentialTest() {

		// icon
		HomePage.clickOnMyAccountIcon(driver);

		// email
		LoginPage.enterUserName(driver, "balaji0017@gmail.com");

		// password
		LoginPage.enterPassword(driver, "welcome@123");

		// login
		LoginPage.clickOnLogin(driver);

		// wait
		MainPage.implicitlywait(driver);

		String ExpectedTitle = "My Account";
		String actualValue = MainPage.getTitle(driver);
		Assert.assertEquals(actualValue, "My Account", "Assertion on valid credentials");

		MainPage.logout(driver);

	}

}


//1

//String[][] main = new String[3][3];
//
//// test case 1
//main[0][0] = "sai@gamail.com";
//main[0][1] = "asfadf";
//main[0][2] = "invalid password";
//// test case 2
//main[1][0] = "sai123@gmail.com";
//main[1][1] = "asbcgdgh";
//main[1][2] = "invalid password";
//// test case 3
//main[2][0] = "sai123@gmail.com";
//main[2][1] = "asbcgdgh";
//main[2][2] = "invalid password";
//return main;