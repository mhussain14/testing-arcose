package StepDefinitions;

import Tests.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

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
    @And("^enter the email \"(.*)\" and password \"(.*)\" to login$")
    public void enter_the_email_and_password_to_login(String email, String password){
        getTDriver().navigate().refresh();
        getTDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        signUpPage.clickOnLoginButton();
        getTDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        signInPage.EnterEmail(email);
        getTDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        signInPage.EnterPassword(password);
        getTDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        signInPage.clickOnLoginLink();
        getTDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @And("^refresh the page$")
    public void refresh_the_page(){
        commonScreen.refreshThePage();
    }
    @And("^search the text \"(.*)\" on page$")
    public void search_the_text_on_Page(String text){
       commonScreen.searchTheTextOnPage(text);
    }
    @And("^wait for (\\d+) second$")
    public void wait_to_second(int x) throws InterruptedException {
        commonScreen.waitForSecond(x);
    }
}
