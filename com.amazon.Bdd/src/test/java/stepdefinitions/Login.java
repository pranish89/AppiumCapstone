
package stepdefinitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.ExtentManager;
import utilities.JsonUtils;

public class Login {

    LoginPage loginPage;
    private static final Logger log = LogManager.getLogger(Login.class);
    
    //WebDriver driver = DriverFactory.getDriver();

    // ================= GIVEN =================
    
    @Given("User naviagtes to the amazon home page")
    public void user_navigate_amazon()
    {
    	log.info("Amazon home page is launched");
    }

    @Given("user is on Amazon login page")
    public void user_on_login_page() {

        log.info("Navigating to Amazon login page");
        log.info(DriverFactory.getDriver().getTitle());

        loginPage = new LoginPage(DriverFactory.getDriver());
        loginPage.clickSignInFromHome();

        ExtentManager.getTest().info("User navigated to login page");
    }

    // ================= PARAMETERIZED LOGIN =================

    @When("user enters username")
    public void user_enters_username(){

        log.info("Entering username");

        loginPage.enterUsername();
        loginPage.clickContinue();

        ExtentManager.getTest().info("Entered username: ");
    }

    @When("user enters password")
    public void user_enters_password() {

        log.info("Entering password");

        loginPage.enterPassword();
        loginPage.clickSignInSubmit();

        ExtentManager.getTest().info("Entered password");
    }

    // ================= JSON DRIVEN LOGIN =================

   

    @Then("user should see home page")
    public void user_should_see_home_page() {

        log.info("Validating home page");

        boolean status = loginPage.isHomePageDisplayed();

        Assert.assertTrue(status, "Home page is not displayed");

        ExtentManager.getTest().pass("Login successful — home page displayed");
    }
}