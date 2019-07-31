package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class practice_19 extends practice_base{
    @Test
    public void test19(){

        //Call Browser.
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);
        pause(2);

        //Click the Facebook.
        webDriver.findElement(By.className("theChampFacebookSvg")).click();

        //switch to page(facebook)
        switchWindows();

        //Type Value to the email & pw and Submit
        WebElement email = webDriver.findElement(By.id("email"));
        email.sendKeys("hjk940510@gmail.com");
        webDriver.findElement(By.id("pass")).sendKeys("khj41464550!");
        webDriver.findElement(By.id("u_0_0")).submit();
        pause(3);

        //Close the facebook page
        webDriver.close();

        //Wait on Parent page.
        pause(10);
    }
}
