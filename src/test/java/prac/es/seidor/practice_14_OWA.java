package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practice_14_OWA extends practice_base{
    @Test
    public void test14_OWA(){

        //Call Browser
        String baseURL = "http://demo.guru99.com/test/newtours/register.php";
        webDriver.navigate().to(baseURL);

        //Selecting Items in a DropBox
        Select drpCountry = new Select(webDriver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");
        pause(2);

        //Selecting Items in a Multiple SELECT elements
        webDriver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(webDriver.findElement(By.id("fruits")));
        pause(1);

        //Searching Banana
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);
        pause(3);
    }
}