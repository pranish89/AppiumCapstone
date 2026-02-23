package flipkart;

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
import utilities.Swipe;
import utilities.Tap;
import utilities.Zoom;

public class Payment {
	
	AndroidDriver driver;
	
	@BeforeTest
	public void setupDriver() throws Exception {
		
		Helper.setupDriver();
	}
	
	//@BeforeClass
	public void login() throws Exception
	{
		BaseClass.login();
		
	}
	
	@Test
	public void search_products() throws InterruptedException {
	
	driver=Helper.getDriver();
	System.out.println("Search Products and Payment ");
	Helper.maxImplicitWait();
	
	//finding the categories
	WebElement categories =driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Categories']"));
	categories.click();
	Helper.minImplicitWait();
	
	//finding the Category -->Home
	WebElement home = driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc='Home'])[1]"));
	home.click();
	Helper.minImplicitWait();
	
	//Finding Gas Appliance
	WebElement gas= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Kitchen Storage']"));
	gas.click();
	Helper.maxImplicitWait();
	
	//finding filter
	WebElement filter = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Top Rated ']"));
	filter.click();
	Helper.maxImplicitWait();
	
	//scrolling to find the device
	//Scroll.scrollview(driver);
	
	//finding the stove
	WebElement brand = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='OKASTA Reusable vaccum storage bags Travel Storage Vacuum Bags, Pack of 5']"));
			//+ "fullstar Gas Lighter with Black Matt Finish Steel Gas Lighter, Black, Pack of 2']"));
			//+ "'SURYAVIVA Hose Pipe & Lighter Combo Glass Manual Gas Stove, 2 Burners']"));
	brand.click();
	Helper.maxImplicitWait();
	
	
	//Selecting the image
	WebElement select = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)"));
	
	//Tapping the image for full view
	Tap.tap(driver, select);
	//Zoom.zoomin(driver,pigeon);
	
	Helper.minImplicitWait();
	
	driver.navigate().back();
	
	//Swiping the image left and right
	Swipe.action(driver, "RIGHT");
	Swipe.action(driver, "LEFT");
	
	//Press Buy now button
	
	
	WebElement buy_now = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Buy now']"));
	buy_now.click();
	Helper.minImplicitWait();
	
	WebElement continue_btn = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Continue']"));
	continue_btn.click();
	
	//Check if Address is displayed
	if(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Deliver to: ']")).isDisplayed()){
		
		System.out.println("Address is displayed");
	}
	
	Helper.minImplicitWait();
	
	//Continue for payment
	WebElement continue_btn1= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Continue ']"));
	continue_btn1.click();
	Helper.minImplicitWait();
	
	System.out.println("Payment page is opened");	
	driver.navigate().back();
	driver.navigate().back();

	driver.navigate().back();


}
@AfterClass(alwaysRun=true)
	public void logout() {
		BaseClass.logout();
	}
	
	@AfterTest()
	public void tear_down() {
		Helper.tearDown();
	}
}
