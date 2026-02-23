package com.Edureka.Appium_testing;

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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import junit.framework.Assert;

public class Maps {

	AndroidDriver driver;

	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {
		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName("HA23P8P0")
				.setPlatformName("Android")
				.setPlatformVersion("15.0")
				.setAutomationName("UiAutomator2")
				.setAppPackage("com.google.android.apps.maps")
				.setAppActivity("com.google.android.maps.MapsActivity")
				.setAutoGrantPermissions(true)//to accept alerts
				.setNoReset(true)
				.setFullReset(false)
				
				;		

		//point at the running server
		@SuppressWarnings("deprecation")
		URL server = new URL("http://127.0.0.1:4723/wd/hub");

		//driver creation
		driver = new AndroidDriver(server,option);
		//driver.resetInputState();
		//driver.runAppInBackground(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//driver.quit();
	}


	@Test
	public void search_maps() {		
		String Actual="";
		//Finding the search box
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Search here']")).click();
		
		//Sending input on the search box
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.
				elementToBeClickable(By.xpath("//android.widget.EditText[@text='Search here']")));
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

		//Soft Assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Actual, "Lodon", "Does'nt match");
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
