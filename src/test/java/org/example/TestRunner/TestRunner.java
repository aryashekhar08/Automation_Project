package org.example.TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/LoginFeatures.feature"}
        , glue = {"org.example.PageDefinitions"}
        ,plugin = {"pretty" , "html:target/html_report.html"}
        ,dryRun = true

)

public class TestRunner {
}
