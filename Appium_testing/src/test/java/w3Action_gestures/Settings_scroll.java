package w3Action_gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Settings_scroll {
	
	public static void scroll(AndroidDriver driver)
	{
		Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.25);
        PointerInput finger1 = new PointerInput (PointerInput.Kind. TOUCH,"finger1");
        Sequence sequence= new Sequence(finger1,1)
        .addAction (finger1.createPointerMove (Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
        .addAction (finger1.createPointerDown (PointerInput.MouseButton. LEFT.asArg()))
        .addAction (new Pause (finger1, Duration.ofMillis(3000)))
        .addAction(finger1.createPointerMove (Duration.ofMillis(3000), PointerInput. Origin.viewport(), endX, endY))
        .addAction (finger1.createPointerUp (PointerInput.MouseButton.LEFT.asArg()));
        
        driver.perform(Collections.singletonList(sequence));
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
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
					scroll(driver);
			// TODO Auto-generated method stub

	}

}
