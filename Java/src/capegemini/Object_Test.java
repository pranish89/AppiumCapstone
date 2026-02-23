package capegemini;

import java.util.Objects;

public class Object_Test {
	
	public static int count =0;
	
	public Object_Test()
	{
	count++;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object_Test t1 = new Object_Test();
		Object_Test t2 = new Object_Test();
		Object_Test t3 = new Object_Test();
		Object_Test t4 = new Object_Test();
System.out.println(count);
		//Objects.
	}

}

//driver.findelements(By.xpath("//span[@data-testid='price-and-discounted-price']")
//driver.getcontexthandles();
//driver.context("WEBVIEW_chrome");
//driver.context("NATIVE_APP");


/*public void scroll(WebDriver driver)
{
	Dimension dim = driver.windows.getsize();
	int startx = dim.getwidth()/2;
	int starty = dim.get.height()/2;
	int endx = dim.getwidth()/2;
	int endy = dim.getheight()-0.25;
	
	PointerInput finger1 = new PointerInput(PointerInput.Kind.Touch);
	Sequence seq = new Sequence(finger1,1).
	addaction(finger1,createpointermove(Duration.Zero,PointerInput.origin.viewport,startx,starty)
	.addaction(createpointerdown(PointInput.Left.asArg())
	.addAction(new Pause(Duration.ofSeconds(3))
	.addAction(finger1,createpointermove(Duration.Zero,PointerInput.origin.viewport,endx,endy)
	.addaction(createpointerup(PointInput.Left.asArg());
	
	driver.perform(collections.singletonList(sequence))
	
}*/