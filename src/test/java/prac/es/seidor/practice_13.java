package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practice_13 extends  practice_base{
    @Test
    public void test13(){

        //Call Browser
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);

        //Click the Dropdown Box
        WebElement ddBox = webDriver.findElement(By.id("archives-dropdown-2"));
        ddBox.click();

        //Click the value using selectByIndex
        Select archive = new Select((webDriver.findElement(By.id("archives-dropdown-2"))));
        archive.selectByIndex(4);
        pause(2);
    }
}
