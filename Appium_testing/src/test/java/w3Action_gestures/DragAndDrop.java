package w3Action_gestures;

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

public class DragAndDrop {
	
	public void draganddrop(AndroidDriver driver)
	{
		WebElement source = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement target = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
		Point sourceElementCenter = getCenterOfElement(source.getLocation(), source.getSize());
		Point targetElementCenter = getCenterOfElement(target.getLocation(), target.getSize());
		PointerInput finger1 = new PointerInput (PointerInput.Kind. TOUCH,"finger1");
		Sequence sequence = new Sequence (finger1, 1)
		.addAction (finger1.createPointerMove (Duration.ZERO, PointerInput.Origin.viewport(), sourceElementCenter))
		.addAction (finger1.createPointerDown(PointerInput.MouseButton. LEFT.asArg()))
		.addAction(new Pause(finger1, Duration.ofMillis(588)))
		.addAction(finger1.createPointerMove(Duration.ofMillis(588), PointerInput.Origin.viewport(), targetElementCenter))
		.addAction (finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Collections.singletonList(sequence));
		}
		    private Point getCenterOfElement(Point point, Dimension dimension)
		    {
		    return new Point(point.getX() + dimension.getWidth()/2,
		            point.getY()+ dimension.getHeight()/2);
		    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
