package WindowHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {

		// Step 1: Show the path of driver
		System.setProperty("webdriver.chrome.driver", "..\\July10thAutomation\\Driver\\chromedriver.exe");

		// Step 2: Invoke light browser
		WebDriver driver = new ChromeDriver();

		// Step 3: Open Facebook login page
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		// maximize
		driver.manage().window().maximize();

		// capture button - "Click on JS prompt"
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		// write something in Alert -
		Alert alert = driver.switchTo().alert();

		// write something in alert dialog box
		//alert.sendKeys("hakoonamatata");

		// accept the alert
		//alert.accept();
		
		//how to get the message form alert
		String message= alert.getText();
		System.out.println("Alert Message = "+message);
		
		//dismiss the alert
		alert.dismiss();

	}

}
