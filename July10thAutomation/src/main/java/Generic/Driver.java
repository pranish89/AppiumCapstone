package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
	
	public static WebDriver driver;

	public static WebDriver getBrowser() {

		if (Constants.browser.equalsIgnoreCase("chrome")) {

			// Step 1: Show the path of driver
			System.setProperty("webdriver.chrome.driver", Constants.driverPath + "chromedriver.exe");

			// Step 2: Invoke light browser
			driver = new ChromeDriver();

		} else if (Constants.browser.equalsIgnoreCase("firefox")) {

			// Step 1: Show the path of driver
			System.setProperty("webdriver.firefox.driver", Constants.driverPath + "geckoDriver.exe");

			// Step 2: Invoke light browser
			driver = new FirefoxDriver();

		} else if (Constants.browser.equalsIgnoreCase("safari")) {

			// Step 1: Show the path of driver
			System.setProperty("webdriver.safari.driver", Constants.driverPath + "safariDriver.exe");

			// Step 2: Invoke light browser
			driver = new SafariDriver();
		}

		
		return driver;
	}

}
