package nonFunctionalTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Object;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Screenshot {
	
	static AndroidDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup()throws MalformedURLException {
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
				

	}
	
	@Test
	public void screenshot()
	{
		String dest_path = "19Jun2025";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateformat= new SimpleDateFormat("dd-MMM-YYYY_hh_mm_ssaa");
		new File(dest_path).mkdirs();
		String dest_file = dateformat.format(new Date()) + ".png";
		//try {
		FileUtils.copyFile(src, dest_file);
		
		}
		
	}

}
	