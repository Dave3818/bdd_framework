package archive.applicationHooks;

import io.cucumber.java.*;

public class BestBuyHooks {

    @Before(order = 1)
    public void launchBrowser(Scenario sc){
        System.out.println("Browser Launch Successful");
        System.out.println("Scenario Name: "+ sc.getName());
    }

    @Before (order=2)
    public void launchApp(){
        System.out.println("App Launch Successful");
    }

    @BeforeStep
    public void takeScreenshot(){
        System.out.println("Take Screenshot");
    }


    @AfterStep
    public void refreshPage(){
        System.out.println("refresh Page");
    }
    @After (order=1)
    public void closeBrowser(){
        System.out.println("Browser close Successful");
    }

    @After (order=2)
    public void closeApp(){
        System.out.println("App close Successful");
    }


}
