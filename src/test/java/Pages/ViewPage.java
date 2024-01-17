package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class ViewPage extends BaseScreen{

    HashMap<String, By> paths = new HashMap<>();
    public ViewPage(WebDriver driver) {
        super(driver);

        paths.put("view text", By.cssSelector("div.MuiBox-root.css-k008qs > nav > div > div:nth-child(2) > button:nth-child(2)"));
        paths.put("text h1", By.cssSelector("div.view_page_heading__9VisV > h1"));
        paths.put("text p2", By.cssSelector("div.view_main_article__Vfzvd > div:nth-child(1) > p:nth-child(2)"));
        paths.put("text p3", By.cssSelector("div.view_main_article__Vfzvd > div:nth-child(1) > p:nth-child(3)"));
        paths.put("sdk pc IDE", By.cssSelector("div.view_main_article__Vfzvd > div:nth-child(1) > div > div > span"));
        paths.put("text p5", By.cssSelector("div.view_main_article__Vfzvd > div:nth-child(1) > p:nth-child(5)"));
        paths.put("text p6", By.cssSelector("div.view_main_article__Vfzvd > div:nth-child(1) > p:nth-child(6)"));
        // Forums
        paths.put("click on forums", By.cssSelector("div.MuiBox-root.css-k008qs > nav > div > div:nth-child(2) > button:nth-child(3)"));
        paths.put("text forums", By.cssSelector("div.MuiContainer-root.MuiContainer-maxWidthLg.css-fwkw4m-MuiContainer-root > h5"));
        // Documents
        paths.put("click on documents", By.cssSelector("div.MuiBox-root.css-k008qs > nav > div > div:nth-child(2) > button:nth-child(4)"));
        paths.put("text documents", By.cssSelector("div.MuiBox-root.css-7tvktr > h4"));
        // Videos
        paths.put("click on videos", By.cssSelector("div.MuiBox-root.css-k008qs > nav > div > div:nth-child(2) > button:nth-child(5)"));
        paths.put("text videos", By.cssSelector("div.MuiBox-root.css-7tvktr > h3"));
        // Application Note
        paths.put("click on application notes", By.cssSelector("div.MuiBox-root.css-k008qs > nav > div > div:nth-child(2) > button:nth-child(6)"));
        paths.put("text application", By.cssSelector("div.MuiBox-root.css-7tvktr > h4"));
        // Downloads
        paths.put("click on downloads", By.cssSelector("div.MuiBox-root.css-k008qs > nav > div > div:nth-child(2) > button:nth-child(7)"));
        paths.put("text Oops", By.cssSelector("div#__next > main > div > h1"));

    }
    public void clickOnViewText(String text){
        By click_view = paths.get("view text");
        assertEqualsText(text, click_view);
        click_btn(click_view);
        logger.info("click on view button, passed");
    }
    public void assertH1(String text){
        By verify_text = paths.get("text h1");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void assertP2(String text){
        By verify_text = paths.get("text p2");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void assertP3(String text){
        By verify_text = paths.get("text p3");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void assertSDKPCIDE(String text){
        By verify_text = paths.get("sdk pc IDE");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void assertP5(String text){
        By verify_text = paths.get("text p5");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void assertP6(String text){
        By verify_text = paths.get("text p6");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void clickOnForumsText(String text){
        By click_view = paths.get("click on forums");
        assertEqualsText(text, click_view);
        click_btn(click_view);
        logger.info("click on forums button, passed");
    }
    public void assertForumsHeader(String text){
        By verify_text = paths.get("text forums");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void clickOnDocumentsText(String text){
        By click_view = paths.get("click on documents");
        assertEqualsText(text, click_view);
        click_btn(click_view);
        logger.info("click on forums button, passed");
    }
    public void assertDocumentsPageHeader(String text){
        By verify_text = paths.get("text documents");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void clickOnVideosText(String text){
        By click_view = paths.get("click on videos");
        assertEqualsText(text, click_view);
        click_btn(click_view);
        logger.info("click on forums button, passed");
    }
    public void assertVideosPageHeader(String text){
        By verify_text = paths.get("text videos");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void clickOnApplicationText(String text){
        By click_view = paths.get("click on application notes");
        assertEqualsText(text, click_view);
        click_btn(click_view);
        logger.info("click on forums button, passed");
    }
    public void assertApplicationPageHeader(String text){
        By verify_text = paths.get("text application");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
    public void clickOnDownloadsText(String text){
        By click_view = paths.get("click on downloads");
        assertEqualsText(text, click_view);
        click_btn(click_view);
        logger.info("click on forums button, passed");
    }
    public void assertDownloadsPageHeader(String text){
        By verify_text = paths.get("text Oops");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, passed");
    }
}
