package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class practice_29 extends practice_base {
    @Test
    public void test29(){
        //Call Browser
        String BaseUrl = "http://automationpub.com/demoAutomationSite/demoSeleniumSite/";
        webDriver.navigate().to(BaseUrl);

        //Cllick the New User
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
        String email = "TestID4550@gmail.com";
        WebElement email1 =webDriver.findElement(By.id("email1"));
        email1.sendKeys(email);
        WebElement password1 = webDriver.findElement(By.id("password1"));
        password1.sendKeys("Test4550");
        email1.submit();
        System.out.println("Email in Log-in is : " + email);
        pause(1);

        //Go to dashboard.
        List<WebElement> collapse = webDriver.findElement(By.className("collapse")).findElements(By.tagName("li"));
        String dashEmail =  collapse.get(0).getText();

        //Extract the email from dashboard
        int last = dashEmail.length();
        String vEmail = dashEmail.substring(4, last);
        System.out.println("Email in dashboard is : " + vEmail);

        //Compare the variable between the email from Log-in & dashboard.
        Assert.assertEquals(vEmail, email);
        System.out.println("Success");
        pause(10);
    }


}
