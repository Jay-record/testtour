package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class practice_18 extends practice_base {
    @Test
    public void test18() {

        //Call Browser.
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);
        pause(2);

        //Click the Facebook.
        webDriver.findElement(By.className("theChampFacebookSvg")).click();

        //Make the List for saving windowhandle varlues.
        List<String> windowHandlesSet = new ArrayList();
        for (String winHandle : webDriver.getWindowHandles()){
            windowHandlesSet.add(winHandle);
        }
        //Close current page & switch the page.
        webDriver.switchTo().window(windowHandlesSet.get(1));

        //Type the email & pw.
        WebElement email = webDriver.findElement(By.id("email"));
        email.sendKeys("hjk940510@gmail.com");
        webDriver.findElement(By.id("pass")).sendKeys("khj41464550!");
        webDriver.findElement(By.id("u_0_0")).submit();
        webDriver.switchTo().window(windowHandlesSet.get(0)).close();
        pause(10);

        //Switch to parent page.
    }


}
