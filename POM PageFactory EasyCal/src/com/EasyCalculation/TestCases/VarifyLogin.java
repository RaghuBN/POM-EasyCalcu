package com.EasyCalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalcul.Pages.LoginEasyCal;

import Helper.BrowserFactory;

public class VarifyLogin {

	@Test
	public void CheckValidUser() {

		WebDriver driver = BrowserFactory.BrowserOptions("chrome",
				"https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginEasyCal loginPageEasyCal = PageFactory.initElements(driver, LoginEasyCal.class);
		loginPageEasyCal.login_EasyCal("9740673180", "raghubn@123");
	}
}
