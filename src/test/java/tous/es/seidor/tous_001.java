package tous.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class tous_001 extends tous_base{
    @Test
    public void test1(){
        //Call Browser
        String BaseUrl = "https://www.tous.com/us-en/ ";
        webDriver.navigate().to(BaseUrl);
        pause(5);

        //Go to Log_in page
        List<WebElement> liOffcanvas = webDriver.findElements(By.className("liOffcanvas"));
        liOffcanvas.get(1).click();

        //Put the email & pw
        WebElement emil = webDriver.findElement(By.id("j_username"));
        emil.sendKeys("tester77@outlook.es");
        WebElement pw =webDriver.findElement(By.id("j_password"));
        pw.sendKeys("toustous");

        //Submit the Log_in info
        List<WebElement> submit = webDriver.findElements(By.className("button2"));
        submit.get(0).click();
        pause(2);

        //Logout
        List<WebElement> logout = webDriver.findElements(By.className("liOffcanvas"));
        logout.get(1).click();
        pause(3);
    }
}
