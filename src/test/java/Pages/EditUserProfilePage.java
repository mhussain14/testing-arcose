package Pages;

import org.bytedeco.opencv.presets.opencv_core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class EditUserProfilePage extends BaseScreen{

    HashMap<String , By> paths = new HashMap<>();
    public EditUserProfilePage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
        paths.put("click on edit profile", By.cssSelector("div#__next > div:nth-child(1) > nav:nth-child(2) > div > div:nth-child(4) >  div"));
        paths.put("profile image", By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div"));
        paths.put("text profile page",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div > button"));
        paths.put("text user name",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h6:nth-child(1)"));
        paths.put("text profile",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h6:nth-child(2)"));
        paths.put("text time",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h6:nth-child(3)"));
        paths.put("text forums",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h6:nth-child(1)"));
        paths.put("text topics started",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h6:nth-child(2)"));
        paths.put("text replies created",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h6:nth-child(3)"));
        paths.put("text forum role",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h6:nth-child(4)"));
        paths.put("text topic",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h6:nth-child(5)"));
        paths.put("text replies",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h6:nth-child(6)"));
        paths.put("text rookie",By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h6:nth-child(7)"));

        paths.put("button topic started", By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div > button"));
        paths.put("button replies created", By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div > button"));
        paths.put("button engagement", By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div > button"));
        paths.put("button favorites", By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div > button"));
        paths.put("button subscriptions", By.cssSelector("div#__next > main > div:nth-child(1) > div:nth-child(1) > div:nth-child(7) > div > button"));

        paths.put("button Edit", By.xpath("//div[@ id = '__next']/main/div[1]/div[1]/ div[8]/div/button"));
        paths.put("text name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > h6:nth-child(1)"));
        paths.put("text first name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(1) > span"));
        paths.put("update first name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(1) > div > div > input"));
        paths.put("text last name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > span"));
        paths.put("update last name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > div > div > input"));
        paths.put("text nick name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(3) > span"));
        paths.put("update nick name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(3) > div > div > input"));
        paths.put("text display name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(4) > span"));
        paths.put("update display name", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(4) > div > div > input"));

        paths.put("text contact info", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > h6:nth-child(3)"));
        paths.put("text website", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(4) > div:nth-child(1) > span"));
        paths.put("update website", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(4) > div:nth-child(1) > div > div > input"));

        paths.put("text about yourself", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > h6:nth-child(5)"));
        paths.put("text biographical info", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(6) > div:nth-child(1) > span"));
        paths.put("update biographical info", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(6) > div:nth-child(1) > div > div > textarea:nth-child(1) "));

        paths.put("text Account", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > h6:nth-child(7)"));
        paths.put("text username", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(8) > div:nth-child(1) > span"));
        paths.put("update username", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(8) > div:nth-child(1) > div > div > input"));
        paths.put("text email", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(8) > div:nth-child(2) > span"));
        paths.put("update email", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(8) > div:nth-child(2) > div > div > input"));
        paths.put("text password", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(8) > div:nth-child(3) > span"));
        paths.put("generate password", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(8) > div:nth-child(3) > div > button"));
        paths.put("text language", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(8) > div:nth-child(4) > span"));
        paths.put("update language", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(8) > div:nth-child(4) > div > div > input"));


        paths.put("text two factor", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > h6:nth-child(9)"));
        paths.put("text two factor authentication link", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > a:nth-child(10)"));

        paths.put("text profile pic", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > h6:nth-child(11)"));
        paths.put("choose image", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(12) > div > button"));
        paths.put("image", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(12) > div:nth-child(2) > img"));
        paths.put("update profile button", By.cssSelector("div#__next > main > div > div:nth-child(2) > div > div:nth-child(13) > div > button.btn-defaultundefined"));

    }
    public void clickOnProfileButton(){
        By click_profile = paths.get("click on edit profile");
        click_btn(click_profile);
        logger.info("click is performed, Passed");
    }
    public void profileImageIsDisplayed(){
        By image = paths.get("profile image");
        assertTrueDisplayed(image);
        logger.info("profile image is displayed, Passed");
    }
    public void clickOnProfileButton(String text){
        By profile_button = paths.get("text profile page");
        assertEqualsText(text,profile_button);
        click_btn(profile_button);
        logger.info("click on profile button, Passed");
    }
    public void assertUserName(String text){
        By verify_text = paths.get("text user name");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertProfile(String text){
        By verify_text = paths.get("text profile");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertRegistered(String text){
        By verify_text = paths.get("text time");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertForums(String text){
        By verify_text = paths.get("text forums");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertTopicStarted(String text){
        By verify_text = paths.get("text topics started");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertRepliesCreated(String text){
        By verify_text = paths.get("text replies created");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertForumsRole(String text){
        By verify_text = paths.get("text forum role");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertTopic(String text){
        By verify_text = paths.get("text topic");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertReplies(String text){
        By verify_text = paths.get("text replies");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void assertRookie(String text){
        By verify_text = paths.get("text rookie");
        assertEqualsText(text,verify_text);
        logger.info(text + " i checked, Passed");
    }
    public void clickOnTopicStartedButton(String text){
        By profile_button = paths.get("button topic started");
        assertEqualsText(text,profile_button);
        click_btn(profile_button);
        logger.info("click on topic started button, Passed");
    }
    public void clickOnRepliesCreatedButton(String text){
        By profile_button = paths.get("button replies created");
        assertEqualsText(text,profile_button);
        click_btn(profile_button);
        logger.info("click on replies created button, Passed");
    }
    public void clickOnEngagementButton(String text){
        By profile_button = paths.get("button engagement");
        assertEqualsText(text,profile_button);
        click_btn(profile_button);
        logger.info("click on engagement button, Passed");
    }
    public void clickOnFavoritesButton(String text){
        By profile_button = paths.get("button favorites");
        assertEqualsText(text,profile_button);
        click_btn(profile_button);
        logger.info("click on favorites button, Passed");
    }
    public void clickOnSubscriptionButton(String text){
        By profile_button = paths.get("button subscriptions");
        assertEqualsText(text,profile_button);
        click_btn(profile_button);
        logger.info("click on subscription button, Passed");
    }
    public void clickOnEditButton(String text){
        By profile_button = paths.get("button edit");
        assertEqualsText(text, profile_button);
        click_btn(profile_button);
        logger.info("click on edit button, Passed");
    }
    public void assertName(String text){
        By verify_text = paths.get("text name");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void assertFirstName(String text){
        By enter_value = paths.get("text first name");
        assertEqualsText(text, enter_value);
        logger.info(text+ " is checked, Passed");
    }
    public void updateFirstName(String text){
        By verify_text = paths.get("update first name");
        setValue(verify_text,text);
        logger.info(text+ " is checked, Passed");
    }
    public void assertLastName(String text){
        By verify_text = paths.get("text last name");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void updateLastName(String text){
        By enter_value = paths.get("update last name");
        setValue(enter_value,text);
        logger.info(text+ " name is entered, Passed");
    }
    public void assertNickName(String text){
        By verify_text = paths.get("text nick name");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void updateNickName(String text){
        By enter_value = paths.get("update nick name");
        setValue(enter_value,text);
        logger.info(text+ " name is entered, Passed");
    }
    public void assertDisplayName(String text){
        By verify_text = paths.get("text display name");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void updateDisplayName(String text){
        By enter_value = paths.get("update display name");
        setValue(enter_value,text);
        logger.info("enter the display name "+text+ ", Passed");
    }
    public void assertTextContactInfo(String text){
        By verify_text = paths.get("text contact info");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void assertWebsite(String text){
        By verify_text = paths.get("text website");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void updateWebsiteName(String text){
        By enter_value = paths.get("update website");
        setValue(enter_value,text);
        logger.info("enter website name " +text+", Passed");
    }
    public void assertTextAboutYourself(String text){
        By verify_text = paths.get("text about yourself");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void assertBiographicalInfo(String text){
        By verify_text = paths.get("text biographical info");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void updateBiographicalInfo(String text){
        By enter_value = paths.get("update biographical info");
        setValue(enter_value,text);
        logger.info("enter biographical info " +text+", Passed");
    }
    public void assertTextAccount(String text){
        By verify_text = paths.get("text account");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void assertTextUserName(String text){
        By verify_text = paths.get("text username");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void updateUserName(String text){
        By enter_value = paths.get("update username");
        setValue(enter_value,text);
        logger.info("enter user name to update  " +text+", Passed");
    }
    public void assertTextEmail(String text){
        By verify_text = paths.get("text email");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void updateEmail(String text){
        By enter_value = paths.get("update email");
        setValue(enter_value,text);
        logger.info("enter email " +text+" to update, Passed");
    }
    public void assertTextPassword(String text){
        By verify_text = paths.get("text password");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void generatePassword(String text){
        By generate_pass = paths.get("generate password");
        assertEqualsText(text,generate_pass);
        click_btn(generate_pass);
        logger.info("generate password, Passed");
    }
    public void assertTextLanguage(String text){
        By verify_text = paths.get("text language");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void updateLanguage(String text){
        By enter_value = paths.get("generate language");
        assertEqualsText(text,enter_value);
        click_btn(enter_value);
        logger.info("enter new language, Passed");
    }
    public void assertTextTwoFactor(String text){
        By verify_text = paths.get("text two factor");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void clickOnTextTwoFactor(String text){
        By enter_value = paths.get("text two factor authentication link");
        assertEqualsText(text,enter_value);
        click_btn(enter_value);
        logger.info("click on two factor authentication, Passed");
    }
    public void assertTextProfilePic(String text){
        By verify_text = paths.get("text profile pic");
        assertEqualsText(text, verify_text);
        logger.info(text+ " is checked, Passed");
    }
    public void clickOnChooseImage(String text){
        By choose_image = paths.get("choose image");
        assertEqualsText(text,choose_image);
        click_btn(choose_image);
        logger.info("profile picture is uploaded, Passed");
    }
    public void assertTrueIsDisplayed(){
        By image = paths.get("image");
        click_btn(image);
        logger.info("profile is displayed, Passed");
    }
    public void clickOnUpdateButton(String text){
        By choose_image = paths.get("update profile button");
        assertEqualsText(text,choose_image);
        click_btn(choose_image);
        logger.info("profile picture is uploaded, Passed");
    }

}
