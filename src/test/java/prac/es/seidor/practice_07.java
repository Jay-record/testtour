package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class practice_07 extends  practice_base {
    @Test
    public void test7() {

        //Get the BaseUrl
        String BaseUrl = "https://automationpub.com/";
        webDriver.navigate().to(BaseUrl);
        pause(1);

        //Click the contents
        webDriver.findElement(By.xpath("//*[contains(text(),'001 Selenium – webdriver')]")).click();
        pause(1);
    }
}

