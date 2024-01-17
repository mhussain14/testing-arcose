package Tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class DriverSetUp
{
    protected Logger logger = Logger.getLogger(getClass());
    private static final ThreadLocal<WebDriver> TDriver = new ThreadLocal<>();

    // Setter method for WebDriver
    public static void setTDriver(String browser) {
        WebDriver Driver;
        {
            switch (browser){
                case "chrome":
                    Driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "/Users/arcelikaric/Documents/geckodriver");
                    System.setProperty("webdriver.firefox.logfile", "/Users/arcelikaric/Documents/geckodriver.log");
                    System.setProperty("webdriver.firefox.loglevel", "DEBUG");
                    Driver = new FirefoxDriver();
                    break;
                case "Edge":
                    Driver = new EdgeDriver();
                    break;
                case "Safari":
                    Driver = new SafariDriver();
                    break;
                default:
                    throw new IllegalStateException("Unexpected " + browser);
            }
           TDriver.set(Objects.requireNonNull(Driver));
            prepareBrowser();
        }
    }
    private static void prepareBrowser(){
        getTDriver().manage().window().maximize();
        getTDriver().manage().deleteAllCookies();
        getTDriver().manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        getTDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    // Getter method for WebDriver
    public static WebDriver getTDriver() {
        //return TDriver.get();
        return Objects.requireNonNull(TDriver.get());
    }
    // Other methods using WebDriver can be added here
    public static void closeBrowser() {
        getTDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getTDriver().close();
        //getTDriver().quit();
    }
    public void navigateTo(String url) {
        TDriver.get().get(url);
    }
}
