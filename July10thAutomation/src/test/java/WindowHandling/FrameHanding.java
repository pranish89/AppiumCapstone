package WindowHandling;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHanding {
	
	public static void main(String[] args) {

		// Step 1: Show the path of driver
		System.setProperty("webdriver.chrome.driver", "..\\July10thAutomation\\Driver\\chromedriver.exe");

		// Step 2: Invoke light browser
		WebDriver driver = new ChromeDriver();

		// Step 3: Open Facebook login page
		driver.get(
				"https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/interactions/Actions.html");

		// maximize
		driver.manage().window().maximize();

		// shift the focus to packageListFrame
		driver.switchTo().frame("packageListFrame");

		// click on org.openqa.selenium
		driver.findElement(By.xpath("//a[text() = 'org.openqa.selenium']")).click();

		// go back to parent HTML document
		driver.switchTo().defaultContent();

		WebElement packageFrame = driver.findElement(
				By.xpath("//iframe[@title='All classes and interfaces (except non-static nested types)']"));

		// pass the control to the package Frame
		driver.switchTo().frame(packageFrame);

		// click on WebElement option
		driver.findElement(By.xpath("//a[@href='WebElement.html']")).click();

	}

}
