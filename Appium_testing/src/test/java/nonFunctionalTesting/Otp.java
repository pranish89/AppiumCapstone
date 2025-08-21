package nonFunctionalTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Otp {
	
	AndroidDriver driver;
	
	@BeforeClass
	
	public void setup() throws MalformedURLException
	{
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

	
	}
	
	@Test
	public void OpenApp()
	{
		driver.activateApp("com.google.android.apps.messaging");
		//WebElement first_msg = driver.findElement(null)
		//String fullmsg = first_msg.getText();
		String fullmsg="23h23hgehgwgh";
		String otp=verify_otp(fullmsg);
	
	}
	
	public String verify_otp(String fullmsg)
	{
		System.out.println("removing all Alpha from message");
		String parser = fullmsg.replaceAll("[^0-9]", "");
		System.out.println("After Parsing " +parser);
		String otp = parser.substring(0,6);
		System.out.println("Otp " +otp);
		return otp;
	}
	

}
