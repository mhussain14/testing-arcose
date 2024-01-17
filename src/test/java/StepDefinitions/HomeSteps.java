package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;

import java.util.concurrent.TimeUnit;

public class HomeSteps extends BaseSteps{

    @Before
    public void setup() throws InterruptedException {
        setupCucumber();
    }

    @And("^text homepage \"(.*)\" on the home screen$")
    public void text_homepage_on_the_home_screen(String text){
        homePage.assertHomeButton(text);
    }
    @And("^text banner \"(.*)\" on the home screen$")
    public void text_banner_on_the_home_screen(String text){
        homePage.assertBanner(text);
    }
    @And("^text view \"(.*)\" on home screen$")
    public void text_view_on_the_home_screen(String text){
        homePage.assertViewButton(text);
    }
    @And("^text arcossdk \"(.*)\" on the home screen$")
    public void text_arcossdk_on_the_home_screen(String text){
        homePage.assertArcosSdk(text);
    }
    @And("^text keyfeature \"(.*)\" on the home screen$")
    public void text_keyfeature_on_the_home_screen(String text){
        homePage.assertKeyFeature(text);
    }
    @And("^text card title \"(.*)\" on the home screen$")
    public void text_card_title_on_the_home_screen(String text){
        homePage.assertDesignEasily(text);
    }
    @And("^text card info \"(.*)\" on the home screen")
    public void text_card_info_on_the_home_screen(String text){
        getTDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        homePage.assertDesignEasilyParagraph(text);
    }
    @And("^text card title1 \"(.*)\" on the home screen$")
    public void text_card_title1_on_the_home_screen(String text){
        homePage.assertLibrarySupport(text);
    }
    @And("^text card info1 \"(.*)\" on the home screen$")
    public void text_card_info1_on_the_home_screen(String text){
        homePage.assertLibrarySupportParagraph(text);
    }
    @And("^text card title2 \"(.*)\" on the home screen$")
    public void text_card_title2_on_the_home_screen(String text){
        homePage.assertCodeTry(text);
    }
    @And("^text card info2 \"(.*)\" on the home screen$")
    public void text_card_info2_on_the_home_screen(String text){
       homePage.assertCodeTryParagraph(text);
    }
    @And("^text section3 \"(.*)\" on the home screen$")
    public void text_section3_on_the_screen(String text){
        homePage.assertWhyRcos(text);
    }
    @And("^text SDK paragraph \"(.*)\" on the home screen$")
    public void text_sdk_paragraph_on_the_home_screen(String text){
        homePage.assertWhyParagraph(text);
    }
    @And("^text view1 \"(.*)\" on the home screen$")
    public void text_view1_on_the_home_screen(String text){
        homePage.assertViewLink(text);
    }
    @And("^text use cases \"(.*)\" on the home screen$")
    public void text_use_cases_on_the_home_screen(String text){
        homePage.assertUseCase(text);
    }
    @And("^text header \"(.*)\" on the home screen$")
    public void text_header_on_the_home_screen(String text){
        homePage.assertElectronicPlateForm(text);
    }
    @And("^text point1 \"(.*)\" on the home screen$")
    public void text_point1_on_the_home_screen(String text){
        homePage.assertElectronicPlateFormPoint1(text);
    }
    @And("^text point2 \"(.*)\" on the home screen$")
    public void text_point2_on_the_home_screen(String text){
        homePage.assertElectronicPlateFormPoint2(text);
    }
    @And("^text point3 \"(.*)\" on the home screen$")
    public void text_point3_on_the_home_screen(String text){
        homePage.assertElectronicPlateFormPoint3(text);
    }
    @And("^text point4 \"(.*)\" on the home screen$")
    public void text_point4_on_the_home_screen(String text){
        homePage.assertElectronicPlateFormPoint4(text);
    }
    @And("^text header1 \"(.*)\" on the home screen$")
    public void text_header1_on_the_home_screen(String text){
        homePage.assertSecureIoT(text);
    }
    @And("^text iot point1 \"(.*)\" on the home screen$")
    public void text_iot_point1_on_the_home_screen(String text){
        homePage.assertSecureIoTPoint1(text);
    }
    @And("^text iot point2 \"(.*)\" on the home screen$")
    public void text_iot_point2_on_the_home_screen(String text){
        homePage.assertSecureIoTPoint2(text);
    }
    @And("^text iot point3 \"(.*)\" on the home screen$")
    public void text_iot_point3_on_the_home_screen(String text){
        homePage.assertSecureIoTPoint3(text);
    }
    @And("^text iot point4 \"(.*)\" on the home screen$")
    public void text_iot_point4_on_the_home_screen(String text){
        homePage.assertSecureIoTPoint4(text);
    }
    @And("^text iot point5 \"(.*)\" on the home screen$")
    public void text_iot_point5_on_the_home_screen(String text){
        homePage.assertSecureIoTPoint5(text);
    }
    @And("^text iot point6 \"(.*)\" on the home screen$")
    public void text_iot_point6_on_the_home_screen(String text){
       homePage.assertSecureIoTPoint6(text);
    }
    @And("^text download \"(.*)\" on the home screen$")
    public void text_download_on_the_home_screen(String text){
        homePage.assertDownload(text);
    }
    @And("^text download paragraph \"(.*)\" on the home screen$")
    public void text_download_paragraph_on_the_home_screen(String text){
        homePage.assertDownloadParagraph(text);
    }
    @And("^text download button \"(.*)\" on the home screen$")
    public void text_download_button_on_the_home_screen(String text){
       homePage.assertDownloadButton(text);
    }
    @And("^text version \"(.*)\" on the footer")
    public void text_version_on_the_footer(String text){
        homePage.assertVersionText(text);
    }
    @And("^text home page \"(.*)\" on the footer$")
    public void text_home_page_on_the_footer(String text){
        homePage.assertHomePage(text);
    }
    @And("^text forums \"(.*)\" on the footer$")
    public void text_forums_on_the_footer(String text){
        getTDriver().manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        homePage.assertForums(text);}
    @And("^text articles \"(.*)\" on the footer$")
    public void text_articles_on_the_footer(String text){
        homePage.assertArticles(text);
    }
    @And("^text documents \"(.*)\" on the footer$")
    public void text_documents_on_the_footer(String text){
        homePage.assertDocuments(text);
    }
    @And("^text videos \"(.*)\" on the footer$")
    public void text_videos_on_the_footer(String text){
        homePage.assertVideos(text);
    }
    @And("^text FAQ \"(.*)\" on the footer$")
    public void text_faq_on_the_footer(String text){
        homePage.assertFAq(text);
    }
}
