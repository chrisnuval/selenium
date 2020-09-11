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
	By languageList = By.xpath("//i[@class='fa fa-plus']");
	By langLithuanian = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/lt/login/']");
	By langRussian = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/ru/login/']");
	By langLatvian = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/lv/login/']");
	By langPolish = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/pl/login/']");
	By langBulgarian = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/bg/login/']");
	By langSpanish = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/es/login/']");
	By langAlbanian = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/sq/login/']");
	By langEstonian = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/et/login/']");
	By langGerman = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/de/login/']");
	By langRomanian = By.xpath("//ul[@class='list-spacious text-capitalize']//a[@href='/ro/login/']");
	

	
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
	
	public void changeLanguageToLithuanian() {
		click(languageList);
		click(langLithuanian);
	}
	
	public void changeLanguageToRussian() {
		click(languageList);
		click(langRussian);
	}

	public void changeLanguageToLatvian() {
		click(languageList);
		click(langLatvian);
	}

	public void changeLanguageToPolish() {
		click(languageList);
		click(langPolish);
	}

	public void changeLanguageToBulgarian() {
		click(languageList);
		click(langBulgarian);
	}

	public void changeLanguageToSpanish() {
		click(languageList);
		click(langSpanish);
	}

	public void changeLanguageToAlbanian() {
		click(languageList);
		click(langAlbanian);
	}
	public void changeLanguageToEstonian() {
		click(languageList);
		click(langEstonian);
	}
	public void changeLanguageToGerman() {
		click(languageList);
		click(langGerman);
	}
	public void changeLanguageToRomanian() {
		click(languageList);
		click(langRomanian);
	}
	

}
