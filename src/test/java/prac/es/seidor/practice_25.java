package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class practice_25 extends practice_base {
    @Test
    public  void test25(){

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

        //Edit the Ingredient through class "editInventoryButton"
        List<WebElement> btn = webDriver.findElements(By.className("editInventoryButton"));
        btn.get(0).click();
        pause(1);

        //Edit the price & update.
        WebElement price = webDriver.findElement(By.id("maxRetailPriceId"));
        price.clear();
        price.sendKeys("3000");
        webDriver.findElement(By.id("inventoryUpdateId")).click();
        pause(1);

        btn.get(0).click();
        if (price.getAttribute("value").equals("3000") ){
            System.out.println("The value of price is changed : " + price.getAttribute("value"));
            webDriver.findElement(By.className("close")).click();
        }
        pause(5);


    }
}
