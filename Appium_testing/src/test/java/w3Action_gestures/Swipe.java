package w3Action_gestures;

import org.openqa.selenium.Dimension;

public class Swipe {
swipe()
{
	Dimension size = driver.manage().window().getSize();
    int startX = size.getWidth() / 2;
    int startY = size.getHeight() / 2;
    int endX = (int)(size.getWidth() * 0.25);
    int endY = startY;
    PointerInput finger1 = new PointerInput (PointerInput.Kind. TOUCH,"finger1");
    Sequence sequence= new Sequence(finger1,1)
    .addAction (finger1.createPointerMove (Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
    .addAction (finger1.createPointerDown(PointerInput.MouseButton. LEFT.asArg()))
    .addAction (new Pause (finger1, Duration.ofMillis(200)))
    .addAction(finger1.createPointerMove (Duration.ofMillis(100), PointerInput. Origin.viewport(), endX, endY))
    .addAction (finger1.createPointerUp (PointerInput.MouseButton.LEFT.asArg()));
    driver.perform(Collections.singletonList(sequence));
}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
