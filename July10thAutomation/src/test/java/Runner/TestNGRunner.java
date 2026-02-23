package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\features", glue = "stepDefinitions", tags = "@Tag")
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
