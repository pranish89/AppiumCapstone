package nonFunctionalTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Swipe {

		
		@SuppressWarnings({ "rawtypes", "deprecation" })
		public void swipe_device(WebDriver driver,String direction)
		{
			System.out.println("swipe_device():dir:" +direction+"'");
			final int animation_time = 500; //ms
			final int press_time =500; //ms
			int edgeborder=10;
			PointOption pointstart,pointend;
			Dimension dim = driver.manage().window().getSize();
			
			pointstart = PointOption.point(dim.width/2, dim.height/2);
			switch(direction)
			{
			case "DOWN":
				pointend =PointOption.point(dim.width/2, dim.height-edgeborder);
				break;
			case "UP":
				pointend = PointOption.point(dim.width/2,edgeborder);
				break;
			case "RIGHT":
				pointend = PointOption.point(dim.width-edgeborder,dim.height/2);
				break;
			case "LEFT":
				pointend = PointOption.point(edgeborder,dim.height/2);
				break;
			default:
				throw new IllegalArgumentException("swipe_device():dir: " +direction +"Not Supported");
			}
			
				
				try
				{
					TouchAction ta = new TouchAction((PerformsTouchActions) driver);
					ta.press(pointstart).waitAction(WaitOptions.waitOptions(Duration.ofMillis(press_time)))
					.moveTo(pointend).release().perform();
					
				}
				catch(Exception e){
					System.err.println(e.getMessage());
					return;
					
				}
				try {
					Thread.sleep(animation_time);
							
				}catch(InterruptedException e) {
					
				}
		}
		
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws MalformedURLException
		{
			WebDriver driver;
			UiAutomator2Options option = new UiAutomator2Options()
					.setDeviceName("HA23P8P0")
					.setPlatformName("Android")
					.setPlatformVersion("15.0")
					.setAutomationName("UiAutomator2")
					.setAppPackage("com.google.android.calendar")
					.setAppActivity("com.google.android.calendar.allinone.AllInOneCalendarActivity")
					.setAutoGrantPermissions(true)
					.setNoReset(true)
					.setFullReset(false);

					//point at the running server
					URL server = new URL("http://127.0.0.1:4723/wd/hub");

					//driver creation
					driver = new AndroidDriver(server,option);

			Swipe s = new Swipe();
			s.swipe_device(driver, "LEFT");
			s.swipe_device(driver, "RIGHT");
			s.swipe_device(driver, "UP");
			s.swipe_device(driver, "DOWN");

		}
	}


