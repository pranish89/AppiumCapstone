package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlingTest {
	@Test(groups = {"Regression Test"})
	public void irctcWindowTest() {

		// Step 1: Show the path of driver
		System.setProperty("webdriver.chrome.driver", "..\\July10thAutomation\\Driver\\chromedriver.exe");

		// Step 2: Invoke light browser
		WebDriver driver = new ChromeDriver();

		// Step 3: navigate to irctc webpage
		driver.get("https://irctc.co.in");

		// maximize the window
		driver.manage().window().maximize();

		// get the current window id -
		String parent = driver.getWindowHandle();
		System.out.println("parent window = " + parent);

		// click on flights option from menu
		driver.findElement(By.xpath("//a[@href='https://www.air.irctc.co.in' and contains(text(), 'FLIGHTS')]"))
				.click();

		// use of data Structure which does not allow duplicate values
		Set<String> set = driver.getWindowHandles();
		System.out.println(set);

		// Iterator Interface methods

		Iterator<String> it = set.iterator();
		String parentWindowId = it.next();
		boolean status = it.hasNext();
		System.out.println("Do we have next window Id = " + status);

		String flightWindowid = it.next();
		boolean status2 = it.hasNext();
		System.out.println("Do we have next window Id as well = " + status2);

		// Switch control to Flights window
		driver.switchTo().window(flightWindowid);
		System.out.println("Focus has been shifted from parent to flihts window");

		// check if you are on Flights window or not
		String currentUrl = driver.getCurrentUrl();

		if (currentUrl.contains("airo")) {
			System.out.println("User is on Flights window");
		} else {
			System.out.println("User is not on Flights window");
			System.out.println(10/0);
		}

		driver.close();

		// regain the focus -
		driver.switchTo().window(parentWindowId);

		String currentTitle = driver.getTitle();
		if (currentTitle.contains("IRCTC Next Generation eTicketing System")) {
			System.out.println("user is on parnet window of Train booking");
		} else {
			System.out.println("Selenium focus is still lost");
		}

		driver.quit();
	}

	@Test(groups = {"Smoke Test"})
	public void alertTest() {
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
		// alert.sendKeys("hakoonamatata");

		// accept the alert
		// alert.accept();

		// how to get the message form alert
		String message = alert.getText();
		System.out.println("Alert Message = " + message);

		// dismiss the alert
		alert.dismiss();
		
		driver.quit();

	}
}
