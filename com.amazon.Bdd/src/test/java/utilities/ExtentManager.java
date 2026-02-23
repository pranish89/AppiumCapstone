package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();


    public static ExtentReports getInstance() {

        if (extent == null) {
            extent = new ExtentReports();
            ExtentSparkReporter spark =
                new ExtentSparkReporter("target/ExtentReport.html");
            extent.attachReporter(spark);
        }
        return extent;
        
    }
        
        public static void setTest(ExtentTest extentTest) {
            test.set(extentTest);
        }

        public static ExtentTest getTest() {
            return test.get();
        }
    }


