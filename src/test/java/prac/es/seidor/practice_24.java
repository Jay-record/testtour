package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class practice_24 extends  practice_base{
    @Test
    public void test24(){

        //Call Browser
        String BaseUrl = "http://automationpub.com/demoAutomationSite/demoSeleniumSite/";
        webDriver.navigate().to(BaseUrl);

        //Create the New User
        List<WebElement> tablinks1 = webDriver.findElements(By.className("tablinks"));
        tablinks1.get(1).click();

        //Put the email & pw
        WebElement name = webDriver.findElement(By.id("name"));
        name.sendKeys("HONGJAE");
        WebElement email2 =webDriver.findElement(By.id("email2"));
        email2.sendKeys("TestID4550@gmail.com");
        WebElement password2 = webDriver.findElement(By.id("password2"));
        password2.sendKeys("Test4550");
        name.submit();

        //Log-In
        List<WebElement> tablinks2 = webDriver.findElements(By.className("tablinks"));
        tablinks2.get(0).click();
        WebElement email1 =webDriver.findElement(By.id("email1"));
        email1.sendKeys("TestID4550@gmail.com");
        WebElement password1 = webDriver.findElement(By.id("password1"));
        password1.sendKeys("Test4550");
        email1.submit();
        pause(1);

        //Actual Test DashBoard
      /*  List<WebElement> dash = webDriver.findElements(By.className("ajax-link"));
        for(int i = 0; i<dash.size();i++){
            System.out.println("Accumulated Count: " + i + ".   " + dash.get(i).getAttribute("href"));
        }*/
        //Data Toggle Toolip
        List<WebElement>  toolip= webDriver.findElements(By.tagName("a"));
        for(int i = 0; i<toolip.size();i++){
            System.out.println("Accumulated Count: " + (i +1 )+ ".   " + toolip.get(i).getAttribute("href"));
        }
        pause(5);
    }
}
