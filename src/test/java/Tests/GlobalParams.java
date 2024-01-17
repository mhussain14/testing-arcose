package Tests;

import org.bytedeco.opencv.presets.opencv_core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GlobalParams
{
    /*public static boolean IOS_Flag = false;
    public static boolean isIOS(){return IOS_Flag;}
    public static boolean isAndroid(){return !IOS_Flag;}
    public static boolean isWeb(){return !IOS_Flag;}
    public static void setFlag(String type)
    {
        IOS_Flag = false;
        if(type.equals("iOS"))
        {
            IOS_Flag = true;
        }
    }*/
    public void browserSetup(WebDriver driver, String browser)
    {
        if (browser == "Firefox"){
            System.setProperty("webdriver.gecko.driver", "/Users/arcelikaric/Downloads/geckodriver");
            driver = new FirefoxDriver();
        }
        else if (browser == "chrome"){
            System.setProperty("webdriver.gecko.driver", "/Users/arcelikaric/Downloads/geckodriver");
            driver = new ChromeDriver();
        }
        else if (browser == "Safari"){
            System.setProperty("webdriver.gecko.driver", "/Users/arcelikaric/Downloads/geckodriver");
            driver = new SafariDriver();
        }
    }
}
