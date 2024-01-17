package StepDefinitions;

import Pages.*;
import Tests.BaseTest;
import Tests.DriverSetUp;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseSteps extends BaseTest {
    //protected WebDriver driver;
    protected WebDriverWait wait;
    protected BaseScreen baseScreen ;
    protected CommonScreen commonScreen ;
    protected SignUpPage signUpPage;
    protected SignInPage signInPage;
    protected HomePage homePage;
    protected ViewPage viewPage;
    protected FAQPage faqPage;
    protected EditUserProfilePage editUserProfilePage;

    protected void setupCucumber() throws  InterruptedException{
        wait = new WebDriverWait(DriverSetUp.getTDriver(), Duration.ofSeconds(10));

        commonScreen = new CommonScreen(DriverSetUp.getTDriver());
        baseScreen = new BaseScreen(DriverSetUp.getTDriver());
        signInPage = new SignInPage(DriverSetUp.getTDriver());
        signUpPage = new SignUpPage(DriverSetUp.getTDriver());
        homePage = new HomePage(DriverSetUp.getTDriver());
        viewPage = new ViewPage(DriverSetUp.getTDriver());
        faqPage = new FAQPage(DriverSetUp.getTDriver());
        editUserProfilePage = new EditUserProfilePage(DriverSetUp.getTDriver());
    }
}
