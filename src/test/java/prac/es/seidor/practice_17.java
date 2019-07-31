package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class practice_17 extends practice_base{
    @Test
    public void test17(){

        //Call Browser.
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);


        //Show the Entire List(Using name, tagName)
        List<WebElement> archives =webDriver.findElement(By.name("archive-dropdown")).findElements(By.tagName("option"));
        for(int i =0 ; i < archives.size() ; i++) {
            System.out.println(archives.get(i).getAttribute("value"));
        }

        pause(3);
    }
}
