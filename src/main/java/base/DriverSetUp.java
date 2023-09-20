package base;

import factory.DriverFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import util.TestUtils;
import util.WebEventListener;

public class DriverSetUp {

    public static WebDriver driver;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener = null;
    public static Logger APP_LOGS = null;

    public static void initialize() {

        APP_LOGS = LogManager.getLogger(DriverSetUp.class);

        //get the needed driver according to the browser name passed
        driver = DriverFactory.getDriver(TestUtils.getPropFileValues().get("browser"));
        //Event Listener setting
        driver = getEventListenerDriver(driver);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        APP_LOGS.debug("Completed initialization");
    }

    public static WebDriver getEventListenerDriver(WebDriver driver){
        e_driver = new EventFiringWebDriver(driver);
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;
        return driver;
    }

    public static void closeBrowser() {
        driver.quit();
        APP_LOGS.info("Killed browser Successfully.");
    }

}
