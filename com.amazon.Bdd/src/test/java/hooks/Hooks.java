package hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.DriverFactory;
import utilities.ExtentManager;
import utilities.Screenshotutil;

public class Hooks {
	@Before
    public void setup(Scenario scenario) {
        DriverFactory.initDriver();
        DriverFactory.launchApplication();

        ExtentReports extent = ExtentManager.getInstance();

        ExtentTest test = extent.createTest(scenario.getName());

        // ⭐ THIS IS WHERE WE SET THE TEST
        ExtentManager.setTest(test);
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
        	ExtentManager.getTest().fail("Scenario Failed");

        	String path = Screenshotutil.captureScreenshot(
                    DriverFactory.getDriver(),
                    scenario.getName());
        	
        	 scenario.attach(
        			 Screenshotutil.captureScreenshotBytes(DriverFactory.getDriver()),
                     "image/png",
                     scenario.getName());
        	 
        	 ExtentManager.getTest().addScreenCaptureFromPath(path);
                    }
        else {
            ExtentManager.getTest().pass("Scenario Passed");
        }
        ExtentManager.getInstance().flush();
       DriverFactory.quitDriver();
    }

}
