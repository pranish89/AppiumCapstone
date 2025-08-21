package Gestures_touchaction;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class KeyEvents {

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
				.setNoReset(true)//app will not uninstall
				.setFullReset(false)
				
				;		

		//point at the running server
		@SuppressWarnings("deprecation")
		URL server = new URL("http://127.0.0.1:4723/wd/hub");

		//driver creation
		driver = new AndroidDriver(server,option);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Search here']")).click();
		
		//Sending input on the search box
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search here']")).sendKeys("L");
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.N));
		driver.pressKey(new KeyEvent(AndroidKey.D));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.N));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		
		
	

	}

}
