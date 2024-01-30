package Pages;

import io.cucumber.java.en.And;
import net.sourceforge.tess4j.Tesseract;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;

import static java.lang.Thread.sleep;

public class CommonScreen extends BaseScreen{
    HashMap<String, By> paths = new HashMap<>();
    static HashMap<String, String> variables = new HashMap<>();
    Tesseract tesseract = new Tesseract();
    SignInPage signInScreens = new SignInPage(driver);
    SignUpPage signUpScreens = new SignUpPage(driver);

    public CommonScreen(WebDriver driver) {
        super(driver);
    }
    public void xSaniyeBekle(int t) throws InterruptedException {
        sleep((t * 1000L));
        logger.info(t + " SaniyeBekle - PASS");
    }
    public void waitElement(String arg0) {
        waitVisibility().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text, '" + arg0 + "')]")));
        logger.info(arg0 + " elementi beklendi - PASS");
    }
    public void clickButton(String arg0) {
        click_btn(By.xpath("//android.widget.Button[@text='" + arg0 + "']"));
        System.out.println(arg0 + " butonuma basıldı - PASS");
    }
    public void clickText(String arg0) {
        WebElement element = waitVisibility().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + arg0 + "']")));
        waitVisibility().until(ExpectedConditions.visibilityOf(element));
        click_btn(By.xpath("//android.widget.TextView[@text='" + element.getText() + "']"));
        System.out.println(arg0 + " textine basılır" + " - PASS");
    }
    public By selectPathScreen(String device, String path) {
        By by = null;

        switch (device) {
            case "SignIn":
                by = signInScreens.paths.get(path);
                break;
            case "SignUp":
                by = signUpScreens.paths.get(path);
                break;
            case "General":
                by = this.paths.get(path);
                break;
        }
        return by;
    }
    public void refreshThePage(){
        getTDriver().navigate().refresh();
    }
    public void searchTheTextOnPage(String text){
        //getTDriver().findElement(By.xpath("//*[text() = '"+text+"']"));
        JavascriptExecutor js = (JavascriptExecutor) getTDriver();
        WebElement element = getTDriver().findElement(By.xpath("//*[text() = '"+text+"']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void searchTheTextOnBottomOfThePage(String text){
        JavascriptExecutor js = (JavascriptExecutor) getTDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void searchTheTextHorizontally(String text){
        JavascriptExecutor js = (JavascriptExecutor) getTDriver();
        js.executeScript("window.scrollBy(300, 0)");
    }
    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(x);
        //sleep(x);
        //sleep(x*1000L);
    }
}
