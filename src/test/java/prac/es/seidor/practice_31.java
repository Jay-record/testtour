package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class practice_31 extends practice_base{
    @Test
    public void test31(){
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
        pause(1);

        //Click to menu
        webDriver.findElement(By.id("reportsMenuId")).click();
        pause(1);
        webDriver.findElement(By.id("AdditionalMenuId")).click();
        pause(1);
        webDriver.findElement(By.xpath("//a[@href='reportProductsStatement.php']")).click();
        pause(1);


        //Type the date.
        WebElement fromDate = webDriver.findElement(By.id("fromDateId"));
        fromDate.sendKeys("0020190101");
        pause(1);
        WebElement toDate = webDriver.findElement(By.id("toDateId"));
        toDate.sendKeys("0020190731");
        webDriver.findElement(By.id("customReportSearchButtonId")).click();

        //Extract the table
        List<WebElement>  trCollection = webDriver.findElement(By.id("tableProductsReportId")).findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        for (int i = 0; i < trCollection.size(); i++) {
            trCollection = webDriver.findElement(By.id("tableProductsReportId")).findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
            List<WebElement> tdCollection = trCollection.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < tdCollection.size(); j++) {
                System.out.print(tdCollection.get(j).getText() + "\t");
            }
            System.out.println("\n");
        }
        pause(100);

    }
}
