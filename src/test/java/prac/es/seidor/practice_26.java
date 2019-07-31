package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class practice_26 extends practice_base {
    @Test
    public  void test26(){

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

        //Click any item to Click the "Add New Item"
        List<WebElement> btn = webDriver.findElements(By.className("editInventoryButton"));
        btn.get(0).click();
        pause(1);

        //Click New Item
        webDriver.findElement(By.id("inventoryResetId")).click();

        //Add the New Item
        Select drpbx1 = new Select(webDriver.findElement(By.id("inventoryTypeId")));
        Select drpbx2 = new Select(webDriver.findElement(By.id("itemCategory2Id")));
        Select drpbx3 = new Select(webDriver.findElement(By.id("itemCategory3Id")));
        Select drpbx4 = new Select(webDriver.findElement(By.id("itemCategory4Id")));
        Select drpbx5 = new Select(webDriver.findElement(By.id("unitsId")));
        drpbx1.selectByIndex(2);
        drpbx2.selectByIndex(4);
        drpbx3.selectByIndex(2);
        drpbx4.selectByIndex(1);
        drpbx5.selectByIndex(1);
        webDriver.findElement(By.id("itemCodeId")).sendKeys("7722");
        webDriver.findElement(By.id("itemNameId")).sendKeys("TestItemName");
        webDriver.findElement(By.id("quantityId")).sendKeys("123");
        webDriver.findElement(By.id("maxRetailPriceId")).sendKeys("777");
        webDriver.findElement(By.id("expiryDateId")).sendKeys("2019-07-29");
        webDriver.findElement(By.id(("inventorySubmitId"))).click();

        //Check the Test
        try{
            System.out.println("Test26  is  ...  " + webDriver.findElement(By.className("jq-toast-heading")).getText());
        }catch (Exception e){
            e.printStackTrace();
        }
        pause(10);
        }
    }
