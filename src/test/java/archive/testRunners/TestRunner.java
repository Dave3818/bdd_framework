package archive.testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/resources/appFeatures/search.feature"},
        glue = {"archive/stepdefinitions", "archive/applicationHooks"},
        tags = "@allenv",
        plugin ={"pretty",
                    "json:target/MyReports/report.json",
                    "junit:target/MyReports/report.xml"},
        dryRun = false


       // tags = "@test and @prod",


)

 public class TestRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return super.scenarios();
        }
    }



