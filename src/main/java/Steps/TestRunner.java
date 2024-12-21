package steps;  // Ensure this matches the package where your step definitions are

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",  // Path to your feature files
    glue = "steps",  // Package containing your step definition classes
    plugin = {"pretty", "html:target/cucumber-report.html"},  // Optional reporting options
    tags = "@update_naukuri_profile"  // Optional: run tests with specific tags (if needed)
)
public class TestRunner {
    // This class is used to trigger the Cucumber tests
}
