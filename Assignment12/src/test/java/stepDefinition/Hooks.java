package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.BaseClass;

public class Hooks {
 @Before("@web")
    public static void setUp() {
     
     BaseClass.setUpDriver();
    }
 
    @After
    public static void tearDown(Scenario scenario) {
 
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
        }   
         
        BaseClass.exit();
    }

}
