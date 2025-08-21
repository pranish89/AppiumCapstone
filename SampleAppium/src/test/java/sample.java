import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class sample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver;
		
		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName("HA23P8P0")
				.setPlatformName("Android")
				.setPlatformVersion("15.0")
				.setAutomationName("UiAutomator2")
				.setAppPackage("com.flipkart.android")
				//.setIntentAction("android.intent.action.Main")
				//.setIntentCategory("android.intent.category.LAUNCHER")
				.setAppActivity("com.flipkart.android.activity.HomeFragmentHolderActivity")
				//.setAppPackage("com.android.chrome")
				//.setAppActivity("com.google.android.apps.chrome.Main")
				.setAutoGrantPermissions(true)
				.setNoReset(true)
				.setFullReset(false)
				;
		
		//point at the running server
		URL server = new URL("http://127.0.0.1:4723/wd/hub");

		//driver creation
		driver = new AndroidDriver(server,option);
		

		
		System.out.println("hi");
		

	}

}
