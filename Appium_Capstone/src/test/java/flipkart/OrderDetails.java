package flipkart;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import utilities.Helper;

public class OrderDetails {
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
	public void order_details() {
		driver= Helper.getDriver();
		WebElement account = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Account']"));
		account.click();
		Helper.minImplicitWait();
		
		WebElement orders = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Orders']"));
		orders.click();
		
		System.out.println("order details page displayed");
		driver.navigate().back();

		

	}

}
