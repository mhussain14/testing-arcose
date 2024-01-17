package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseTest extends DriverSetUp
{
    GlobalParams browser = new GlobalParams();

    URL LocalUrl;
    public void setUp() throws MalformedURLException {
        logger.info("Starting Setup Driver .....");

        setTDriver("firefox");

        getTDriver().get("http://localhost:3000/");
        logger.info("SetUp Driver - Done");
    }
    public void TearDown() {
        closeBrowser();
        logger.info("Driver is closed ....OK");
    }
}
