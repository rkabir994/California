package TestRunnerr;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resource/Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "Stepdefff")


public class TestRunneerrr extends AbstractTestNGCucumberTests {

}
