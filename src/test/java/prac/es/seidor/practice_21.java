package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Scanner;

public class practice_21 extends practice_base {
    @Test
    public void test21() throws AWTException{

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

        //Enter the new bill
        List<WebElement> ajaxLink = webDriver.findElements(By.className("ajax-link"));
        ajaxLink.get(1).click();

        //Put the bill number.
        String  billNum = "1";
        pause(3);
        //Save the Made Bills to List Variable
        List<WebElement> unPaidBills = webDriver.findElements(By.className("unpaidBillsButton"));

        //Compare the Input Bill with the Bills in the table
        if( unPaidBills.size() !=0){
            for(int i=0; i<unPaidBills.size();i++){
                unPaidBills = webDriver.findElements(By.className("unpaidBillsButton"));
                pause(3);
                if(billNum.equals(unPaidBills.get(i).getAttribute("value"))== false){
                    System.out.println("Difference billNum : " + unPaidBills.get(i).getAttribute("value"));
                    //Make the Select Class for saving dropdown variables in the Unpaid Bills
                    Select drpbx1 = new Select(webDriver.findElement(By.id("servingTypeId")));
                    Select drpbx2 = new Select(webDriver.findElement(By.id("paymentModeId")));
                    Select drpbx3 = new Select(webDriver.findElement(By.id("salesPersonId")));
                    unPaidBills.get(i).click();
                    pause(4);
                    webDriver.findElement(By.id("optionsRadiosUnPaidId")).click();

                    //SelectByVisibleText
                    drpbx1.selectByVisibleText("Online - Swiggy");
                    //SelectByValue
                    drpbx2.selectByValue("Card");
                    //SelectByIndex
                    drpbx3.selectByIndex(3);
                    webDriver.findElement(By.id("btnSave")).click();
                    pause(5);
                }
                else if (billNum.equals(unPaidBills.get(i).getAttribute("value"))){
                    System.out.println("Same billNum : " + unPaidBills.get(i).getText());
                    pause(5);
                }
            }
        }

    }
}
