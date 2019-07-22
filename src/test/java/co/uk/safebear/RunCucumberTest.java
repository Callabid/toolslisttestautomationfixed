package co.uk.safebear;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"json;target/cucumber-report/cucumber.json"} ,
        tags = "not@to-do"

        //glue = "path to stepdefs if not in the same folder"
        //Features = "path to features if not in co.uk.safebear folder"
)
public class RunCucumberTest {

}
