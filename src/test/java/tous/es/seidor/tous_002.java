package tous.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class tous_002 extends tous_base{
    @Test
    public void test2(){
        // 1. Go to homepage.
        String BaseUrl = "https://www.tous.com/us-en/";
        webDriver.navigate().to(BaseUrl);
        pause(2);

        // 2. Click on "log in" on the upper right corner.
        List<WebElement> liOffcanvas = webDriver.findElements(By.className("liOffcanvas"));
        liOffcanvas.get(1).click();
        pause(1);
        // 3. Click on "log in" button without no info.
        List<WebElement> submit = webDriver.findElements(By.tagName("button"));
        submit.get(2).click();
        pause(1);

        // 4. Enter invalid text in email box.
        WebElement email = webDriver.findElement(By.id("j_username"));
        email.sendKeys("this is not a mail");
        submit.get(2).click();
        pause(1);

        // 5. Enter invalid password.
        WebElement pw =webDriver.findElement(By.id("j_password"));
        pw.sendKeys("fakePassword");
        submit.get(2).click();
        pause(1);
        // 6. Clear email and password boxs.
        email.clear();
        pw.clear();

        // 12. Enter valid mail without account.
       email.sendKeys("fakeMailwithoutAccount@test.com");

        // 13. Enter a password.
        pw.sendKeys("fakePassword");

        // 14. Click on "log in" button.
        submit.get(2).click();
        pause(1);

        // 15. Enter valid mail.
        email = webDriver.findElement(By.id("j_username"));
        email.clear();
        email.sendKeys("tester77@outlook.es");

        // 16. Enter valid password.
        pw =webDriver.findElement(By.id("j_password"));
        pw.sendKeys("toustous");

        // 17. Click on "log in" button.
        submit = webDriver.findElements(By.tagName("button"));
        submit.get(2).click();
        pause(20);
    }
}
