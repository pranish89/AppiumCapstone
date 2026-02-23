package Parallel_Testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import junit.framework.Assert;

public class Maps {

	AndroidDriver driver;
	@Parameters({"deviceName","version","url"})
	@BeforeClass 
	public void setup(String deviceName,String version,String url) throws MalformedURLException, InterruptedException {
		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName(deviceName)
				.setPlatformName("Android")
				.setPlatformVersion(version)
				.setAutomationName("UiAutomator2")
				.setAppPackage("com.google.android.apps.maps")
				.setAppActivity("com.google.android.maps.MapsActivity")
				.setAutoGrantPermissions(true)//to accept alerts
				.setNoReset(true)
				.setFullReset(false)
				;		

		//point at the running server
		@SuppressWarnings("deprecation")
		URL server = new URL(url);

		//driver creation
		driver = new AndroidDriver(server,option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//driver.quit();
	}


	@Test(priority = 1)
	public void search_maps() {		
		String Actual="";
		//Finding the search box
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Search here']")).click();
		
		//Sending input on the search box
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text='Search here']")));
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search here']")).sendKeys("London");	
		List<WebElement> results = driver.findElements(By.xpath("//*[@class = 'android.support.v7.widget.RecyclerView']//child::*"));
		for(WebElement temp:results)
		{
			if(temp.getText().contains("London"))
			{
				temp.click();
				Actual = temp.getText();
				break;

			}

		}
		//HArd Assert
		/*Assert.assertEquals("Destination does not match","London",Actual);
		System.out.println(Actual +"Hard Assert Passed");*/
		//Assert.assertEquals(expected, actual);
	

		//Soft Assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Actual, "Lodon", "Does'nt match");
		//soft.assertEquals(actual,expected);
		//soft.assertEq
		System.out.println("Soft assert executed");



		//	String s = driver.findElement(By.xpath("//android.widget.EditText[@text='Search here']")).getAttribute("text");
		//System.out.println(s);


	}

	@AfterClass
	public void driver_close()
	{
		driver.quit();
	}



}
