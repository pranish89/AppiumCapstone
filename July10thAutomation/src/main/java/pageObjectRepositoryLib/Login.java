package pageObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Generic.ExcelLib;

public class Login {

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;

	@FindBy(xpath = "//a[@role='button' and contains(text(), 'Cre')]")
	private WebElement createnewAccBtn;

	public void login(WebDriver driver) throws Exception {
		// hit the url
		driver.get("https://facebook.com");
		email.sendKeys(ExcelLib.getDataFromExcel("Sheet1", 1, 3));
		password.sendKeys(ExcelLib.getDataFromExcel("Sheet1", 1, 4));
		loginbtn.click();
	}

	public void forgottenPassword(String email) {

		// Code - logic------
	}

	public void createNewAccount(WebDriver driver) {
		driver.navigate().back();
		createnewAccBtn.click();
	}

	public void createNewPage() {

	}

}
