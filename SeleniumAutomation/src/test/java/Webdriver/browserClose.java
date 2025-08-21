package Webdriver;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class browserClose {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mages\\eclipse-workspace\\Drivers\\chromedriver.exe");
		
		//Launch empty browser
		driver = new ChromeDriver();
		
		//After launching maximize the window
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.className("gLFyf"));
		element.sendKeys("edureka");
		element.submit();
		WebElement element1 = driver.findElement(By.xpath("//a[contains(@href,'www.edureka.co')]"));
		element1.click();
		
		//opening a new tab....... Window types are TAB &vWindow
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.facebook.com");
		
		//Getting all the window handles
		Set<String> window = driver.getWindowHandles();
		
		//Iterating the window set
		Iterator<String> it = window.iterator();
		
		//Getting the parent window name
		String parentWinId = it.next();
		String childWinId =it.next();
		
		//Switching to Parent window
		driver.switchTo().window(parentWinId);
		
		//Waiting time to visually see if the control in parent window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.switchTo().window(childWinId);
		//close the current tab
		driver.close();
		//close all tabs
		driver.quit();
				
        

	}

}
