package com.page.object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.qa.util.TestBase;





public class AAPLPage extends TestBase{
	
	@FindBy(xpath="//*[@id='quote-header-info']/div[3]/div[1]/div/span[1]")
	WebElement salesPriceOfStock;
	
	
	
	public AAPLPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public double getSalesPriceOfStock() {
		//convert output of "salesPriceOfStock.getText()" String to double
		double salesPrice = Double.parseDouble(salesPriceOfStock.getText());
		//System.out.println(salesPrice);
		return salesPrice;
	}
	
	public void salesPriceGreaterThanBenchmark(double benchmarkPrice) {
		double salesPrice = getSalesPriceOfStock();
		if (salesPrice>benchmarkPrice) {
			System.out.println("Test is Pass");
		}
		
					
	}
	public void salesPriceLessAndEqualToBenchmark(double benchmarkPrice) {
		double salesPrice = getSalesPriceOfStock();
		if (salesPrice==benchmarkPrice||salesPrice<benchmarkPrice) {
			System.out.println("Test is Fail");
		}

	}	
	
}
