package test.es.seidor;

import es.seidor.TestMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSlider extends TestMethods {
    @Test
    public void test() {
        webDriver.get("https://www.tous.com/ic-en/");
        WebElement slider = webDriver.findElement(By.className("page-homepage"));
        int width=slider.getSize().getWidth();
        int h = slider.getSize().getHeight();
        Actions move = new Actions(webDriver);
        move.moveToElement(slider, ((width*10)/100), h).click();
        move.build().perform();
        pause(10);


    }
}
