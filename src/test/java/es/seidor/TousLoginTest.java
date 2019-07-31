package es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**@Author Hongjae Kim
 * @Version Java 1.8.0_111
 * @Since 15-07-2019
 */

public class TousLoginTest {

    public WebDriver webDriver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

/*
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,600"); //is in Mobile by default this makes it Desktop mode
        options.addArguments("headless");
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
*/
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        }

    @AfterTest
    public void tearDown() {
        webDriver.quit(); }

    public void pause(int seconds) {
        try { Thread.sleep(seconds * 1000); }
            catch (InterruptedException e) {
            e.printStackTrace(); } }
/*
    public void waitForPageLoadCompleteXpath(String waitpageloaded) {
        WebDriverWait wait1 = (new WebDriverWait(webDriver,60));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(waitpageloaded)));
    }

    public void waitForPageLoadCompleteId(String waitpageloaded) {
        WebDriverWait wait1 = (new WebDriverWait(webDriver,60));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id(waitpageloaded)));
    }
*/
    public void waitForVisible(WebElement waitvisible){
        WebDriverWait wait = (new WebDriverWait(webDriver,15));
        wait.until(ExpectedConditions.elementToBeClickable(waitvisible));
    }



}

