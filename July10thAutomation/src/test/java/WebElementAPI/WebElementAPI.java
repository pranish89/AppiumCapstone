package WebElementAPI;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebElementAPI {

	static String expectedName = "Rakesh Singh";
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		// Step 1: Show the path of driver
		System.setProperty("webdriver.chrome.driver", "..\\July10thAutomation\\Driver\\chromedriver.exe");

		// Step 2: Invoke light browser
		driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step 3: Open Facebook login page
		driver.get("https://www.facebook.com");

		// Java Wait statement -
		Thread.sleep(3000);
		// Step 4: maximize the window
		driver.manage().window().maximize();

		// Step 5: Capture email WebElement and enter valid email address
		WebElement email = driver
				.findElement(By.xpath("//input[contains(@placeholder, 'Email address or phone number')]"));

		email.clear();
		email.sendKeys("rakeshsinghraks@gmail.com");

		// Step 6: Capture Password WebElement and enter invalid password
		WebElement password = driver.findElement(By.id("pass"));

		password.clear();
		password.sendKeys("Hakoonamatata");

		// Step 7: Click on login button
		WebElement loginButton = driver.findElement(By.name("login"));

		loginButton.click();

		// Transitioning to another page
		// implicit wait

		// Step 8: Verify that the user is on Error Page
		WebElement tryAnotherWay = driver.findElement(By.name("tryanotherway"));

		// Explicit wait statement -
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(By.name("tryanotherway")));

		boolean status = tryAnotherWay.isDisplayed();
		System.out.println("Has tryAnotherWay button been displayed = " + status);

		// Step 9: Capture whole text for validation
		WebElement fullTextElement = driver.findElement(By.xpath("//span[starts-with(text(), 'Log in as')]"));

		String actualText = fullTextElement.getText();
		System.out.println("Acutal Text on the Error Page - " + actualText);

		// verification step -
		if (actualText.contains(expectedName)) {
			System.out.println("Actual Text and Expected Texts both are matching == PASS");
		} else {
			System.out.println("Actual Text and Expected Texts both are not matching == FAIL");
		}
		
		// Step 10: Go back to previous page
		driver.navigate().back();

		// Transition
		// implicit wait
		fluentWait();

		// Step 11: Capture the "Create New Account" Button
		WebElement createButton = driver
				.findElement(By.xpath("//a[contains(@data-testid, 'open-registration-form-button')]"));

		String cssValue = createButton.getCssValue("font-family");
		System.out.println("cssValue of CreateButton is = " + cssValue);

		// Step 12: Get the attribute value of "Create new Account"
		String roleAttribute = createButton.getAttribute("role");
		System.out.println("role Attribute value for Create New Account button is = " + roleAttribute);

		// Step 13: Get the tagname for "Create New Account"
		String tagName = createButton.getTagName();
		System.out.println("tagName for Create New Account button is - " + tagName);
	}

	public static void fluentWait() {
	// Fluent wait -
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofMillis(100))
			.ignoring(NoSuchElementException.class);
	}
}
