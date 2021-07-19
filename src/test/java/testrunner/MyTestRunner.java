package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/AppFeatures/AccountPage.feature"},
		glue= {"stepdefinition", "AppHooks"},
		plugin= {"pretty"},
		dryRun=false,
		monochrome = true,
		publish=true
		
		)
public class MyTestRunner {
	
	

}
