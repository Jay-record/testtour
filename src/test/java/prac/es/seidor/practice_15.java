package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;

public class practice_15 extends practice_base {
    @Test
    public void test15(){

        //Call Browser
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);

        //Search & Save the links to List<WebElement>
        List<WebElement> links = webDriver.findElements(By.className("menu-item"));
        for(int i =0; i<links.size();i++){
            System.out.println("no." + (i +1) + " "+ links.get(i).findElement(By.tagName("a")).getAttribute("href"));
        }

    }
}
