package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic.Driver;
import Generic.WebDriverCommonLib;
import pageObjectRepositoryLib.Login;

public class FrameWorkTestCaseTest {

	WebDriverCommonLib wlib = new WebDriverCommonLib();

	public  WebDriver driver;

	@Test
	public void facebookloginTest() throws Exception {

		// get browser
		driver = Driver.getBrowser();

		// Login to facebook Application
		Login loginPage = PageFactory.initElements(driver, Login.class);
		loginPage.login(driver);
		wlib.maximize(driver);

		loginPage.createNewAccount(driver);
	}
}
