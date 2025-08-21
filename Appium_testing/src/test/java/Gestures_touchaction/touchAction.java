package Gestures_touchaction;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class touchAction {
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver;
		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName("emulator-5554")
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
		
		//WebElement element = driver.findElement(AppiumBy.)
		
		TouchAction ta = new TouchAction(driver);
		//Tap_calculator Action
		ta.tap(PointOption.point(427,854)).perform();
		System.out.println("Tap_calculator on United States");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Long Press
		ta.longPress(PointOption.point(445,1136)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();
		System.out.println("Long press on Mexico is done");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
		//Tap_calculator on direction button
	
	//Sliding- move from one place to another
	ta.tap(PointOption.point(371,1073)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
	.moveTo(PointOption.point(727,1059))
	.release()
	.perform();
	System.out.println("movement from algeria to kenya");
	}
	
}
