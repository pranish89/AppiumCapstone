package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IrctcWindow {

	public static void main(String[] args) {

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

		if (currentUrl.contains("air")) {
			System.out.println("User is on Flights window");
		} else {
			System.out.println("User is not on Flights window");
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

}
