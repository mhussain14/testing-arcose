package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class EditUserProfileSteps extends BaseSteps{

    @Before()
    public void setup() throws InterruptedException {
        setupCucumber();
    }
    @And("^click on profile edit button$")
    public void click_on_profile_edit_button(){
        editUserProfilePage.clickOnProfileButton();
    }
    @And("^user profile image should be displayed$")
    public void user_profile_image_should_be_displayed(){
       editUserProfilePage.profileImageIsDisplayed();
    }
    @And("^text \"(.*)\" click on profile button on the user profile page$")
    public void click_on_profile_button_on_the_user_profile_page(String text){editUserProfilePage.clickOnProfileButton(text);}
    @And("text user name \"(.*)\" on the user profile page$")
    public void text_user_name_on_the_user_profile_page(String text){
       editUserProfilePage.assertUserName(text);
    }
    @And("text profile \"(.*)\" on the user profile page$")
    public void text_profile_on_the_user_profile_page(String text){
        editUserProfilePage.assertProfile(text);
    }
    @And("text registered \"(.*)\" on the user profile page$")
    public void text_registered_on_the_user_profile_page(String text){editUserProfilePage.assertRegistered(text);}
    @And("text forum \"(.*)\" on the user profile page$")
    public void text_forum_on_the_user_profile_page(String text){
        editUserProfilePage.assertForums(text);
    }
    @And("text topic started \"(.*)\" on the user profile page$")
    public void text_topic_started_on_the_user_profile_page(String text){editUserProfilePage.assertTopicStarted(text);}
    @And("text replies created \"(.*)\" on the user profile page$")
    public void text_replies_created_on_the_user_profile_page(String text){editUserProfilePage.assertRepliesCreated(text);}
    @And("text forum role \"(.*)\" on the user profile page$")
    public void text_forum_role_on_the_user_profile_page(String text){
       editUserProfilePage.assertForumsRole(text);
    }
    @And("text topic \"(.*)\" on the user profile page$")
    public void text_topic_on_the_user_profile_page(String text){editUserProfilePage.assertTopic(text);}
    @And("^text replies \"(.*)\" on the user profile page$")
    public void text_replies_on_the_user_profile_page(String text){
        editUserProfilePage.assertReplies(text);
    }
    @And("^text rookie \"(.*)\" on the user profile page$")
    public void tex_rookie_on_the_profile_page(String text){
        editUserProfilePage.assertRookie(text);
    }
    @And("^text \"(.*)\" and click on profile hyperlink$")
    public void text_and_click_on_profile_hyperlink(String text){
        editUserProfilePage.assertProfile(text);
    }
    @And("^text \"(.*)\" and click on topic started hyperlink$")
    public void text_and_click_on_topic_started_hyperlink(String text){editUserProfilePage.clickOnTopicStartedButton(text);}
    @And("^text \"(.*)\" and click on replies created hyperlink$")
    public void text_and_click_on_replies_created_hyperlink(String text){editUserProfilePage.clickOnRepliesCreatedButton(text);}
    @And("^text \"(.*)\" and click on engagement hyperlink$")
    public void text_and_click_on_engagement_hyperlink(String text){editUserProfilePage.clickOnEngagementButton(text);}
    @And("^text \"(.*)\" and click on favorites hyperlink$")
    public void text_and_click_on_favorites_hyperlink(String text){
        editUserProfilePage.clickOnFavoritesButton(text);
    }
    @And("^text \"(.*)\" and click on subscription hyperlink$")
    public void text_and_click_on_subscription_hyperlink(String text){
       editUserProfilePage.clickOnSubscriptionButton(text);
    }
    @And("^text \"(.*)\" and click on edit hyperlink$")
    public void text_and_click_on_edit_hyperlink(String text) throws InterruptedException {
        Thread.sleep(3000);
        editUserProfilePage.clickOnEditButton(text);
    }
    @And("^text name \"(.*)\" on the edit page$")
    public void text_name_on_the_edit_page(String text) throws InterruptedException {
        Thread.sleep(3000);
        editUserProfilePage.assertName(text);
    }
    @And("^text first name \"(.*)\" on the edit page$")
    public void text_first_name_on_the_edit_page(String text){
       editUserProfilePage.assertFirstName(text);
    }
    @And("^update the first name \"(.*)\" on the edit page$")
    public void updateFirstName(String text){
        editUserProfilePage.updateFirstName(text);
    }
    @And("^text last name \"(.*)\" on the edit page$")
    public void text_last_name_on_the_edit_page(String text){
        editUserProfilePage.assertLastName(text);
    }
    @And("^update last name \"(.*)\" on the edit page$")
    public void update_last_name_on_the_edit_page(String text){
        editUserProfilePage.updateLastName(text);
    }
    @And("^text nick name \"(.*)\" on the edit page$")
    public void text_nick_name_on_the_edit_page(String text){
        editUserProfilePage.assertNickName(text);
    }
    @And("^update nick name \"(.*)\" on the edit page$")
    public void update_Nick_Name_on_the_edit_Page(String text){
        editUserProfilePage.updateNickName(text);
    }
    @And("^text display name \"(.*)\" on the edit page$")
    public void text_display_name_on_the_edit_page(String text){
        editUserProfilePage.assertDisplayName(text);
    }
    @And("^update display name \"(.*)\" on the edit page$")
    public void update_display_Name_on_the_edit_page(String text){
        editUserProfilePage.updateDisplayName(text);
    }
    @And("^text contact info \"(.*)\" on the edit page$")
    public void text_contact_info_on_the_edit_page(String text){
        editUserProfilePage.assertTextContactInfo(text);
    }
    @And("^text website \"(.*)\" on the edit page$")
    public void text_website_on_the_edit_page(String text){
        editUserProfilePage.assertWebsite(text);
    }
    @And("^update website \"(.*)\" on the edit page$")
    public void update_Website_on_the_edit_page(String text){
        editUserProfilePage.updateWebsiteName(text);
    }
    @And("^text about yourself \"(.*)\" on the edit page$")
    public void text_about_yourself_on_the_edit_page(String text){
        editUserProfilePage.assertTextAboutYourself(text);
    }
    @And("^text biographical info \"(.*)\" on the edit page$")
    public void text_biographical_on_the_edit_page(String text){
        editUserProfilePage.assertBiographicalInfo(text);
    }
    @And("^update biographical info \"(.*)\" on the edit page$")
    public void update_Biographical_info_on_the_edit_page(String text){
       editUserProfilePage.updateBiographicalInfo(text);
    }
    @And("^text account \"(.*)\" on the edit page$")
    public void text_account_on_the_edit_page(String text){
        editUserProfilePage.assertTextAccount(text);
    }
    @And("^text username \"(.*)\" on the edit page$")
    public void text_username_on_the_edit_page(String text){
        editUserProfilePage.assertTextUserName(text);
    }
    @And("^update the username \"(.*)\" on the edit page$")
    public void update_the_username_on_the_edit_page(String text){
        editUserProfilePage.updateUserName(text);
    }
    @And("^text email \"(.*)\" on the edit page$")
    public void text_email_on_the_edit_page(String text){
        editUserProfilePage.assertTextEmail(text);
    }
    @And("^update the email \"(.*)\" on the edit page$")
    public void update_the_email_on_the_edit_page(String text){
        editUserProfilePage.updateEmail(text);
    }
    @And("^text password \"(.*)\" on the edit page$")
    public void text_password_on_the_edit_page(String text){
       editUserProfilePage.assertTextPassword(text);
    }
    @And("^generate password by clicking on button \"(.*)\" on the edit page$")
    public void generate_Password_by_clicking_on_button_on_the_edit_page(String text){
        editUserProfilePage.generatePassword(text);
    }
    @And("^text language \"(.*)\" on the edit page$")
    public void text_language_ont_the_page(String text){
        editUserProfilePage.assertTextLanguage(text);
    }
    @And("^update language \"(.*)\" on the edit page$")
    public void update_the_language_on_the_edit_page(String text){
        editUserProfilePage.updateLanguage(text);
    }
    @And("^text two factor \"(.*)\" on the edit page$")
    public void text_two_factor_on_the_edit_page(String text){
        editUserProfilePage.assertTextTwoFactor(text);
    }
    @And("^click on two factor text \"(.*)\" on the edit page$")
    public void click_on_two_on_the_edit_page(String text){
        editUserProfilePage.clickOnTextTwoFactor(text);
    }
    @And("^text profile pic \"(.*)\" on the edit profile page$")
    public void text_profile_pic_on_the_edit_profile_page(String text){
        editUserProfilePage.assertTextProfilePic(text);
    }
    @And("^text \"(.*)\" choose the image$")
    public void text_choose_the_image(String text){
        editUserProfilePage.clickOnChooseImage(text);
    }
    @And("^image should be displayed$")
    public void image_should_be_displayed(){
        editUserProfilePage.assertTrueIsDisplayed();
    }
    @And("^click on update profile button$")
    public void click_on_update_profile_button(String text){
       editUserProfilePage.clickOnUpdateButton(text);
    }
}
