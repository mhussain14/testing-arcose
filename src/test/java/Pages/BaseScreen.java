package Pages;

import Tests.DriverSetUp;
import com.google.common.collect.Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.xml.sax.Locator;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


public class BaseScreen extends DriverSetUp
{
    protected WebDriver driver;
    protected Locator locator;
    public BaseScreen(WebDriver driver){this.driver = driver;}
    public void setDocumentLocator(Locator locator){this.locator = locator;}
    protected WebDriverWait waitVisibility() {
        return new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    //**********************************************************************************
    // App control functions
    //**********************************************************************************
    public void visibilityOfElementLocatedXpath(String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }
    public void visibilityOfElementLocatedId(String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
    }

    public void visibilityOfElementId(By by) {
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    //**********************************************************************************
    //Click functions
    //**********************************************************************************
    protected void click_btn(By by) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        driver.findElement(by).click();
    }

    protected void clickAndHold_btn(By by, int xoffset, int yoffset) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.clickAndHold(element).moveByOffset(xoffset, yoffset).perform();
    }

    protected void click_btns(By by, int x) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        WebElement e1 = driver.findElements(by).get(x);
        e1.click();
    }

    //**********************************************************************************
    //Text search functions
    //**********************************************************************************
    protected Boolean checkVisibleText(By by) {
        List<WebElement> webElements;
        String visible = "false";
        Boolean booleanStatus;
        int size;
        int count = 1;

        webElements = driver.findElements(by);

        size = webElements.size();

        if (size > 0) {
            visible = webElements.get(0).getAttribute("visible");

            found:
            if (!(visible.equals("true")) && size > 1) {
                while (count < size) {
                    visible = webElements.get(count).getAttribute("visible");
                    if (visible.equals("true")) {
                        logger.info((count + 1) + ". element görünür.");
                        break found;
                    } else {
                        logger.info((count + 1) + ". element görünür değil.");
                    }
                    count++;
                }
            }
        }

        booleanStatus = Boolean.parseBoolean(visible);
        webElements.clear();

        return booleanStatus;
    }
    //**********************************************************************************
    // Text input setting functions
    //**********************************************************************************

    public void setValue(By by, String value) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        driver.findElement(by).sendKeys(value);
    }

    protected void clearValue(By by) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        driver.findElement(by).clear();
    }

    protected void setValueElements(By by, int x, String value) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        WebElement element = driver.findElements(by).get(x);
        element.sendKeys(value);
    }

    //**********************************************************************************
    //Text and Attribute import functions
    //**********************************************************************************

    protected void assertTrueEnabledElements(By by) {

        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        WebElement element = driver.findElement(by);
        Assert.assertTrue(element.isEnabled());
    }
    protected WebElement getElement(By by) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }
    protected String getElementText(By by) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        return driver.findElement(by).getText();
    }

    protected String getElementAttribute(By by, String Attribute) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        return driver.findElement(by).getAttribute(Attribute);
    }

    protected String getElementTextByID(String ID) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(ID)));
        return driver.findElement(By.id(ID)).getText();
    }

    protected String getElementTextByXpath(String xpath) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        return driver.findElement(By.xpath(xpath)).getText();
    }

    //Testinium fonksiyonu
    public String scrapingIntegerFromString(String value) {
        return Lists.charactersOf(value)
                .stream()
                .filter(i -> Character.isDigit(i))
                .map(i -> String.valueOf(i))
                .collect(Collectors.joining());
    }

    //**********************************************************************************
    //Assert Functions
    //**********************************************************************************

    protected void assertFailTest() {
        Assert.fail();
    }

    protected void assertEqualsText(String expected, By by) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        String actual = driver.findElement(by).getText().trim();
        Assert.assertEquals(actual, expected);
    }

    protected void assertEqualsAttribute(By by, String actual, String Attribute) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        String text = driver.findElement(by).getAttribute(Attribute);
        //actual must be true or false
        Assert.assertEquals(actual, text);
    }

    protected void assertEqualsAttributeElements(By by, int x, String actual, String Attribute) {
        WebElement element =  driver.findElements(by).get(x);
        String text = element.getAttribute(Attribute);
        //actual must be true or false
        Assert.assertEquals(actual, text);
        System.out.println("assertEqualsAttributeElements - PASS");
    }

    protected void assertTrueDisplayed(By by) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        WebElement element =  driver.findElement(by);
        Assert.assertTrue(element.isDisplayed());
    }

    protected void assertFalseDisplayed(By by) {
        try {
            driver.findElement(by);
            Assert.fail();
        } catch (NoSuchElementException e) {

        }
    }

    protected void assertEqualsElements(String actual, By by, int x) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        WebElement expected = driver.findElements(by).get(x);
        Assert.assertEquals(actual, expected.getText());
    }

    protected void assertTrueDisplayedElements(By by, int x) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        WebElement element = driver.findElements(by).get(x);
        Assert.assertTrue(element.isDisplayed());
    }

    protected void notAssertEquals(String actual, By by) {
        waitVisibility().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        String expected = driver.findElement(by).getText();
        Assert.assertNotEquals(actual, expected);
    }

    //Testinium fonksiyonu
    public void verifyTextValue(By value, String expectedText) {
        String elementText = driver.findElement(value).getText().trim();
        org.junit.Assert.assertEquals("Değerler eşleşmiyor.", elementText, expectedText);
        System.out.println(elementText + "'li elementin değerinin " + expectedText + " olduğu doğrulandı.");

    }


    //**********************************************************************************
    //Swipe Functions
    //**********************************************************************************

    protected int getScreenHeight() {
        return driver.manage().window().getSize().getHeight();
    }

    protected int getScreenWidth() {
        return driver.manage().window().getSize().getWidth();
    }

    protected int getElementHeigth(By element) {
        return driver.findElement(element).getSize().getHeight();
    }


    protected int getElementYPosition(By element) {
        return driver.findElement(element).getLocation().getY();
    }

    protected int getElementXPosition(By element) {
        return driver.findElement(element).getLocation().getX();
    }


    protected String getElementTextByXpathWithSize(String xpath) {

        if (getSizeByXpath(xpath) > 0) {
            waitVisibility().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return driver.findElement(By.xpath(xpath)).getText();
        } else {
            return "";
        }
    }

    protected Integer getSizeByXpath(String xpath) {
        List<WebElement> element = driver.findElements(By.xpath(xpath));
        return element.size();
    }

    protected Integer getSizeById(By id) {
        List<WebElement> element = driver.findElements(id);
        return element.size();
    }

    // Bu method Düzenlenecek
}
