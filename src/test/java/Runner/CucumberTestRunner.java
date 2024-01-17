package Runner;

import Tests.BaseTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;

@CucumberOptions(
        //strict = true,
        monochrome = true,
        //tags = "@signup",
        //tags = "@signInFeature",
        //tags = "@signIn",
        //tags = "@Home",
        //tags = "@Viewpage",
        //tags = "@FAQ",
        tags = "@EditUserprofile",

        glue = {"StepDefinitions", "com.arceliktv.lotr.hooks"},
        //features = {"src/test/resources/Feature"},
        features = {"src/test/resources/Feature"},
        plugin = {"pretty", "junit:target/surefire-reports/junitreports/testNGReport.xml"}

)
public class CucumberTestRunner extends AbstractTestNGCucumberTests
{
    BaseTest baseTest = new BaseTest();
    @BeforeTest
    public void webDriverSetup() throws MalformedURLException {
        baseTest.setUp();
    }
    @AfterTest
    public void TearDown()
    {
        //BaseScreen baseScreen = new BaseScreen(ThreadLocalDriver.getTLDriver());
        //baseTest.TearDown();
    }
}

