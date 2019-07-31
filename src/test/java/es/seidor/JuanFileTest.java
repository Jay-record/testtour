package es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

;import java.util.List;

public class JuanFileTest extends TestMethods{
    @Test
    public void Essentials(){
        webDriver.get("https://www.tous.com/es-es/pulsera-silueta-de-plata-vermeil/p/913561550");
       List<WebElement> displayAuxiliar = webDriver.findElements(By.className("displayAuxiliar"));
       List<WebElement> subCategory = webDriver.findElements(By.className("sub-catergories-text"));
        for(int k = 0 ;  k < displayAuxiliar.size() ; k++) {
            displayAuxiliar = webDriver.findElements(By.className("displayAuxiliar"));
            System.out.println(displayAuxiliar.get(k).getText());
            Actions action = new Actions(webDriver);
            WebElement button = webDriver.findElement(By.className("displayAuxiliar"));
            action.moveToElement(button).perform();
            for (int i = 0; i < subCategory.size(); i++) {
                subCategory = webDriver.findElements(By.className("sub-catergories-text"));
                System.out.println(subCategory.get(i).getText());

            }
        }
        pause(10);
    }
}
