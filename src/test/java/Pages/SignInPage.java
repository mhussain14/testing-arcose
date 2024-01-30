package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class SignInPage extends BaseScreen{

    HashMap<String, By> paths = new HashMap<>();

    public SignInPage(WebDriver driver) {
        super(driver);

        paths.put("lbl email", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[1]//p[text() = 'Email']"));
        paths.put("textbox Email", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[1]//div//div//input[@id = 'login-email']"));
        paths.put("lbl Password", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[2]//p[text() = 'Password']"));
        paths.put("text Password", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//form//li[2]//div//div//input[@id = 'login-password']"));
        paths.put("Click on Login link to go login page", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul[1]//form//div[1]//button[@class = 'btn-defaultundefined']"));
        paths.put("email is required", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[1]//div//p[@id = 'login-email-helper-text']"));
        paths.put("password is required", By.xpath("//div[@id = 'demo-customized-menu']//div[3]//ul//form//li[2]//div//p[@id = 'login-password-helper-text']"));

        paths.put("Log out", By.cssSelector("div#__next > div:nth-child(1) > nav:nth-child(2) > div:nth-child(1) > div:nth-child(3) button#demo-customized-button"));
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
    public void textLogout(String text){
        By text_logout = paths.get("Log out");
        assertEqualsText(text, text_logout);
        logger.info("Password checked, Passed");
    }
    public void logout(){
        By click_logout = paths.get("Log out");
        click_btn(click_logout);
        logger.info("click on log out button to log out form the website, Passed");
    }
}
