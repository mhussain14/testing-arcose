package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.concurrent.TimeUnit;

public class SignUpSteps extends BaseSteps
{
    @Before
    public void setup() throws InterruptedException {
        setupCucumber();
    }
    @Given("^click on the Sign In on the homepage$")
    public void click_on_the_sign_in_on_the_homepage() throws InterruptedException {
        getTDriver().manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        signUpPage.clickOnLoginButton();
    }
    @Then("^click on Sign Up Or Register button$")
    public void click_on_sign_up_or_register_button(){
        getTDriver().manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        signUpPage.clickOnRegisterLink();
    }
    @And("^check the first name \"(.*)\"$")
    public void check_the_first_name(String text){
       signUpPage.assertFirstName(text);
    }
    @And("^enter the First Name \"(.*)\" on the sign up screen$")
    public void enter_the_first_name_on_the_sign_up_screen(String text){
        signUpPage.EnterFirstName(text);
    }
    @And("^check the last name \"(.*)\" on the sign up screen$")
    public void check_the_last_name_on_the_sign_up_screen(String text){
        signUpPage.assertLastName(text);
    }
    @And("^enter the last Name \"(.*)\" on the sign up screen$")
    public void enter_the_last_name_on_the_sign_up_screen(String text){
        signUpPage.EnterLastName(text);
    }
    @And("^check the  text username \"(.*)\" on the sign up screen$")
    public void check_the_text_username_on_the_sign_up_screen(String text){
        signUpPage.assertUserName(text);
    }
    @And("^enter the username \"(.*)\" on the sign up screen$")
    public void enter_the_username_on_the_sign_up_screen(String text){
        signUpPage.EnterUserName(text);
    }
    @And("^check the text email \"(.*)\" on the sign up screen$")
    public void check_the_text_email_on_the_sign_up_screen(String text){signUpPage.assertEmail(text); }
    @And("^enter the email \"(.*)\" on the sign up screen$")
    public void enter_the_email_on_the_sign_up_screen(String text){signUpPage.EnterEmail(text);}
    @And("^check the text password \"(.*)\" on the sign up screen$")
    public void assertPassword(String text){signUpPage.assertPassword(text); }
    @And("^enter the password \"(.*)\" on the sign up screen$")
    public void enter_the_password_on_the_sign_up_screen(String text){
        signUpPage.EnterPassword(text);
    }
    @And("^click on login button on the sign up screen$")
    public void click_on_login_button_on_the_up_screen(){
        signUpPage.clickOnLoginLink();
    }
    @And("^click on create account button to create new account$")
    public void click_on_Create_account_Button_to_create_new_account() throws InterruptedException {
        signUpPage.clickOnCreateButton();
        Thread.sleep(3000);
    }
    @And("^user register successfully \"(.*)\"$")
    public void user_register_successfully(String text) {
        getTDriver().manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        signUpPage.assertSuccessMessage(text);
    }
    @And("^text first name is \"(.*)\" on the sign up screen$")
    public void text_first_name_is_On_the_sign_up_screen(String text){
        signUpPage.firstNameRequired(text);
    }
    @And("^text last name is \"(.*)\" on the sign up screen$")
    public void text_first_name_is_on_the_sign_up_screen(String text){
        signUpPage.lastNameRequired(text);
    }
    @And("^text user name is \"(.*)\" on the sign up screen$")
    public void text_user_name_is_on_the_sign_up_screen(String text){
        signUpPage.usernameRequired(text);
    }
    @And("^text email is \"(.*)\" on the sign up screen$")
    public void text_email_is_on_the_sign_up_screen(String text){
        signUpPage.emailRequired(text);
    }
    @And("^text password is \"(.*)\" on the sign up screen$")
    public void text_password_is_on_the_sign_up_screen(String text){
        signUpPage.passwordRequired(text);
    }
}
