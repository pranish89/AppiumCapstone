package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;

public class SearchPage {
    private static final Logger log = LogManager.getLogger(SearchPage.class);
	
    WebDriver driver;
    WebDriverWait wait;
   
    
	
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

	private By searchBox = By.id("twotabsearchtextbox");
    private By searchBtn = By.id("nav-search-submit-button");
    private By suggestions = By.xpath("//div[@role='button']//span");
    private By sortDropdown = By.id("s-result-sort-select");

    
 
    

    public void searchProduct(String product) {
       wait.until(ExpectedConditions.visibilityOf( DriverFactory.getDriver().findElement(searchBox))).clear();
        DriverFactory.getDriver().findElement(searchBox).sendKeys(product);

}
    public void captureAutoSuggestions() {

        try {

            List<WebElement> list = wait.
                    until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(suggestions));


            for (WebElement e : list) {
                System.out.println(e.getText());
            }

        } catch (Exception e) {
      //      log.warn("Auto suggestions not displayed");
        }
    }
    public void clickSearch() {

        //log.info("Clicking search button");

        WebElement btn = wait
                .until(ExpectedConditions.elementToBeClickable(searchBtn));

        btn.click();
    }
    
    public void sortBy(String visibleText) {

        log.info("Sorting results by: {}", visibleText);

        WebElement dropdown = wait
                .until(ExpectedConditions.elementToBeClickable(sortDropdown));

        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);

        // wait for refresh after sorting
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultsContainer));

        log.info("Sorting applied successfully");
    }
}
