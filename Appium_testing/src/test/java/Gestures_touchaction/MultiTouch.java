package Gestures_touchaction;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MultiTouch {
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
		
		TouchAction t1 = new TouchAction(driver)
				.tap(PointOption.point(459,829))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
				//.moveTo(PointOption.point(815,1144))
				.release().perform();
		TouchAction t2 = new TouchAction(driver)
				.tap(PointOption.point(946,1182))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
				//.moveTo(PointOption.point(621,1235))
				.release().perform();
		//MultiTouchAction action = new MultiTouchAction(driver);
		//action.add(t1).add(t2).perform();
		

	}

}
