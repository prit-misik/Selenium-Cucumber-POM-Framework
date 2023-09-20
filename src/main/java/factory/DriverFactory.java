package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver getDriver(String browser) {

        switch (browser) {
            case "CHROME":
                return getDriverForChrome();
            case "FIREFOX":
                return getDriverForFireFox();
            case "EDGE":
                return getDriverForEdge();
        }
        return getDriverForChrome();
    }

    private static WebDriver getDriverForEdge() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    private static WebDriver getDriverForFireFox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private static WebDriver getDriverForChrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }


}
