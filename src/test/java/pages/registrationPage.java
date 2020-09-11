package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationPage extends base {

	public registrationPage(WebDriver driver) {
		super(driver);
	}
	
	By personalAccountLink = By.xpath("//a[contains(text(),'Personal account')]"); 
	By businessAccountLink = By.xpath("//a[contains(text(),'Business account')]");
	
	public void waitForRegistrationLinks() {
		waitVisibility(personalAccountLink);
		waitVisibility(businessAccountLink);
	}

}
