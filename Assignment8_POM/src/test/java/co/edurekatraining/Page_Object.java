package co.edurekatraining;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Page_Object {
	
	WebDriver driver;
	
	//constructor
	public Page_Object(WebDriver driver)
	{
		this.driver=driver;
		
	}

	//By class locator
	By username = By.id("login1");
	By password = By.id("password");
	By signin = By.className("signinbtn");
	
}
