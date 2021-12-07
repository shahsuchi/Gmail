package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue ={"Stepdefinitions"},monochrome = true,
//plugin={"pretty","Html:target/Report/HtmlReport"} 
plugin = { "pretty", "html:target/reports/Testreport.html"}

//plugin = { "pretty",  "junit:target/reports/cucumber.xml"}
//plugin = { "pretty", "json:target/reports/cucumber.json"}

)
public class TestRunner {

}
