package WebDriverAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * With this WebDrier API we get the control of the browser and can perform all
 * the browser related activities.
 * 
 * @author Rakesh
 *
 */
public class WebDriverAPI {

	public static void main(String[] args) {

		// Step 1: Show the path of driver
		System.setProperty("webdriver.chrome.driver", "..\\July10thAutomation\\Driver\\chromedriver.exe");

		// Step 2: Invoke light browser
		WebDriver driver = new ChromeDriver();

		// Step 3: Open Facebook login page
		driver.get("https://www.facebook.com");

		// Step 4: maximize the application
		driver.manage().window().maximize();

		// Step 5: navigate to amazon page
		driver.navigate().
		to("https://amazon.in");

		// Step 6: verify is the user is on Amazon page
		String title = driver.
				getTitle();
		System.out.println("Title = " + title);
		
		//verification
		if(title.contains("Amazon")) {
			System.out.println("User is on Amazon page"); 
		} else {
			System.out.println("User is not on Amazon page");
		}
		
		//Step 7: Go back to the facebook page
		driver.navigate().back();
		
		//Step 8: verify on which page user is currently
		String currenturl = driver.getCurrentUrl();
		
		System.out.println("Currenturl = "+currenturl);
		
		//verification
		if(currenturl.contains("facebook")) {
			System.out.println("User is on facebook page, Test Case =  PASS"); 
		} else {
			System.out.println("User is not on facebook page, Test Case =  FAIL"); 
		}
		
		//Step 9: refresh the page
		driver.navigate().refresh();
		
		//Step 10: delete all cookies
		driver.manage().deleteAllCookies();
		
		//Step 11:  get the entire HTML source code in console
		 String pageSource= driver.getPageSource();
		 
		 System.out.println(pageSource);
		
		//Step 12: close the entire browser
		driver.quit();

	}

}
