package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public  WebDriver driver;
	public Properties prop;
	
	
	public TestBase() {
		prop = new Properties();
		
		try {
			FileInputStream	fis = new FileInputStream("C:\\Users\\asha Singh\\eclipse-workspace\\com.cucumber.yahoo.finance\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	
	public void initialize() {
		//WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome"))
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	
	}
	
	public void close() {
		
		driver.quit();
	}
 
}
