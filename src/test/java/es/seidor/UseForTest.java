package es.seidor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/* Mission 1 :
       Get the temporary email and bring it to login screen. */

public class UseForTest extends TestMethods{
        /* I want to give the user name somebody& inum automatically,
         despite i can't catch the security number of image,
         because it's inconvenient to designate the username manually.
         But for it, i need more time.*/
        public int idnum = 4750;
        public String pw = "123456789!";
        public String name = "somebody";

        @Test
        public void makeUserAndLogin(){

            webDriver.get("https://10minutemail.net/");
            String email = webDriver.findElement(By.id("fe_text")).getAttribute("value");
            webDriver.get("https://ko.wikipedia.org/w/index.php?title=%ED%8A%B9%EC%88%98:%EA%B3%84%EC%A0%95%EB%A7%8C%EB%93%A4%EA%B8%B0&returnto=%EC%9C%84%ED%82%A4%EB%B0%B1%EA%B3%BC%3A%EB%8C%80%EB%AC%B8");
            webDriver.findElement(By.id("pt-createaccount"));
            webDriver.findElement(By.name("wpName")).sendKeys(name);
            webDriver.findElement(By.name("wpPassword")).sendKeys(pw);
            webDriver.findElement(By.name("retype")).sendKeys(pw);
            webDriver.findElement(By.name("email")).sendKeys(email);

            pause(10);
            webDriver.findElement(By.id("wpCreateaccount")).submit();
            webDriver.get("https://ko.wikipedia.org/wiki/%EC%9C%84%ED%82%A4%EB%B0%B1%EA%B3%BC:%EB%8C%80%EB%AC%B8");
            webDriver.findElement(By.id("pt-logout")).click();
            webDriver.navigate().to("https://ko.wikipedia.org/wiki/%EC%9C%84%ED%82%A4%EB%B0%B1%EA%B3%BC:%EB%8C%80%EB%AC%B8");
            webDriver.findElement(By.id("pt-login")).click();
            webDriver.findElement(By.id("wpName1")).sendKeys(name);
            WebElement qwe = webDriver.findElement(By.id("wpPassword1"));
            qwe.sendKeys(pw);
            qwe.submit();
            pause(10);

        }
}