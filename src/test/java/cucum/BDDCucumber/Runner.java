package cucum.BDDCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ebnad\\Documents\\eclipseMars\\BDDCucumber\\src\\test\\java\\cucum\\BDDCucumber\\BDDFrame.feature"
,glue="")
public class Runner extends AbstractTestNGCucumberTests{

}
