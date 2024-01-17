package Pages;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class FAQPage extends BaseScreen {

    HashMap<String, By> paths = new HashMap<>();
    public FAQPage(WebDriver driver) {
        super(driver);

        paths.put("check image", By.cssSelector("div.faq_imageCustom__3AGjA > div > img"));
        paths.put("text h5", By.cssSelector("div.faq_imageCustom__3AGjA > div > h5"));
        paths.put("text home", By.cssSelector("div.faq_breadCrump__l_GeF > span:nth-child(1)"));
        paths.put("text FAQ", By.cssSelector("div.faq_breadCrump__l_GeF > span:nth-child(2)"));
        paths.put("text header h6", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(1) > h6"));
        paths.put("text p1", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(1) > p"));
        paths.put("text header1 h6", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(2) > h6"));
        paths.put("text p2", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(2) > p"));
        paths.put("text rookies", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(3) > body1:nth-child(1)"));
        paths.put("text rookie points", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(3) > body1:nth-child(2)"));
        paths.put("text familiar", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(4) > body1:nth-child(1)"));
        paths.put("text familiar points", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(4) > body1:nth-child(2)"));
        paths.put("text doer", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(5) > body1:nth-child(1)"));
        paths.put("text doer points", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(5) > body1:nth-child(2)"));
        paths.put("text helper", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(6) > body1:nth-child(1)"));
        paths.put("text helper points", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(6) > body1:nth-child(2)"));
        paths.put("text advisor", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(7) > body1:nth-child(1)"));
        paths.put("text advisor points", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(7) > body1:nth-child(2)"));
        paths.put("text master", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(8) > body1:nth-child(1)"));
        paths.put("text master points", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(8) > body1:nth-child(2)"));
        paths.put("text grand master", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(9) > body1:nth-child(1)"));
        paths.put("text grand master points", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(9) > body1:nth-child(2)"));
        paths.put("text mvp", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(10) > body1:nth-child(1)"));
        paths.put("text mvp points", By.cssSelector("div#__next > main > div > div:nth-child(3) > div:nth-child(10) > body1:nth-child(2)"));
    }
    public void imageIsDisplayed(){
        By image = paths.get("check image");
        assertTrueDisplayed(image);
        logger.info("Image is checked, Passed");
    }
    public void assertSoftwareDevelopmentKitText(String text){
        By verify_text = paths.get("text h5");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertHomeText(String text){
        By verify_text = paths.get("text home");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertFAQText(String text){
        By verify_text = paths.get("text FAQ");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertHeaderH6Text(String text){
        By verify_text = paths.get("text header h6");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertP1Text(String text){
        By verify_text = paths.get("text p1");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertHeader1H6Text(String text){
        By verify_text = paths.get("text header1 h6");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertP2Text(String text){
        By verify_text = paths.get("text p2");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertRookieText(String text){
        By verify_text = paths.get("text rookies");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertRookiePointText(String text){
        By verify_text = paths.get("text rookie points");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertFamiliarText(String text){
        By verify_text = paths.get("text familiar");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertFamiliarPointText(String text){
        By verify_text = paths.get("text familiar points");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertDoerText(String text){
        By verify_text = paths.get("text doer");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertDoerPointText(String text){
        By verify_text = paths.get("text doer points");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertHelperText(String text){
        By verify_text = paths.get("text helper");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertHelperPointText(String text){
        By verify_text = paths.get("text helper points");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertAdvisorText(String text){
        By verify_text = paths.get("text advisor");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertAdvisorPointText(String text){
        By verify_text = paths.get("text advisor points");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertMasterText(String text){
        By verify_text = paths.get("text master");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertMasterPointText(String text){
        By verify_text = paths.get("text master points");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertGrandMasterText(String text){
        By verify_text = paths.get("text grand master");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertGrandMasterPointText(String text){
        By verify_text = paths.get("text grand master points");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertMVpText(String text){
        By verify_text = paths.get("text mvp");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
    public void assertMVPPointText(String text){
        By verify_text = paths.get("text mvp points");
        assertEqualsText(text, verify_text);
        logger.info(text+ " text is checked, Passed");
    }
}
