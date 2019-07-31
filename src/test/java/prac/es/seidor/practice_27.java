package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class practice_27 extends practice_base  {
    @Test
    public void test27(){

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

        //Make the Dashboard List & access to Menu(LIst Element)
        List<WebElement> dash = webDriver.findElements(By.className("ajax-link"));
        webDriver.findElement(By.id("menuMenuId")).click();
        pause(1);
        dash.get(3).click();
        pause(4);
        List<WebElement> input = webDriver.findElements(By.tagName("input"));
        input.get(30).sendKeys("Ingredient");  //Ingredient Addons
        List<WebElement>  trCollection = webDriver.findElement(By.id("inventoryListIngredientsId")).findElements(By.tagName("tr"));
        List<WebElement> pagbutton = webDriver.findElement(By.id("inventoryListIngredientsId_paginate")).findElement(By.tagName("span")).findElements(By.className("paginate_button"));
       for(int a=0; a< pagbutton.size();a++) {
           pagbutton = webDriver.findElement(By.id("inventoryListIngredientsId_paginate")).findElement(By.tagName("span")).findElements(By.className("paginate_button"));
           pagbutton.get(a).click();
           for (int i = 0; i < trCollection.size(); i++) {
               trCollection = webDriver.findElement(By.id("inventoryListIngredientsId")).findElements(By.tagName("tr"));
               List<WebElement> tdCollection = trCollection.get(i).findElements(By.tagName("td"));
               for (int j = 0; j < tdCollection.size(); j++) {
                   System.out.print(tdCollection.get(j).getText() + "\t");
               }
               System.out.println("\n");
           }
           System.out.println("page : " + (a+1));
       }
        pause(10);
        /* for(int i =0; i < input.size(); i++) {
            System.out.println(i +"  번째"+ input.get(i).getAttribute("type"));
        }
        pause(20); */
    }
}
