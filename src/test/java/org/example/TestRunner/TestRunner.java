package org.example.TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/RegistrationFeatures.feature"}
        , glue = {"org.example.PageDefinitions"}
        , tags = "@Registration"
        ,plugin = {"pretty" , "html:target/html_report.html"}
        ,dryRun = false

)

public class TestRunner {
}
