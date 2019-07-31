package es.seidor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LinkText extends TousLoginTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        //Opening the air bnb Goa homestays page
        driver.get("https://www.airbnb.co.in/s/Goa/all");

        //locating an element via link text in Selenium now, and clicking on that stay
        driver.findElement(By.linkText("Standard One Bedroom Suite with Pool &amp; Jacuzzi")).click();

    }

}
