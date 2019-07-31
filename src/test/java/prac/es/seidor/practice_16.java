package prac.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class practice_16 extends practice_base {
    @Test
    public void test(){
        //Call Browser.
        String BaseUrl = "http://www.automationPUB.com";
        webDriver.navigate().to(BaseUrl);

        //Click Selenium in Categories on Page.
        webDriver.findElement(By.xpath("//a[@href='https://automationpub.com/category/selenium/']")).click();

        //Click the First Blog in BLOGS.
        List<WebElement> blogs = webDriver.findElements(By.className("page_item"));
        blogs.get(0).click();

        //search the path of "p" and print the phrase.
       WebElement article = webDriver.findElement(By.id("post-2"));
        String phrase1 = article.findElements(By.tagName("p")).get(0).getText();
        System.out.println(phrase1);
    }
}
