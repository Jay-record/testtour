package wiki.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class wiki_005 extends wiki_base {
    @Test
    public void test5(){
        // 1. Go to homepage. & Click on one category.
        String BaseUrl = "https://www.tous.com/us-en/";
        webDriver.navigate().to(BaseUrl);
        String windowHandle = webDriver.getWindowHandle();
        pause(2);
        List<WebElement> category = webDriver.findElements(By.className("displayAuxiliar"));
        category.get(1).click();

        // 2. Enter in one product page.
        webDriver.findElement(By.xpath("//*[@id=\"showMenuCategories\"]/ul/div[1]/ul/div[1]/li/a")).click();
        pause(2);
        webDriver.findElement(By.id("current-product-info-918542620")).click();
        pause(5);

        // 3. Click on the email share.
        WebElement email = webDriver.findElement(By.className("icon-tous-email-pdp"));
        scrollGuess((email));
        email.click();
        pause(5);

        // 3-1. Open the new tab for get the temp mail.
        ((JavascriptExecutor) webDriver).executeScript("window.open('https://10minutemail.net/?lang=ko');");

        // 3-2. Change the focus to new tab.
        switchWindows();
        pause(5);

        // 3-3. Recive the tempMail.
        WebElement tempMail = webDriver.findElement(By.id("fe_text"));
        String s = tempMail.getAttribute("value");
        // 3-4. Change the focus to first tab.
       webDriver.switchTo().window(windowHandle);

        //  4. Write a sender email
        webDriver.findElement(By.id("senderMailAddress")).sendKeys("help.es@tous.com");
        pause(1);
        // 5. Write a reciever email
        webDriver.findElement(By.id("receiversMails")).sendKeys(s);

        // 5-1. Write the Message.
        webDriver.findElement(By.id("message")).sendKeys("Hello WORLD");

        // 6. Click on the "I agree" button
        WebElement checkbox = webDriver.findElement(By.id("terms2"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", checkbox);


        // 7. Click on the send button
        webDriver.findElement(By.id("button-share-product")).click();

        // 8. Varify the receiving mail
        switchWindows();
        pause(100);
        webDriver.navigate().refresh();
        pause(10);

    }

}
