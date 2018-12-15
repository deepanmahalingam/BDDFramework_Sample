package BDDFramework.testng_Cucumber;


import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;
//@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = {"stepDefinition"})
public class TestRunner extends AbstractTestNGCucumberTests
{

}
