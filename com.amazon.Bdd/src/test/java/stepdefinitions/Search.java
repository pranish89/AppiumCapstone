package stepdefinitions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.jline.utils.Log;
import pages.LoginPage;
import pages.SearchPage;
import utilities.DriverFactory;
import utilities.ExcelUtil;
import utilities.ExtentManager;

public class Search {
	
	 private static final Logger log =
	            LogManager.getLogger(Search.class);
	
	SearchPage search = new SearchPage(DriverFactory.getDriver());
	
	 @When("user searches for {string}")
	    public void user_searches_for(String product) {
		 log.info("User starts search for product: {}", product);
		 ExtentManager.getTest().info("Searching product: " + product);
	        search.searchProduct(product);
	        search.clickSearch();
	 }
	 @Then("search results should be displayed")
	 public void results_displayed() {
		 log.info("Search Results are displayed");
	     ExtentManager.getTest().info("SearchResults displayed " );
	 }
	 @When("user searches product from excel row {string}")
	 public void user_searches_product_from_excel(String rowNum) {

	     int row = Integer.parseInt(rowNum);

	     log.info("Reading search data from Excel row: {}", row);
	     ExtentManager.getTest().info("Reading product from Excel row: " + row);

	     String product = ExcelUtil.getSearchData(row);

	     log.info("Searching product from Excel: {}", product);
	     ExtentManager.getTest().info("Searching product: " + product);

	     search.searchProduct(product);
	     search.captureAutoSuggestions();
	     search.clickSearch();
	 }    
	 @When("user sorts results by {string}")
	 public void user_sorts_results_by(String sortOption) {

	     log.info("User selects sort option: {}", sortOption);
	     ExtentManager.getTest().info("Sorting by: " + sortOption);

	     search.sortBy(sortOption);
	 }	
	
}
