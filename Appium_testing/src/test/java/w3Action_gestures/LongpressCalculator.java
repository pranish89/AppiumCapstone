package w3Action_gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LongpressCalculator {
	
	public static void longPress (AndroidDriver driver, WebElement element) {
        Point location = element.getLocation();
        Dimension size = element.getSize();
        Point centerOfElement = getCenterOfElement(location, size);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove (Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
//waiting for 2 seconds for longPress on the Element
                .addAction(new Pause(finger1, Duration.ofSeconds(2)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
       
        driver.perform(Collections.singletonList(sequence));
}	
   public static Point getCenterOfElement(Point location, Dimension size)
   {
   return new Point(location.getX() + size.getWidth()/2,
           location.getY()+ size.getHeight()/2);
   }

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName("emulator-5554")
				.setPlatformName("Android")
				.setPlatformVersion("15.0")
				.setAutomationName("UiAutomator2")
				.setAppPackage("com.google.android.calculator")
				.setAppActivity("com.android.calculator2.Calculator");
				
				//point at the running server
				URL server = new URL("http://127.0.0.1:4723/wd/hub");
				
				//driver creation
				AndroidDriver driver = new AndroidDriver(server,option);
				
				System.out.println("Setting launched");
				WebElement element = driver.findElement(AppiumBy.accessibilityId("6"));
					longPress(driver,element);
				
				
			
			


	}

}
