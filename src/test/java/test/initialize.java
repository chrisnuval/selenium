package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class initialize {
	public static WebDriver driver = null;
	

	
	@BeforeMethod
	public void initializeTest() throws IOException{
		String PAGE_URL="https://bank.paysera.com/en/login";
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-workspace\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(PAGE_URL);
	}
	
	@AfterMethod
	public void Teardown()
	{
		initialize.driver.quit();
	}
}
