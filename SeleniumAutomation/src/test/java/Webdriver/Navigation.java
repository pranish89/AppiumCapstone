package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mages\\eclipse-workspace\\Drivers\\chromedriver.exe");
		
		//Launch empty browser
		WebDriver driver = new ChromeDriver();
		
		//After launching maximize the window
		driver.manage().window().maximize();
		
		//Launch the rediff
		driver.get("https://www.google.com");
		
		
		
	}

}
