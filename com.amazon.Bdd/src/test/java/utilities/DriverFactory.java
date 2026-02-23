package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    public static WebDriver initDriver() {
	    	
	    	if(driver.get() == null)
	    	{

	        String browser = ConfigReader.get("browser");

	       if (browser.equalsIgnoreCase("chrome")) {
	            driver.set(new ChromeDriver());
	        }

	        getDriver().manage().window().maximize();
	     //   getDriver().get(ConfigReader.get("url"));
	    }
	        return getDriver();

	    }
	    
	    
	    public static WebDriver getDriver() {
	        return driver.get();
	    }
	    
	    public static void launchApplication() {
	        getDriver().get(ConfigReader.get("url"));
	    }
	    
	    public static void quitDriver() {
	    	if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();
	        }
	    }


		


		

}
