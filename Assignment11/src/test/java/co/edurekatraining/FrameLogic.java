package co.edurekatraining;

import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Setting up the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mages\\eclipse-workspace\\Drivers\\chromedriver.exe");

		// Step 2: launching the empty or light browser
		WebDriver driver = new ChromeDriver();

		// Step 3: maximize the browser
		driver.manage().window().maximize();
		System.out.println("The Window has been maximized");

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step 4: Open Facebook Url
		driver.get("https://docs.oracle.com/javase/7/docs/api");

		// Capture the iframe as list of WebElement
		List<WebElement> iframe = driver.findElements(By.tagName("frame"));

		// Printing the total number of frames
		System.out.println("Total No of frames " + iframe.size());

		// switch the focus to 1st frame package
		driver.switchTo().frame("packageListFrame");

		// Finding all the links in package frame
		// Get all the available Links
		List<WebElement> link1 = driver.findElements(By.tagName("a"));

		// Printing all the links
		System.out.println("Number of links in the package frame " + link1.size());

		// Iterating through all the Links and printing link
		// text
		for (WebElement link : link1) {
			System.out.println(link.getText());
			
		}
		// switch the focus to 2nd frame All Classes
		System.out.println("**************************************************************************************");
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		driver.switchTo().frame(frame2);

		// Finding all the links in All Classes frame // Get all the available Links
		List<WebElement> link2 = driver.findElements(By.tagName("a"));

		// Printing all the links
		System.out.println("Number of links in the All Classes frame " + link2.size());

		// Iterating through all the Links and printing link // text for (WebElement
		for (WebElement link : link2) {
			System.out.println(link.getText());
		}

		// 3. switch the focus to 2nd frame Overview
		System.out.println("**************************************************************************************");
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@name='classFrame']"));
		driver.switchTo().frame(frame3);

		// Finding all the links in Overview frame
		// Get all the available Links
		List<WebElement> link3 = driver.findElements(By.tagName("a"));

		// Printing all the links
		System.out.println("Number of links in the Overview frame " + link3.size());

		// Iterating through all the Links and printing link
		// text
		for (WebElement link : link3) {
			System.out.println(link.getText());
			/*try
			{
				PrintStream ps = new PrintStream(new File("C:\\Users\\mages\\eclipse-workspace\\Assignment11\\Results\\frame1.txt"));
				System.setOut(ps);
				ps.print(link.getText());
				
			}
			catch(FileNotFoundException ft) {
				System.out.println(ft);
			}*/

		}

		driver.close();

	}

}
