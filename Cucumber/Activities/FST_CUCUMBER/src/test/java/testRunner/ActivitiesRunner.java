package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\0043T7744\\IdeaProjects\\FST_CUCUMBER\\src\\test\\java\\Features",
        glue = {"stepDefinitions"},
        tags = "@SmokeTest",
        //plugin = {"html: test-reports"},
        plugin = {"json:target/cucumber/report.json"},
        monochrome = true
)

public class ActivitiesRunner {
}
