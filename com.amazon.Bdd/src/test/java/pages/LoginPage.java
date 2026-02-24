package pages;


	import java.time.Duration;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;

	public class LoginPage {

	    WebDriver driver;
	    WebDriverWait wait;

	    private static final Logger log = LogManager.getLogger(LoginPage.class);



	    @FindBy(id = "nav-link-accountList")
	    private WebElement signInHover;

	    @FindBy(xpath = "//span[text()='Sign in']")
	    private WebElement signInButton;

	    @FindBy(id = "ap_email_login")
	    private WebElement emailField;

	    @FindBy(id = "continue")
	    private WebElement continueBtn;

	    @FindBy(id = "ap_password")
	    private WebElement passwordField;

	    @FindBy(id = "signInSubmit")
	    private WebElement signInSubmit;

	    @FindBy(id = "nav-logo-sprites")
	    private WebElement amazonLogo;



	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    }

	 

	    public void clickSignInFromHome() {
	        log.info("Clicking Sign in from home page");

	        try {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(signInHover).perform();

	            wait.until(ExpectedConditions.elementToBeClickable(signInButton));
	            signInButton.click();

	        } catch (Exception e) {
	            log.error("Unable to click sign in", e);
	            throw e;
	        }
	    }

	    public void enterUsername() {
	        log.info("Entering username: ");

	        wait.until(ExpectedConditions.visibilityOf(emailField));
	        emailField.clear();
	        emailField.sendKeys(ConfigReader.get("username"));
	    }

	    public void clickContinue() {
	        log.info("Clicking Continue button");

	        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
	        continueBtn.click();
	    }

	    public void enterPassword() {
	        log.info("Entering password");

	        wait.until(ExpectedConditions.visibilityOf(passwordField));
	        passwordField.clear();
	        passwordField.sendKeys(ConfigReader.get("password"));
	    }

	    public void clickSignInSubmit() {
	        log.info("Clicking Sign In submit");

	        wait.until(ExpectedConditions.elementToBeClickable(signInSubmit));
	        signInSubmit.click();
	    }


	    public boolean isHomePageDisplayed() {
	        log.info("Validating Amazon home page");

	        try {
	            wait.until(ExpectedConditions.visibilityOf(amazonLogo));
	            return amazonLogo.isDisplayed();
	        } catch (Exception e) {
	            log.error("Home page not displayed");
	            return false;
	        }
	    }


	    public void loginToAmazon(String username, String password) {
	        clickSignInFromHome();
	        enterUsername();
	        clickContinue();
	        enterPassword();
	        clickSignInSubmit();
	    }
	}


