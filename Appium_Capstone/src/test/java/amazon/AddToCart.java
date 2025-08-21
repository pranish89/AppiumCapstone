package amazon;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utilities.Helper;
import utilities.Scroll;
import utilities.Swipe;

public class AddToCart {
	AndroidDriver driver;
	
	@BeforeTest
	public void setupDriver() throws Exception {
		
		Helper.setupDriver();
	}
	
	@BeforeClass
	public void login() throws Exception
	{
		BaseClass.login();
		
	}
	
	@Test
	public void search_products() {
		driver=Helper.getDriver();
		System.out.println("Search Products and Add to Cart");
		
		WebElement categories =driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Categories']"));
		categories.click();
		Helper.minImplicitWait();
		
		
		WebElement electronics =driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Electronics']"));
		electronics.click();
		Helper.minImplicitWait();
		
		WebElement view = driver.findElement(AppiumBy.accessibilityId("View All"));
		view.click();
		Helper.minImplicitWait();
		
		Scroll.scrollview(driver);
		
		WebElement chrome_laptop = driver.findElement(AppiumBy.accessibilityId("Chromebooks"));
		chrome_laptop.click();
		Helper.minImplicitWait();

		
		WebElement select = driver.findElement(AppiumBy.accessibilityId("Lenovo 100e Chromebook Gen 4 MediaTek Kompanio 520 - (4 GB/32 GB EMMC Storage/Chrome OS) 82W00004HA Chromebook"));
		select.click();
		
		Swipe.action(driver, "RIGHT");
		Helper.minImplicitWait();
		Swipe.action(driver, "LEFT");
	}

}
