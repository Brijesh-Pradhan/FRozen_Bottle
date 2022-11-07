package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	  features= {".//src//test//java"},
	      glue="stepDefinition",
	      
	      dryRun=false,
	      monochrome=true,
	       
	      plugin= {
	    		  "pretty","html:target/HTMLReports/report.html"
	      }	
		)

public class Runner extends AbstractTestNGCucumberTests {

}
