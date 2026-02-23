package Generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	/**
	 * This method is used to maximize the window
	 * 
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * 
	 * @param driver
	 */
	public void waitForpageToLoan(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.globlaWait));
	}

	/**
	 * 
	 * @param driver
	 * @param locator
	 */
	public void waitForElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.globlaWait));

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * This is method compares texts between expected and actual text during the
	 * runtime being generated.
	 * 
	 * @param driver
	 * @param locator
	 * @param expectedText
	 */
	public void verifyText(WebDriver driver, By locator, String expectedText) {

		WebElement element = driver.findElement(locator);

		String actualText = element.getText();
		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("Data is verified, it is same");
		} else {
			System.out.println("Data is not matching");
		}
	}

}
