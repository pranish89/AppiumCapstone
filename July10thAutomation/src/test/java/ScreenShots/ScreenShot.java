package ScreenShots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScreenShot {

	@Test
	public void Screeshots() throws Exception {

		System.setProperty("webdriver.chrome.driver", "..\\July10thAutomation\\Driver\\chromedriver.exe");

		// Launch the empty browser.
		
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("");

		WebDriver driver = new ChromeDriver();

		// Launch the URL

		driver.get("https://gmail.com");

		// to create a random name for each screenshot
		// Date date = wLib.timeStamp();

		// Call TakesScreenShot function

		takeSnapShot(driver, "D:\\Eclipse Workspace\\July10thAutomation\\ScreenShots\\screenshot.png");

	}

	public static void takeSnapShot(WebDriver driver, String filePath) throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(filePath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);
		
		Actions action = new Actions(driver);
		action.
		

	}

}