package stepDefinition;

import org.openqa.selenium.By;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.BaseClass;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class StepDefinition {
	WebDriver driver;
	WebElement uid;
	WebElement pass;
	WebElement loginBtn;
	WebElement errUsername;
	WebElement errPassword;
	private Logger logger;
	

	@Given("User Launches Chrome Browser")
	public void launchBrowser() {
		BaseClass.setUpDriver();
		driver = BaseClass.getDriver();
    	logger= LogManager.getLogger(this.getClass().getName());


	}

	@When("User opens facebook  portal link")
	public void launchUrl() {

		driver.get("https://www.facebook.com");
		logger.info("Launching the facebook url");
	}

	@Then("User should see the  page title")
	public void verifyTitle() {
		String title = driver.getTitle();
		if (title.contains("facebook")) {
			logger.info("Facebook login page is displayed");
		}
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String password) {
		uid = driver.findElement(By.cssSelector("input[name='email']"));
		pass = driver.findElement(By.cssSelector("input[name='pass']"));
		loginBtn = driver.findElement(By.cssSelector("button[name='login']"));
		String user = "";
		String pwd = "";

		if (userName.equalsIgnoreCase("Valid") && password.equalsIgnoreCase("Valid")) {
			user = BaseClass.setUserName();
			pwd = BaseClass.setPassword();
			uid.sendKeys(user);
			pass.sendKeys(pwd);
		} else if (!(userName.isEmpty()) && password.isEmpty()) {
			user = BaseClass.setUserName();
			pwd = "";
			uid.sendKeys(user);
			pass.sendKeys(pwd);
		}

		else if (userName.isEmpty()) {
			user = "";
			pwd = "";
			uid.sendKeys(user);
			pass.sendKeys(pwd);
			// System.out.println("Username or password is null");
		}
		logger.info("User Name: " + user);
		logger.info("Password: " + pwd);

	}

	@Then("User clicks on Login button with expected status as {string}")
	public void user_clicks_on_login_button(String Status) {
		loginBtn.click();
		errUsername = driver.findElement(By.xpath("//div[contains(text(),'username')]"));
		errPassword = driver.findElement(By.xpath("//div[contains(text(),'password')]"));

		if (Status.equalsIgnoreCase("Both Fail") || Status.equalsIgnoreCase("Missing Password")) {

			String userNameValMessage = errUsername.getText();

			Assert.assertEquals("Invalid username or password", userNameValMessage);
			System.out.println("Test Failed");
			// Assert.assertEquals("The password that you've entered is incorrect.",
			// pwdValMessage);
			 logger.info(userNameValMessage);
			return;
		}
	}

	@Then("User should see the Facebook Home page on successful login status {string}")
	public void user_should_see_the_facebook_home_page_on_successful_login_status(String status)
			throws InterruptedException {

		if (status.equalsIgnoreCase("Pass")) {
			// Assert.assertEquals(driver.getTitle(), "Facebook");
			System.out.println("Login Passed");

		}
	}
}