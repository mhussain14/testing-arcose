package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;

import java.util.concurrent.TimeUnit;

public class ViewSteps extends BaseSteps{

    @Before
    public void setup() throws InterruptedException {
        setupCucumber();
    }
    @And("^click on view \"(.*)\" on the home page$")
    public void click_on_view_on_the_home_page(String text){
        viewPage.clickOnViewText(text);
    }
    @And("^text h1 \"(.*)\" on the view page$")
    public void text_h1_on_the_home_page(String text){
        viewPage.assertH1(text);
    }
    @And("^text p2 \"(.*)\" on the view page$")
    public void text_p2_on_the_home_page(String text){
        viewPage.assertP2(text);
    }
    @And("^text p3 \"(.*)\" on the view page$")
    public void text_p3_on_the_view_page(String text){
        viewPage.assertP3(text);
    }
    @And("^text PC IDE \"(.*)\" on the view page$")
    public void text_PC_IDE_on_the_view_page(String text){
       viewPage.assertSDKPCIDE(text);
    }
    @And("^text p5 \"(.*)\" on the view page$")
    public void text_p5_on_the_view_page(String text){
        viewPage.assertP5(text);
    }
    @And("^text p6 \"(.*)\" on the view page$")
    public void text_p6_on_the_view_page(String text){
       viewPage.assertP6(text);
    }
    @And("^click on the forums \"(.*)\" on the home page$")
    public void click_on_the_forums_on_the_home_page(String text){
        getTDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        viewPage.clickOnForumsText(text);
    }
    @And("^check the text \"(.*)\" on the forums page$")
    public void check_the_text_on_the_forums_page(String text){
        viewPage.assertForumsHeader(text);
    }
    @And("^click on the documents \"(.*)\" on the home page$")
    public void click_on_the_documents_on_the_home_page(String text){
        getTDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        viewPage.clickOnDocumentsText(text);
    }
    @And("^check the text documents \"(.*)\" on the documents page$")
    public void check_the_text_documents_on_the_documents_page(String text){
        viewPage.assertDocumentsPageHeader(text);
    }
    @And("^click on the videos \"(.*)\" on the home page$")
    public void click_on_the_videos_on_the_home_page(String text){
        getTDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        viewPage.clickOnVideosText(text);
    }
    @And("^check the text videos \"(.*)\" on the videos page$")
    public void check_the_text_videos_on_the_videos_page(String text){
        viewPage.assertVideosPageHeader(text);
    }
    @And("^click on the application \"(.*)\" on the home page$")
    public void click_on_the_application_on_the_home_page(String text){
        getTDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        viewPage.clickOnApplicationText(text);
    }
    @And("^check the text application \"(.*)\" on the application note page$")
    public void check_the_text_on_the_application_note_page(String text){
        viewPage.assertApplicationPageHeader(text);
    }
    @And("^click on the downloads \"(.*)\" on the home page$")
    public void click_on_the_downloads_on_the_home_page(String text){
        getTDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        viewPage.clickOnDownloadsText(text);
    }
    @And("^check the text downloads \"(.*)\" on the download page$")
    public void check_the_text_on_the_download_page(String text){
        viewPage.assertDownloadsPageHeader(text);
    }
}
