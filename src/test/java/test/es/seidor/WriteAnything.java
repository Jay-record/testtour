package test.es.seidor;

import es.seidor.TestMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class WriteAnything extends TestMethods {
    @Test
    public void String(){
        webDriver.navigate().to("https://www.tous.com/es-es/"); //open the web

        List<WebElement> displayAuxiliar = webDriver.findElements(By.className("displayAuxiliar"));     // store the topMenu, className: displayAuxiliar
        List<WebElement> subCategoryList = webDriver.findElements(By.className("js-third-level-link")); // store the bottomMenu, className: sub-category, sub-catergories-text
        Actions action = new Actions(webDriver);

    /*   for(int i=0;i<displayAuxiliar.size();i++) {
           displayAuxiliar = webDriver.findElements(By.className("displayAuxiliar"));
           System.out.println(displayAuxiliar.get(i).getText());
            WebElement button1 = webDriver.findElement(By.className("displayAuxiliar"));
            action.moveToElement(button1).perform();
            pause(1);
    }*/

        WebElement popup = webDriver.findElements(By.className("displayAuxiliar")).get(1);
        popup.click();
        pause(2);
        System.out.println(webDriver.findElements(By.className("js-third-level-link")).get(3).getText());
        pause(4);

            /*for(int j =0; j < subCategoryList.size();j++){
                WebElement button2 = webDriver.findElements(By.className("sub-category-list")).get(j);
                subCategoryList = webDriver.findElements(By.className("sub-category-list"));
                action.moveToElement(button2).perform();
                pause(1);
                System.out.println(subCategoryList.get(j).getText());

            }*/



        
        pause(4);
    }
}
