package w3Action_gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TapMaps {
	
	public static void tap (AndroidDriver driver, Point p) {
        //Point location = element.getLocation();
       // Dimension size = element.getSize();
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        System.out.println(finger1);
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), p))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofSeconds(20)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
       
        driver.perform(Collections.singletonList(sequence));
}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName("emulator-5556")
				.setPlatformName("Android")
				.setPlatformVersion("16.0")
				.setAutomationName("UiAutomator2")
				.setAppPackage("com.google.android.apps.maps")
				.setAppActivity("com.google.android.maps.MapsActivity")
				.setAutoGrantPermissions(true)//to accept alerts
				.setNoReset(true)
				.setFullReset(false)
				;
				
				//point at the running server
				URL server = new URL("http://127.0.0.1:4723/wd/hub");
				
				//driver creation
				AndroidDriver driver = new AndroidDriver(server,option);
				
				System.out.println("Setting launched");
				Point p = new Point(304,371);
				tap(driver,p);
				System.out.println("Tap done");
				
				
			
			


	}

}
