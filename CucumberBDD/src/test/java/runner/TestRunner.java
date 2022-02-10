package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		     
		features = {"C:\\Users\\AkshayBhatia\\Projects\\Assignments\\src\\main\\java\\CucumberBDD\\src\\test\\java\\featureFiles\\Adduser.feature"},
		glue = {"stepDefinition"},
//		dryRun = true,
		monochrome = true,
		plugin = {"pretty","json:report/Cucumber.json"
				}
		
		)
public class TestRunner {
	
	

}
