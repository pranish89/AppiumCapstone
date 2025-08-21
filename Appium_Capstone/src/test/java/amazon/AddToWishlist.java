package amazon;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import utilities.Helper;
import utilities.Scroll;

public class AddToWishlist {
	
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
	public void search_by_image() {
		driver=Helper.getDriver();
		System.out.println("search Products and Add to wishlist");
		Helper.minImplicitWait();
		WebElement categories =driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Categories']"));
		categories.click();
		Helper.minImplicitWait();
		WebElement appliances = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Appliances']"));
		appliances.click();
		Helper.minImplicitWait();
		Scroll.scrollview(driver);
		WebElement QLED = driver.findElement(AppiumBy.accessibilityId("QLED TVs"));
		QLED.click();
		Helper.maxImplicitWait();
		WebElement device= driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(2)"));
		device.click();
		Helper.maxImplicitWait();

		WebElement wishlist = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(4)"));
		wishlist.click();
	}
	@AfterClass
	public void logout() {
		
		BaseClass.logout();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		Helper.tearDown();
		
	}

}
