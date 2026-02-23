package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	WebDriver driver = new ChromeDriver();

	@Before("@webAppTest")
	public void beforeMethod() {
		driver.get("https://facebook.com");
		System.out.println("Running @Before webapp method");
	}

	@After("@webAppTest")
	public void afterMethod() {
		driver.quit();
		System.out.println("Running in @After weapp method");
	}

	@Before("@MobileApp")
	public void beforeMobileMethod() {
		System.out.println("Running @Before mobile method");
	}

	@After("@MobileApp")
	public void afterMobileMethod() {
		System.out.println("Running in @After mobile method");
	}

}
