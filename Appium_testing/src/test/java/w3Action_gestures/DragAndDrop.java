package w3Action_gestures;

public class DragAndDrop {
	
	draganddrop()
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
		    private Point getCenterOfElement(Point location, Dimension size)
		    {
		    return new Point(location.getX() + size.getWidth()/2,
		            location.getY()+ size.getHeight()/2);
		    }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
