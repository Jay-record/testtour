package wiki.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class wiki_base {
    public WebDriver webDriver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); }
    @AfterTest
    public void tearDown() {
        webDriver.quit(); }

    public void pause(int seconds) {
        try { Thread.sleep(seconds * 1000); }
        catch (InterruptedException e) {
            e.printStackTrace(); } }

    public void switchWindows(){
        String winHandleBefore = webDriver.getWindowHandle();
        for (String winHandle : webDriver.getWindowHandles()){
            webDriver.switchTo().window(winHandle); } }

    public void javascripexecutormethod(WebElement a){
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("arguments[0].click();", a); }

    public void scrollGuess(WebElement s){
        JavascriptExecutor scrollGuess = (JavascriptExecutor) webDriver;
        //This will scroll the page till the element is found
        scrollGuess.executeScript("arguments[0].scrollIntoView();", s);

    }
}