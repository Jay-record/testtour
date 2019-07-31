package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class practice_11 extends practice_base{
    @Test
    public void test11(){

        //Call Browser
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);

        //Click the Dropdown Box
        WebElement ddBox = webDriver.findElement(By.id("archives-dropdown-2"));
        ddBox.click();
        pause(1);

        //Show the Elements
        List<WebElement> E = webDriver.findElements(By.tagName("option"));
        for(int i = 0 ; i<E.size();i++){
           System.out.println(webDriver.findElements(By.tagName("option")).get(i).getText());
        }

        //Select the value
        webDriver.findElements(By.tagName("option")).get(5).click();
        pause(2);
    }
}
