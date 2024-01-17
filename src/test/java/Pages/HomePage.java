package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class HomePage extends BaseScreen{
    HashMap<String, By> paths = new HashMap<>();
    public HomePage(WebDriver driver){

        super(driver);
        paths.put("Home Page Button", By.xpath("//div[@class = 'MuiBox-root css-k008qs']//nav//div//div[@class = 'MuiBox-root css-12tyqda']//button[1]"));
        paths.put("banner text", By.xpath("//main[@class = '__className_e66fe9']//div[@class = 'MainLanding_banner_home__x3ojk']//span[@class = 'banner_text']"));
        paths.put("View Button", By.xpath("//main[@class = '__className_e66fe9']//div[@class = 'MainLanding_banner_home__x3ojk']//button[@class = 'over_image_btn']"));
        paths.put("Rcos SDK Workshops", By.xpath("//main[@class = '__className_e66fe9']//div[@class = 'MainLanding_workshop_info__miZOA']//p[1]"));
        paths.put("Text Key Features", By.cssSelector("main.__className_e66fe9:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)"));
        paths.put("Text Design Easily", By.cssSelector("main.__className_e66fe9:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)"));
        paths.put("Text Design Easily Paragraph", By.cssSelector(".__className_e66fe9 div > div.MainLanding_keyfeatures__gJocz > div.MainLanding_items__5WJHA > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)"));
        paths.put("Text Library support", By.cssSelector(".__className_e66fe9 div > div.MainLanding_keyfeatures__gJocz > div.MainLanding_items__5WJHA > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)"));
        paths.put("Text Library support paragraph", By.cssSelector(".__className_e66fe9 div > div.MainLanding_keyfeatures__gJocz > div.MainLanding_items__5WJHA > div:nth-child(2) > div:nth-child(2) > div:nth-child(2)"));
        paths.put("Text Code & Try", By.cssSelector(".__className_e66fe9 div > div.MainLanding_keyfeatures__gJocz > div.MainLanding_items__5WJHA > div:nth-child(3) > div:nth-child(2) > div:nth-child(1)"));
        paths.put("text code Try Paragraph", By.cssSelector(".__className_e66fe9 div > div.MainLanding_keyfeatures__gJocz > div.MainLanding_items__5WJHA > div:nth-child(3) > div:nth-child(2) > div:nth-child(2)"));

        paths.put("Text Why Rcos", By.cssSelector(".__className_e66fe9 div > div.MainLanding_whymain__ssVoS > div div.MainLanding_why_title__y2QiE >span:nth-child(1)"));
        paths.put("Text Paragraph", By.cssSelector(".__className_e66fe9 div > div.MainLanding_whymain__ssVoS > div > p"));
        paths.put("Text View link", By.cssSelector(".__className_e66fe9 div > div.MainLanding_whymain__ssVoS > div > a"));
        paths.put("Text Use Cases", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(1)"));

        paths.put("text Electronic Platform", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(1) > div > span"));
        paths.put("Electronic point1", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(1)"));
        paths.put("Electronic point2", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(2)"));
        paths.put("Electronic point3", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(3)"));
        paths.put("Electronic point4", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(4)"));

        paths.put("Text Secure IoT", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(1) > div > span"));
        paths.put("IoT point1", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(1)"));
        paths.put("IoT point2", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(2)"));
        paths.put("IoT point3", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(3)"));
        paths.put("IoT point4", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(4)"));
        paths.put("IoT point5", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(5)"));
        paths.put("IoT point6", By.cssSelector(".__className_e66fe9 div > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > ul > li:nth-child(6)"));

        paths.put("Download Text", By.cssSelector(".__className_e66fe9 div > div:nth-child(6) > div:nth-child(1) > div > span:nth-child(1)"));
        paths.put("Paragraph Text", By.cssSelector(".__className_e66fe9 div > div:nth-child(6) > div:nth-child(1) > p"));
        paths.put("Download Button", By.cssSelector(".__className_e66fe9 div > div:nth-child(6) > div:nth-child(1) > a"));

        paths.put("Version Text", By.cssSelector(".Footer_footer__4vzqH > div:nth-child(1)"));
        paths.put("Home Page Text", By.cssSelector(".Footer_footer__4vzqH > div:nth-child(2) > ul > li:nth-child(1) >a"));
        paths.put("Forums Text", By.cssSelector(".Footer_footer__4vzqH > div:nth-child(2) > ul > li:nth-child(2) > a"));
        paths.put("Articles Text", By.cssSelector(".Footer_footer__4vzqH > div:nth-child(2) > ul > li:nth-child(3) > a"));
        paths.put("Documents Text", By.cssSelector(".Footer_footer__4vzqH > div:nth-child(2) > ul > li:nth-child(4) > a"));
        paths.put("Videos Text", By.cssSelector(".Footer_footer__4vzqH > div:nth-child(2) > ul > li:nth-child(5) > a"));
        paths.put("FAQ Text", By.cssSelector(".Footer_footer__4vzqH > div:nth-child(2) > ul > li:nth-child(6) >a"));
    }
    public void assertHomeButton(String text){
        By verify_text = paths.get("Home Page Button");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertBanner(String text){
        By verify_text = paths.get("banner text");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertViewButton(String text){
        By verify_text = paths.get("View Button");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertArcosSdk(String text){
        By verify_text = paths.get("Rcos SDK Workshops");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertKeyFeature(String text){
        By verify_text = paths.get("Text Key Features");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertDesignEasily(String text){
        By verify_text = paths.get("Text Design Easily");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertDesignEasilyParagraph(String text){
        By verify_text = paths.get("Text Design Easily Paragraph");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }

    public void assertLibrarySupport(String text){
        By verify_text = paths.get("Text Library support");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertLibrarySupportParagraph(String text){
        By verify_text = paths.get("Text Library support paragraph");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertCodeTry(String text){
        By verify_text = paths.get("Text Code & Try");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertCodeTryParagraph(String text){
        By verify_text = paths.get("text code Try Paragraph");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertWhyRcos(String text){
        By verify_text = paths.get("Text Why Rcos");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertWhyParagraph(String text){
        By verify_text = paths.get("Text Paragraph");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertViewLink(String text){
        By verify_text = paths.get("Text View link");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertUseCase(String text){
        By verify_text = paths.get("Text Use Cases");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertElectronicPlateForm(String text){
        By verify_text = paths.get("text Electronic Platform");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertElectronicPlateFormPoint1(String text){
        By verify_text = paths.get("Electronic point1");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertElectronicPlateFormPoint2(String text){
        By verify_text = paths.get("Electronic point2");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertElectronicPlateFormPoint3(String text){
        By verify_text = paths.get("Electronic point3");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertElectronicPlateFormPoint4(String text){
        By verify_text = paths.get("Electronic point4");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertSecureIoT(String text){
        By verify_text = paths.get("Text Secure IoT");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertSecureIoTPoint1(String text){
        By verify_text = paths.get("IoT point1");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertSecureIoTPoint2(String text){
        By verify_text = paths.get("IoT point2");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertSecureIoTPoint3(String text){
        By verify_text = paths.get("IoT point3");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertSecureIoTPoint4(String text){
        By verify_text = paths.get("IoT point4");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertSecureIoTPoint5(String text){
        By verify_text = paths.get("IoT point5");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertSecureIoTPoint6(String text){
        By verify_text = paths.get("IoT point6");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertDownload(String text){
        By verify_text = paths.get("Download Text");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertDownloadParagraph(String text){
        By verify_text = paths.get("Paragraph Text");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertDownloadButton(String text){
        By verify_text = paths.get("Download Button");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertVersionText(String text){
        By verify_text = paths.get("Version Text");
        assertEqualsText(text,verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertHomePage(String text){
        By verify_text = paths.get("Home Page Text");
        assertEqualsText(text,verify_text);
        click_btn(verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertForums(String text){
        By forums_text = paths.get("Forums Text");
        assertEqualsText(text,forums_text);
        click_btn(forums_text);
        logger.info("Text is checked, Passed");
    }
    public void assertArticles(String text){
        By verify_text = paths.get("Articles Text");
        assertEqualsText(text,verify_text);
        click_btn(verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertDocuments(String text){
        By verify_text = paths.get("Documents Text");
        assertEqualsText(text,verify_text);
        click_btn(verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertVideos(String text){
        By verify_text = paths.get("Videos Text");
        assertEqualsText(text,verify_text);
        click_btn(verify_text);
        logger.info("Text is checked, Passed");
    }
    public void assertFAq(String text){
        By verify_text = paths.get("FAQ Text");
        assertEqualsText(text,verify_text);
        click_btn(verify_text);
        logger.info("Text is checked, Passed");
    }
}
