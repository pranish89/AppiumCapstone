package com.Edureka.Appium_testing;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class setup_appium {
	
	@SuppressWarnings("deprecation")
	public static void setup() throws MalformedURLException
	{
	UiAutomator2Options option = new UiAutomator2Options()
			.setDeviceName("emulator-5554")
			.setPlatformName("Android")
			.setPlatformVersion("15.0")
			.setAutomationName("UiAutomator2")
			.setAppPackage("com.android.settings")
			.setAppActivity("com.android.settings.Settings");
			
			//point at the running server
			URL server = new URL("http://127.0.0.1:4723/wd/hub");
			
			//driver creation
			AndroidDriver driver = new AndroidDriver(server,option);
			
			System.out.println("Setting launched");
	}
			
			

	public static void main(String[] args) throws MalformedURLException {
		
		setup();
		
		//driver.quit();
		
	/*	AndroidDriver driver;
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "sdk_gphone64_x86_64");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "15.0");
		//cap.setCapability("app", "D:\\Appium\\Calculator.apk");
		cap.setCapability("appPackage", "com.android.settings");
		cap.setCapability("appActivity", "com.android.settings.Settings");
		URL url = new URL("http://127.0.0.1:4723") ;
		driver = new AndroidDriver(url,cap);	
*/
	}

}
