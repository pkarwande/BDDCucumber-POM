package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Prachiti karwande\\git\\BDDCucumber-POM\\CucumberBDD\\src\\test\\resources\\Features\\laptop.feature",
glue= {"com/ecommerce/CucumberBDD"},
monochrome=true,
plugin = {"pretty", "html:target/test-output"},
dryRun = false )

public class TestRunner extends AbstractTestNGCucumberTests {
	
  /* private TestNGCucumberRunner testNGCucumberRunner;  

	  @BeforeClass(alwaysRun = true)  
	    public void setUpClass() throws Exception {  
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());  
	  }  

	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")  
	    public void feature(CucumberFeatureWrapper cucumberFeature) {  
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());  
	  }  

	    @DataProvider  
	  public Object[][] features() {  
	        return testNGCucumberRunner.provideFeatures();  
	  }  

	    @AfterClass(alwaysRun = true)  
	    public void tearDownClass() throws Exception {  
	        testNGCucumberRunner.finish();  
	  }  */

}
 