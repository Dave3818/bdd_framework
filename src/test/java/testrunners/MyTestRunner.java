package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

    @CucumberOptions(
            features = {"src/test/resources/appFeatures"},
            glue = {"stepdefinitions", "appHooks"},
            plugin ={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                    "json:target/MyReports/report.json",
                    "junit:target/MyReports/report.xml",
                    "timeline:test-output-thread/",
                    "rerun:target/failedrerun.txt"}
     )

public class MyTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

