import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)                    // Test runner specifier
@CucumberOptions(
        features = {"features"} ,           // telling the Cucumber where is the feature files are
        glue = {"stepdefinitions"},         // telling the Cucumber where is the step definitions are
        plugin = {"json:report/json/cucumber.json"}   
)
public class TestRunner {
}
