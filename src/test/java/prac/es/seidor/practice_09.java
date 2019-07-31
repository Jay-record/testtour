package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class practice_09  extends  practice_base{
    @Test
    public void test9(){

        //Call Browser
        String BaseUrl = "http://www.automationPUB.com";
        //Call Browser
        webDriver.navigate().to(BaseUrl);
        pause(1);

        //Click Selenium
        webDriver.findElement(By.xpath("//*[contains(text(),'001 Selenium – webdriver')]")).click();
        pause(1);

        //Click "Read More"
       webDriver.findElement(By.linkText("Read More")).click();

       //Get Panel title
        List<WebElement> panelList = webDriver.findElements(By.className("panel-title"));
        String panelName = panelList.get(2).getText();

        //Compare the panelName & title
        String titleName = webDriver.getTitle();
        Assert.assertEquals(panelName,titleName, "fail");
        System.out.println("true");
    }
}
