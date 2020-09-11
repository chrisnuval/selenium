package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends base {

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	By loginField = By.id("userIdentifier");
	By loginBtn = By.xpath("//button[@class='btn btn-primary btn-block btn-rounded text-uppercase']");
	By registerNowLink = By.xpath("//a[contains(text(),'Register now!')]");
	By errorUserNotFound = By.xpath("//div[contains(text(),'The specified user could not be found')]");
	
	public void login(String text) {
		inputString(loginField,text);
		click(loginBtn);
	}
	
	public void goToRegistrationPage() {
		click(registerNowLink);
	}
	
	public void errorMessageUserNotFound() {
		waitVisibility(errorUserNotFound);
	}

}
