package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\asha Singh\\eclipse-workspace\\com.cucumber.yahoo.finance\\src\\main\\java\\Feature",
	//tags = "1_financeHomePage",	
	glue = {"stepDefinition"}, //path of step definition
	format = {"pretty", "html:test-output"},
		monochrome = true,
		strict = true,
		dryRun = false)


public class TestRunner {	

}
