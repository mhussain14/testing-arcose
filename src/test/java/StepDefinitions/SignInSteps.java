package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;

import java.time.Duration;

public class SignInSteps extends BaseSteps {
    @Before
    public void setup() throws InterruptedException {
        setupCucumber();
    }
    @And("^check the text email \"(.*)\" on the signIn screen$")
    public void check_the_email_on_the_signIn_screen(String text){
        signInPage.assertEmail(text);
    }
    @And("^enter the email \"(.*)\" on the sign in screen$")
    public void enter_the_email_on_the_signIn_screen(String text){
        signInPage.EnterEmail(text);
    }
    @And("^check the text password \"(.*)\" on the sign in screen$")
    public void assertPassword(String text){
        signInPage.assertPassword(text);
    }
    @And("^Enter the password \"(.*)\" on the sign in Screen$")
    public void EnterPassword(String text){
        signInPage.EnterPassword(text);
    }
    @And("^click on sign in button to sign in$")
    public void clickOnLoginLink(){
        signInPage.clickOnLoginLink();
    }
    @And("^text log out \"(.*)\" on the login screen$")
    public void text_log_out_on_the_login_screen(String text){
        signInPage.textLogout(text);
    }
    @And("^click on log out button$")
    public void click_on_log_out_button(){
        signInPage.logout();
    }
    @And("^text email is \"(.*)\" on the sign in screen$")
    public void text_email_is_on_the_sign_in_screen(String text){signInPage.emailRequired(text);}
    @And("^text password is \"(.*)\" on the sign in screen$")
    public void text_password_is_on_the_sign_in_screen(String text){
        signInPage.passwordRequired(text);
    }
}
