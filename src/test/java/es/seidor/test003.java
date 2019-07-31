package tous;
//Imported libraries list, when there are the functions that would be used.

import es.seidor.TestMethods;
import javafx.beans.property.SimpleSetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.List;

//Definition of a class
public class test003 extends TestMethods {
    @Test                                         //defining what would be the test
         public void Test003() throws Exception { //defining in a function what the test will do.
        webDriver.navigate().to("https://www.tous.com/es-es/"); //Telling Chrome to access a webpage
        pause(3); //Defined function by the user that makes to wait until all the elements of the web page load.

        List<WebElement> Aux = webDriver.findElements(By.className("displayAuxiliar"));
        List<WebElement> loginTousMain = webDriver.findElements(By.className("sub-category-list")); // Defining a list of elements.
        WebElement site = webDriver.findElement(By.xpath("//*[@title='Invitada perfecta']"));

        Actions action = new Actions(webDriver);
        Actions action2 = new Actions(webDriver);

       /* WebElement button = webDriver.findElements(By.className("displayAuxiliar")).get(0);
        action.moveToElement(button).perform();
        loginTousMain.get(2).click();
        pause(1);*/

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        for(int i =0 ; i<Aux.size();i++) {
            WebElement elemento = webDriver.findElements(By.className("displayAuxiliar")).get(i);
            for(int j=0; j<loginTousMain.size();j++) {
                js.executeScript("arguments[j].click();", elemento);
                pause(2);
                webDriver.navigate().back();
                pause(2);
            }
        }


       /* for(int i = 0; i<loginTousMain.size();i++){
            loginTousMain = webDriver.findElements(By.className("sub-category-list"));
            System.out.println(loginTousMain.get(i).getText());
            pause(1);
        } */
        //System.out.println(site.getText());
        //pause(2);

    /*    for(int j =0; j< Aux.size();j++) {
            WebElement button = webDriver.findElements(By.className("displayAuxiliar")).get(j);
            action.moveToElement(button).perform();
            System.out.println(button.getText());
            pause(2);
            for (int i = 0; i < loginTousMain.size(); i++) {
                WebElement button2 = webDriver.findElements(By.className("sub-category-list")).get(i);
                action.moveToElement(button2).perform();
                pause(1);
                loginTousMain.get(i).click();
                pause(2);
                webDriver.navigate().back();
            }
        }*/
        pause(10);
       /* loginTousMain.get(4).click(); // Making the click action on the element number 5 of the defined list. (the numeration begins from 0)
        pause(3);

        List<WebElement> loginTousLog = webDriver.findElements(By.className("input2"));

        loginTousLog.get(0).sendKeys("tester77@outlook.es"); //Filling in the first element with a text
        loginTousLog.get(1).sendKeys("toustous");

        List<WebElement> loginTousLogButton = webDriver.findElements(By.className("button2"));
        loginTousLogButton.get(0).click();
        pause(3);

        pause(2); //Pause action, 2 seconds.

        /*List<WebElement> logOutTous = webDriver.findElements(By.className("list-inline"));
        logOutTous.get(4).click();
        pause(3);
        for(int i=0 ; i<loginTousMain.size() ; i++){
            loginTousMain = webDriver.findElements(By.className("list-inline"));
            if(loginTousMain.get(i).getText() != " ") {
                System.out.println(loginTousMain.get(i).getText());
            } */



    }
    }

