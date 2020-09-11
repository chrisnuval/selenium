package test;

import org.testng.annotations.Test;

import pages.loginPage;
import pages.registrationPage;

public class test_login extends initialize{
	
	
	@Test
	public void incorrectLoginUsingEmail() throws Exception{
		loginPage loginPage = new loginPage(driver);
		loginPage.login("christian.c.nuval@gmail.com");
		loginPage.errorMessageUserNotFound();
	}
	
	@Test
	public void incorrectLoginUsingPhone() throws Exception{
		loginPage loginPage = new loginPage(driver);
		loginPage.login("09177718167");
		loginPage.errorMessageUserNotFound();
	}
	
	@Test
	public void verifyRegistrationPage() throws Exception{
		loginPage loginPage = new loginPage(driver);
		registrationPage regPage = new registrationPage(driver);
		
		loginPage.goToRegistrationPage();
		regPage.waitForRegistrationLinks();
	}
	
	@Test
	public void testSupportedLanguages() throws Exception{
		loginPage loginPage = new loginPage(driver);
		loginPage.changeLanguageToLithuanian();
		
	}

}
