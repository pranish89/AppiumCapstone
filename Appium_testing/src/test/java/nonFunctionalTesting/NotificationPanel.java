package nonFunctionalTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class NotificationPanel {

	public static AndroidDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {

		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName("HA23P8P0")
				.setPlatformName("Android")
				.setPlatformVersion("15.0")
				.setAutomationName("UiAutomator2")
				.setAppPackage("com.google.android.youtube")
				.setAppActivity("com.google.android.youtube.app.honeycomb.Shell$HomeActivity")
				.setAutoGrantPermissions(true)
				.setNoReset(true)
				.setFullReset(false);

				//point at the running server
				URL server = new URL("http://127.0.0.1:4723/wd/hub");

				//driver creation
				driver = new AndroidDriver(server,option);

				NotificationPanel notify = new NotificationPanel();
				//notify.OpenNotificationPanel();
				//notify.Data_Off();
				//notify.Wifi_Off();
				//notify.youtube_net_off();
				//notify.LocationServices();
				//notify.LockDevice();
				//notify.UnlockDevice();
				//notify.rotate();
				notify.BatteryInfo();
				driver.quit();

	}
	
	public void BatteryInfo()
	{
		AndroidBatteryInfo b = driver.getBatteryInfo();
		System.out.println("Android Battery info " +b.getLevel() +"," +b.getState());
		double min=0.25;
		String state = "CHARGING";
		boolean var = true;
		boolean health_check = (b.getLevel()>min && state.equals(b.getState().toString()));
		Assert.assertEquals(health_check, var, "Does not match");
		SoftAssert a= new SoftAssert();
		
	}
	
	public void rotate() {
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.rotate(ScreenOrientation.PORTRAIT);

	}
	
	public void LockDevice()
	{
		driver.lockDevice(Duration.ofSeconds(5));
	}
	
	public void UnlockDevice()
	{
		driver.unlockDevice();
	}

	public void LocationServices()
	{
		driver.toggleLocationServices();
	}
	public void OpenNotificationPanel()
	{
		driver.openNotifications();
		System.out.println("Notification Panel is opened");

	}
	
	public void Wifi_Off()
	{
		driver.toggleWifi();
	}

	public void Data_Off()
	{
		driver.toggleData();
	}
	
	public void youtube_net_off()
	{
		System.out.println("Youtube app is opened");
		WebElement search = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Search']"));
		search.click();
		WebElement search_edit = driver.findElement(AppiumBy.id("com.google.android.youtube:id/search_edit_text"));
		search_edit.sendKeys("edureka");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.toggleWifi();
		//WebElement link = driver.findElement(AppiumBy.accessibilityId("AWS Full Course - Solutions Architect [9 Hours] | AWS Certified Solutions Architect [2025] | Edureka – – Go to channel – edureka! - 47 watching - Live – play video"));
		//link.click();
		
	}
}
