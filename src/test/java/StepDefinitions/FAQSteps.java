package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class FAQSteps extends BaseSteps{

    @Before()
    public void setup() throws InterruptedException {
        setupCucumber();
    }
    @And("^verify the image on the FAQ page$")
    public void verify_the_image_on_the_FAQ_page(){
        faqPage.imageIsDisplayed();
    }
    @And("^text h5 \"(.*)\" on the FAQ page$")
    public void text_h5_on_the_FAQ_page(String text){
        faqPage.assertSoftwareDevelopmentKitText(text);
    }
    @And("^text home \"(.*)\" on the FAQ page$")
    public void text_home_on_the_FAQ_page(String text){
        faqPage.assertHomeText(text);
    }
    @And("^text FAQ \"(.*)\" on the FAQ page$")
    public void text_FAQ_on_the_FAQ_page(String text){faqPage.assertFAQText(text);}
    @And("^text h6 \"(.*)\" on the FAQ page$")
    public void text_h6_on_the_FAQ_page(String text){
        faqPage.assertHeaderH6Text(text);
    }
    @And("^text p1 \"(.*)\" on the FAQ page$")
    public void text_p1_on_the_FAQ_page(String text){
        faqPage.assertP1Text(text);
    }
    @And("^text H6 \"(.*)\" on the FAQ page$")
    public void text_H6_on_the_FAQ_page(String text){faqPage.assertHeader1H6Text(text);}
    @And("^text p2 \"(.*)\" on the FAQ page$")
    public void text_p2_on_the_FAQ_page(String text){
       faqPage.assertP2Text(text);
    }
    @And("^text rookie \"(.*)\" on the FAQ page$")
    public void text_rookie_on_the_FAQ_page(String text){
        faqPage.assertRookieText(text);
    }
    @And("^text rookie point \"(.*)\" on the FAQ page$")
    public void text_rookie_point_on_the_FAQ_page(String text){
       faqPage.assertRookiePointText(text);
    }
    @And("^text familiar \"(.*)\" on the FAQ page$")
    public void text_familiar_on_the_FAQ_page(String text){
       faqPage.assertFamiliarText(text);
    }
    @And("^text familiar point \"(.*)\" on the FAQ page$")
    public void text_familiar_point_on_the_FAQ_page(String text){
        faqPage.assertFamiliarPointText(text);
    }
    @And("^text doer \"(.*)\" on the FAQ page$")
    public void text_doer_on_the_FAQ_page(String text){
       faqPage.assertDoerText(text);
    }
    @And("^text doer point \"(.*)\" on the FAQ page$")
    public void text_doer_point_on_the_FAQ_page(String text){
        faqPage.assertDoerPointText(text);
    }
    @And("^text helper \"(.*)\" on the FAQ page$")
    public void text_helper_on_the_FAQ_page(String text){
        faqPage.assertHelperText(text);
    }
    @And("^text helper point \"(.*)\" on the FAQ page$")
    public void text_helper_point_on_the_FAQ_page(String text){
        faqPage.assertHelperPointText(text);
    }
    @And("^text advisor \"(.*)\" on the FAQ page$")
    public void text_advisor_on_the_FAQ_page(String text){
        faqPage.assertAdvisorText(text);
    }
    @And("^text advisor point \"(.*)\" on the FAQ page$")
    public void text_advisor_point_on_the_FAQ_page(String text){
       faqPage.assertAdvisorPointText(text);
    }
    @And("^text master \"(.*)\" on the FAQ page$")
    public void assertMasterText(String text){
        faqPage.assertMasterText(text);
    }
    @And("^text master point \"(.*)\" on the FAQ page$")
    public void text_master_on_the_FAQ_page(String text){
        faqPage.assertMasterPointText(text);
    }
    @And("^text grand master \"(.*)\" on the FAQ page$")
    public void text_grand_master_on_the_FAQ_page(String text){
        faqPage.assertGrandMasterText(text);
    }
    @And("^text grand master point \"(.*)\" on the FAQ page$")
    public void text_grand_master_point_on_the_FAQ_page(String text){
        faqPage.assertGrandMasterPointText(text);
    }
    @And("^text mvp \"(.*)\" on the FAQ page$")
    public void text_mvp_on_the_FAQ_page(String text){
        faqPage.assertMVpText(text);
    }
    @And("^text mvp point \"(.*)\" on the FAQ page$")
    public void text_mvp_point_on_the_FAQ_page(String text){
        faqPage.assertMVPPointText(text);
    }
}
