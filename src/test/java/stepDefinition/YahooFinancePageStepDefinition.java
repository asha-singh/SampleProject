package stepDefinition;

import java.util.List;
import java.util.Map;

import org.hamcrest.core.StringContains;
import org.junit.Assert;

import com.page.object.AAPLPage;
import com.page.object.YahooFinancePage;
import com.qa.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
	
public class YahooFinancePageStepDefinition extends TestBase{
	YahooFinancePage yahooFinancePage;
	
	
	
	@Given("^User opens browser and launches yahoo finance$")
	public void user_opens_browser_and_launches_yahoo_finance() throws Throwable {
	    initialize();
	    
	}

	@Then("^User validate Yahoo Finance page is displayed$")
	public void user_validate_Yahoo_Finance_page_is_displayed() throws Throwable {
		yahooFinancePage = new YahooFinancePage(driver);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertThat(title, StringContains.containsString("Yahoo Finance"));
	   
	}

	

	@Then("^User enters \"([^\"]*)\" in the top Search Text Box$")
	public void user_enters_in_the_top_Search_Text_Box(String compName) throws Throwable {
		yahooFinancePage= new YahooFinancePage(driver);
		yahooFinancePage.enterText(compName);
	   
	}

	@Then("^User clicks Search$")
	public void user_clicks_Search() throws Throwable {
		yahooFinancePage= new YahooFinancePage(driver);
		yahooFinancePage.clickSearch();
		Thread.sleep(2000);
	    
	}
	

	@Then("^User is displayed with AAPL Page$")
	public void user_is_displayed_with_AAPL_Page() throws Throwable {
		yahooFinancePage= new YahooFinancePage(driver);
		String titlecompName = driver.getTitle();
		System.out.println(titlecompName);
		Assert.assertThat(titlecompName, StringContains.containsString("AAPL"));
		
	}
	
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	   close();
	}

	
}
