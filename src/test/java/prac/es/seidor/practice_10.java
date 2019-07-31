package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class practice_10 extends practice_base{
    @Test
    public void test10(){

        //Call Browser
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);
        pause(1);

        //Click Selenium
        webDriver.findElement(By.xpath("//*[contains(text(),'001 Selenium – webdriver')]")).click();
        pause(2);

        //Click "Read More"
        webDriver.findElement(By.linkText("Read More")).click();

        //print the post-view-count
        WebElement vCount = webDriver.findElement(By.className("post-views-count"));
        System.out.println("POST VIEWS : " + vCount.getText());
    }
}
