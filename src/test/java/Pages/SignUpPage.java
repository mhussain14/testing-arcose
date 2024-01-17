package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class SignUpPage extends BaseScreen{

    HashMap<String, By> paths = new HashMap<>();
     public SignUpPage(WebDriver driver) {
        super(driver);

        paths.put("click on Log In", By.xpath("//button[@id = 'demo-customized-button']"));
        paths.put("Click on Register", By.xpath("//a[text() = 'Register']"));
        paths.put("First Name", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[1]//p[text() = 'First Name']"));
        paths.put("txt First Name", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[1]//div//div//input[@id = 'first-name']"));
        paths.put("Last Name", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[2]//p[text() = 'Last Name']"));
        paths.put("txt Last Name", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[2]//div//div//input[@id = 'last-name']"));
        paths.put("lbl Username", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//form//li[3]//p[text() = 'Username']"));
        paths.put("textBox username", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//form//li[3]//div//div//input[@id = 'user-name']"));
        paths.put("lbl email", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//form//li[4]//p[text() = 'Email']"));
        paths.put("textbox Email", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//form//li[4]//div//div//input[@id = 'register-email']"));
        paths.put("lbl Password", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//form//li[5]//p[text() = 'Password']"));
        paths.put("text Password", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//form//li[5]//div//div//input[@id = 'register-password']"));
        paths.put("Click on Login link to go login page", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//div//a[text() = 'Login']"));
        paths.put("Create Account", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//div[1]//div//button[@class = 'btn-defaultundefined']"));
        paths.put("Error Message", By.xpath("//div[@class = 'Toastify']//div//div//div[2]"));
        paths.put("Successfully Message", By.xpath("//div[@class = 'Toastify']//div//div//div/div[text() = 'User Registered Successfully!']"));

        paths.put("first name is required", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[1]//div//p[@id = 'first-name-helper-text']"));
        paths.put("last name is required", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[2]//div//p[@id = 'last-name-helper-text']"));
        paths.put("user name is required", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[3]//div//p[@id = 'user-name-helper-text']"));
        paths.put("email is required", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[4]//div//p[@id = 'register-email-helper-text']"));
        paths.put("password is required", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[5]//div//p[@id = 'register-password-helper-text']"));
    }
    public void clickOnLoginButton(){
         By btn_login = paths.get("click on Log In");
         click_btn(btn_login);
         logger.info("Click on login button, Passed");
    }
    public void clickOnRegisterLink(){
        By link_register = paths.get("Click on Register");
        click_btn(link_register);
        logger.info("Click on register link, Passed");
    }
    public void loginEmailAndPassword(String email , String password)
    {
        By enter_Email = paths.get("textbox Email");
        setValue(enter_Email, email);
        By enter_password = paths.get("text Password");
        setValue(enter_password, password);
        logger.info("Entered the email and Password, Passed");
    }
    public void assertFirstName(String text){
        By lbl_fristname = paths.get("First Name");
        assertEqualsText(text, lbl_fristname);
        logger.info("username checked, Passed");
    }
    public void EnterFirstName(String text){
        By enter_firstname = paths.get("txt First Name");
        //assertEqualsText(text, enter_username);
        setValue(enter_firstname, text);
        logger.info("Entered the First Name, Passed");
    }
    public void assertLastName(String text){
        By lbl_lastname = paths.get("Last Name");
        assertEqualsText(text, lbl_lastname);
        logger.info("username checked, Passed");
    }
    public void EnterLastName(String text){
        By enter_lastname = paths.get("txt Last Name");
        //assertEqualsText(text, enter_username);
        setValue(enter_lastname, text);
        logger.info("Entered the username, Passed");
    }
    public void assertUserName(String text){
        By lbl_username = paths.get("lbl Username");
        assertEqualsText(text, lbl_username);
        logger.info("username checked, Passed");
    }
    public void EnterUserName(String text){
        By enter_username = paths.get("textBox username");
        //assertEqualsText(text, enter_username);
        setValue(enter_username, text);
        logger.info("Entered the username, Passed");
    }
    public void assertEmail(String text){
        By lbl_email= paths.get("lbl email");
        assertEqualsText(text, lbl_email);
        logger.info("Email text checked, Passed");
    }
    public void EnterEmail(String text){
        By enter_Email = paths.get("textbox Email");
        setValue(enter_Email, text);
        logger.info("Entered the email, Passed");
    }
    public void assertPassword(String text){
        By lbl_password = paths.get("lbl Password");
        assertEqualsText(text, lbl_password);
        logger.info("Password checked, Passed");
    }
    public void EnterPassword(String text){
        By enter_password = paths.get("text Password");
        setValue(enter_password, text);
        logger.info("Entered the Password, Passed");
    }
    public void clickOnLoginLink(){
        By click_login = paths.get("Click on Login link to go login page");
        click_btn(click_login);
        logger.info("click on the login link, Passed");
    }
    public void clickOnCreateButton(){
        By click_create = paths.get("Create Account");
        click_btn(click_create);
        logger.info("click on the login link, Passed");
    }
    public void assertSuccessMessage(String text){
         By success_message = paths.get("Error Message");
         String message = getElementText(success_message);
         assertEqualsText(text, success_message);
         logger.info("User register successfully, Passed");
    }
    public void firstNameRequired(String text){
        By text_firstname = paths.get("first name is required");
        assertEqualsText(text, text_firstname);
        logger.info("text first name is required checked, Passed");
    }
    public void lastNameRequired(String text){
        By text_lastname = paths.get("last name is required");
        assertEqualsText(text, text_lastname);
        logger.info("text last is required is  checked, Passed");
    }
    public void usernameRequired(String text){
        By text_username = paths.get("user name is required");
        assertEqualsText(text, text_username);
        logger.info("text username is required is checked, Passed");
    }
    public void emailRequired(String text){
        By text_email = paths.get("email is required");
        assertEqualsText(text, text_email);
        logger.info("text email is required is checked, Passed");
    }
    public void passwordRequired(String text){
        By text_password = paths.get("password is required");
        assertEqualsText(text, text_password);
        logger.info("text Password is required is checked, Passed");
    }
}
