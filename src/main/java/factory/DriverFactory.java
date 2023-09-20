package factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private DriverFactory(){
    }

    public static WebDriver getDriver(String browser) {

        switch (browser) {
            case "CHROME": return SetUpDriver.getDriverForChrome();

            case "FIREFOX": return SetUpDriver.getDriverForFireFox();

            case "EDGE": return SetUpDriver.getDriverForEdge();

        }
        return SetUpDriver.getDriverForChrome();
    }

}
