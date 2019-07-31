package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;
import java.util.Scanner;

public class practice_20 extends practice_base {
    @Test
    public void test20() throws AWTException, InterruptedException{

        //Call Browser
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);

        //Access & click the  PRACTICE SITE
        Actions action = new Actions(webDriver);
        WebElement Menu = webDriver.findElement(By.xpath("//a[@href='https://automationpub.com/category/uncategorized/']"));
        action.moveToElement(Menu).perform();
        webDriver.findElement(By.id("menu-item-42")).click();

        //CLlick the New User
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

        //Make the new bill
        List<WebElement> ajaxLink = webDriver.findElements(By.className("ajax-link"));
        ajaxLink.get(1).click();

        //Make the Robot class to operate the Keyboard
        Robot robot = new Robot();
        webDriver.findElement(By.id("addItemsAutoResponseId")).sendKeys("11");
       pause(1);

       //Operate the KeyBoard & put the value
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyPress(KeyEvent.VK_ENTER);
        WebElement billName = webDriver.findElement(By.id("tempBillNumId"));
        billName.sendKeys("45");
        webDriver.findElement(By.id("optionsRadiosUnPaidId")).click();
        pause(3);

        //Submit the value
        webDriver.findElement(By.id("btnSave")).click();
        pause(50);
    }
}
