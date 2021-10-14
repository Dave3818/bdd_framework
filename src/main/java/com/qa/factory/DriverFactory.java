package com.qa.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    /**
     * This method initializes driver based on give browser
     * @param browser
     * @return tlDriver
     */

    public WebDriver init_driver(String browser){
        System.out.println("Browser Value is : " + browser);
        try{
        if (browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        }
        else if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        }
        else if (browser.equals("safari")){
            tlDriver.set(new SafariDriver());
        }
        else { System.out.println("Please pass the correct browser value " + browser);}
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        }
        catch (Exception e){
            System.out.println("Exception **********:" + e.getMessage());
        }
        return getDriver();
    }

    /**
     * Get driver with thread local
     * @return
     */
    public static synchronized WebDriver getDriver(){
        return tlDriver.get();
    }


}
