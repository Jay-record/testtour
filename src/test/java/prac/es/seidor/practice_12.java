package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class practice_12 extends practice_base{
    @Test
    public void test12(){

        //Call Browser
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);

        //Click the Dropdown Box
        WebElement ddBox = webDriver.findElement(By.id("archives-dropdown-2"));
        ddBox.click();
        pause(1);

        //Click the value using selectByVisibleText
        Select archive = new Select((webDriver.findElement(By.id("archives-dropdown-2"))));
        archive.selectByVisibleText(" February 2019  (13)");
        pause(3);
    }
}