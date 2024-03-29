package wiki.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class wiki_010 extends wiki_base {
    @Test
    public void test10(){
        String baseUrl = "https://www.tous.com/us-en";

        // 브라우저 호출
        webDriver.get(baseUrl);
        pause(3);

        webDriver.findElement(By.id("js-site-search-input")).click();
        webDriver.findElement(By.id("js-site-search-input")).sendKeys("TOUS");
        webDriver.findElement(By.className("js-search-name")).click();
        pause(3);

        webDriver.findElement(By.xpath("//a[@title='TOUS Bear ']")).click();

        WebElement selectedItem = webDriver.findElement(By.id("product-details-desktop-wrapper-first-component")).findElement(By.tagName("h1"));
        System.out.println("Selected Item is : " + selectedItem.getText());

        pause(5);

        // 1. Go to homepage
        // 2. Click on the search box
        // 3. Write some text to find items
        // 4. Click on one of the first row products.
    }
}
