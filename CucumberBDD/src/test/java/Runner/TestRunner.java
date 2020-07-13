package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\sendMessageToContact.feature",
glue= {"com\\ecommerce\\CucumberBDD"},
monochrome=true,
plugin = {"pretty", "html:test-output"},
dryRun = false,
strict = true )

public class TestRunner {

}
