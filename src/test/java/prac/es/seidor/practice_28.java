package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import sun.awt.windows.WEmbeddedFrame;

import java.util.List;

public class practice_28 extends  practice_base{
    @Test
    public void test28(){

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

        //Click the all Menu Button to show the Button
        webDriver.findElement(By.id("menuMenuId")).click();
        WebElement reportBtn = webDriver.findElement(By.id("reportsMenuId"));
        reportBtn.click();
        List<WebElement> lv2Menu = reportBtn.findElements(By.className("accordion"));
        //Click the Lv2 Items
        for(int i =0; i< lv2Menu.size(); i++){
            lv2Menu = reportBtn.findElements(By.className("accordion"));
            lv2Menu.get(i).click();
        }
        pause(1);

        //Print the All output in Menu Button: No. + TextName + URL
        List<WebElement>  toolip= webDriver.findElement(By.className("main-menu")).findElements(By.tagName("a"));
        for(int i = 0; i<toolip.size();i++){
            System.out.println("Main Menu : " + (i +1 )+ ".   "+ toolip.get(i).getText()+"  "+ toolip.get(i).getAttribute("href"));
        }
        pause(10);
    }
}
