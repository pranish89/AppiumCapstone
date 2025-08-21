package co.edurekatraining;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import co.edurekatraining.Page_Object;

public class Test_POM {

	public static void main(String[] args) {
		// Set the System property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mages\\eclipse-workspace\\Drivers\\chromedriver.exe");
		
		//Launch empty browser
		WebDriver driver = new ChromeDriver();
		
		//After launching maximize the window
		driver.manage().window().maximize();
		
		//Launch the rediff
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Wait for the page to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Create the object for Page_Object class and passing the driver as object
		Page_Object object1 = new Page_Object(driver);
		
		//using findElement method
		WebElement uid = driver.findElement(object1.username);		
		WebElement pwd = driver.findElement(object1.password);
		WebElement signin_btn = driver.findElement(object1.signin);
		uid.sendKeys("Admin");
		System.out.println(" Logged in to Rediff successfully");
		pwd.sendKeys("admin123");
		signin_btn.click();
		
		
		
		
	}

}
