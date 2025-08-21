package co.edurekatraining;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class NewTest {	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() {
		// Set the System property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mages\\eclipse-workspace\\Drivers\\chromedriver.exe");
				
				//Launch empty browser
				 driver = new ChromeDriver();
				
				//After launching maximize the window
				driver.manage().window().maximize();
				
				//Launch the facebook
				driver.get("https://www.facebook.com");
				
				//Wait for the page to load
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				System.out.println("Executing BeforeMethod");
				
		
	}

	@Test
	public void methodOne() {
		// Step 5: Capture the email
		WebElement email = driver.findElement(By.id("email"));

		// Step 6: check the email box and enter email
		email.click();
		email.clear();
		email.sendKeys("rakeshsinghrakz");
		
		// step 7: capture password edit box
		WebElement password = driver.findElement(By.name("pass"));
		SoftAssert a = new SoftAssert();
		System.out.println("***Checking if the password field is displayed");
		a.assertEquals(password.isDisplayed(), true);
		System.out.println("***Checking if the password field is enabled");
		a.assertEquals(password.isEnabled(), true);
		a.assertAll();

		// step 8: enter valid password in the edit box
		password.sendKeys("Hakoonamatata");
		
		// Step 9: click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("Executing AfterMethod");
		
		
	}

}
