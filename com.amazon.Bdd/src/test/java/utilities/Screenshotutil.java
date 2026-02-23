package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotutil {
	private static final Logger log = LogManager.getLogger(Screenshotutil.class);

    public static String captureScreenshot(WebDriver driver, String scenarioName) {

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String path = System.getProperty("user.dir")
                + "/target/screenshots/"
                + scenarioName.replaceAll(" ", "_")
                + "_" + timestamp + ".png";

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File(path);

            dest.getParentFile().mkdirs();
            FileUtils.copyFile(src, dest);

            log.info("Screenshot captured: " + path);

        } catch (IOException e) {
            log.error("Failed to capture screenshot", e);
        }

        return path;
    }
    public static byte[] captureScreenshotBytes(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
