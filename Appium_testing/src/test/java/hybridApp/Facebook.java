package hybridApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Facebook {

	static AndroidDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup()throws MalformedURLException {
		UiAutomator2Options option = new UiAutomator2Options()
				.setChromedriverExecutable("D:\\Appium\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe")
				.setDeviceName("HA23P8P0")
				.setPlatformName("Android")
				.setPlatformVersion("15.0")
				.setAutomationName("UiAutomator2")
				.setAppPackage("com.android.chrome")
				.setAppActivity("com.google.android.apps.chrome.Main")
				.setAutoGrantPermissions(true)
				.setNoReset(true)
				.setFullReset(false)
				;

				//point at the running server
				URL server = new URL("http://127.0.0.1:4723/wd/hub");

				//driver creation
				driver = new AndroidDriver(server,option);
					}
	@Test(priority=1)
	public void enterUrl() throws InterruptedException {
		
		WebElement search = driver.findElement(AppiumBy.
				By.id("com.android.chrome:id/search_box_text"));
		//WebElement search = driver.findElement(By.xpath("//android.widget.EditText[@text = 'Search or type URL']"));
		search.click();
		Thread.sleep(3000);
		WebElement edit_box=driver.findElement(By.id("com.android.chrome:id/url_bar"));
		edit_box.sendKeys("facebook.com");
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(3000);

		}

		@Test(priority=2)
		public void hybridInteract() throws InterruptedException{
			Set<String> ls = driver.getContextHandles();
			System.out.println(ls);
			driver.context("WEBVIEW_chrome");
			System.out.println("Context switched");
			WebElement email = driver.findElement(By.id("m_login_email"));
			WebElement pass = driver.findElement(By.id("m_login_password"));
					WebElement submit=driver.findElement(By.xpath("//*[@id='login_password_step_element']/button"));
					email.sendKeys("tamizh selva");
					pass.sendKeys("tamizh@123");
					driver.pressKey(new KeyEvent(AndroidKey.ENTER));
					Thread.sleep(3000);
					submit.click();	
					driver.context("NATIVE_APP");
					
			}
		
	@AfterClass
	public void close()
	{
		driver.quit();
		
	}



}
