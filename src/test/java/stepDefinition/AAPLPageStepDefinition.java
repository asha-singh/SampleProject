package stepDefinition;

import org.hamcrest.core.StringContains;
import org.junit.Assert;

import com.page.object.AAPLPage;
import com.page.object.YahooFinancePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AAPLPageStepDefinition extends TestBase{
	YahooFinancePage yahooFinancePage;
	AAPLPage aalpPage;
	

	@Given("^User search for \"([^\"]*)\" page from Yahoo Finance Page$")
	public void user_search_for_page_from_Yahoo_Finance_Page(String compName) throws Throwable {
		initialize();
		yahooFinancePage= new YahooFinancePage(driver);
		yahooFinancePage.enterText(compName);
		yahooFinancePage.clickSearch();
		Thread.sleep(2000);
	    
	}

	@Then("^User validates AAPL page is displayed$")
	public void user_validates_AAPL_page_is_displayed() throws Throwable {
		yahooFinancePage= new YahooFinancePage(driver);
		String titlecompName = driver.getTitle();
		System.out.println(titlecompName);
		Assert.assertThat(titlecompName, StringContains.containsString("AAPL"));
	   
	}
	@Then("^User checks for Sales Price of AAPL$")
	public void user_checks_for_Sales_Price_of_AAPL() throws Throwable {
		aalpPage = new AAPLPage(driver);
		aalpPage.getSalesPriceOfStock();
	    
	}

	@When("^Sales price greater than \"([^\"]*)\" test passes$")
	public void sales_price_greater_than_test_passes(double benchmarkPrice) throws Throwable {
		aalpPage = new AAPLPage(driver);
		aalpPage.salesPriceGreaterThanBenchmark(benchmarkPrice);
	   
	}

	@When("^Sales price is less than or equal \"([^\"]*)\" test fails$")
	public void sales_price_is_less_than_or_equal_test_fails(double benchmarkPrice) throws Throwable {
		aalpPage = new AAPLPage(driver);
		aalpPage.salesPriceLessAndEqualToBenchmark(benchmarkPrice);
	   
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
	   close();
	   
	}	
	
	

}
