package StepDefinitions;

import Tests.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;

import java.net.MalformedURLException;

public class commonsteps extends BaseSteps
{
    @Before
    public void setup() throws InterruptedException {
        setupCucumber();
    }
    @And("^lunch the arcos website$")
    public void lunch_the_arcos_website() throws MalformedURLException, InterruptedException {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
        Thread.sleep(3000);
    }
    @And("^refresh the page$")
    public void refresh_the_page(){
        getTDriver().navigate().refresh();
    }
}
