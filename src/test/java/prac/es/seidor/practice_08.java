package prac.es.seidor;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import sun.font.TrueTypeFont;

public class practice_08 extends practice_base{
    @Test
    public void test8() {

        //Get the BaseUrl
        String BaseUrl = "https://automationpub.com/";
        webDriver.navigate().to(BaseUrl);
        pause(1);

        //click the content
        webDriver.findElement(By.xpath("//*[contains(text(),'001 Selenium – webdriver')]")).click();
        pause(1);
        webDriver.findElement(By.linkText("Read More")).click();
        pause(1);

        //Compare the
        String actualTitle = webDriver.getTitle();
        String expectedTitle = "001 Selenium – webdriver | AutomationPub.com";
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
        }
    }