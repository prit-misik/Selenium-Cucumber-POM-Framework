package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUpDriver extends DriverFactory{

    private SetUpDriver(){
    }

    public static WebDriver getDriverForChrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    public static WebDriver getDriverForFireFox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    public static WebDriver getDriverForEdge() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
