package TestRunner;
//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(

		features = { ".//Features/LoginFeature.feature"
		// ".//Features/Customers.feature"
		}, glue = "StepDefinition", dryRun = false, monochrome = true, tags = "@Sanity", 
		plugin = { "pretty", // "html:target/cucumber-reports/reports_html.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

public class Run extends AbstractTestNGCucumberTests {
	/* This class will be empty */
}
