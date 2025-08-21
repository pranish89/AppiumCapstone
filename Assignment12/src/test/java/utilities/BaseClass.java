package utilities;

import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
 private static BaseClass base;    
    private static WebDriver driver ;
    private static Logger logger;
    public final static int TIMEOUT = 2;
     
    private BaseClass() {
       
        driver = new ChromeDriver();
      
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
       // Logger.info("implicit wait for 2 seconds");
        driver.manage().window().maximize();
       
     }
    public static void openPage(String url) {
    	
        driver.get(url);
        logger.info("url page is opened");
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void navBack() {
     driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() {
    	logger= LogManager.getLogger("utilities.BaseClass");
        if (base==null) {
            base = new BaseClass();
            logger.info("Initialized WebDriver");
        }
    }
     public static void exit() {
         if(driver!=null) {
             driver.close();
             driver.quit();
             logger.info("WebDriver instance is closed");
         }
         base = null;
     }
     
     public static String setUserName()
     {
    	 return "Facebook username";//dummy name, not a original username
     }
  
     public static String setPassword()
     {
    	 return "Facebook password";//dummy password , not a original pwd.
     }
}