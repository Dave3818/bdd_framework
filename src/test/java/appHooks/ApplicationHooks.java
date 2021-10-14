package appHooks;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ApplicationHooks {
    private DriverFactory driverFactory;
    private ConfigReader configReader;
    private WebDriver driver;
    Properties prop;

    @Before(order = 0)
    public void getProperty(){
        configReader = new ConfigReader();
        prop = configReader.init_prop();}
    @Before(order = 1)
    public void launchBrowser(){
        String browser = prop.getProperty("browser");
        driverFactory = new DriverFactory();
        driver = driverFactory.init_driver(browser);
    }

    @After(order = 0)
    public void tearDown(){
        driver.quit();
    }
    @After(order=1)
    public void takeScreenshot(Scenario scenario){
        if(scenario.isFailed()){
            String screenShotName = scenario.getName();
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenShotName);
        }
    }
}
