import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private static final ThreadLocal<WebDriver> threaddriver = new ThreadLocal<>();
	
	public static WebDriver getDriver()
	{
		return threaddriver.get();
	}
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		threaddriver.set(driver);
	}
	
	@AfterClass()
	public void tearDown()
	{
		if(getDriver()!=null)
		{
			getDriver().quit();
			threaddriver.remove();
		}
	}
	
	

}
