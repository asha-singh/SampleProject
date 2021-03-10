package com.page.object;


import java.sql.SQLException;

import org.hamcrest.core.StringContains;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





import com.qa.util.TestBase;

public class YahooFinancePage extends TestBase {

	
	@FindBy(id = "yfin-usr-qry")
	WebElement searchTextBox;
	@FindBy(id = "header-desktop-search-button")
	WebElement searchButton;
	
	
	
	WebDriver driver;
	
	public YahooFinancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void enterText(String companyName)  {

		searchTextBox.sendKeys(companyName);
	}
	
	public void clickSearch() {
		searchButton.click();
	
	}
	
	
	}

