package tous.es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class tous_007 extends tous_base{
    @Test
    public void test7(){
        // 1. Perform the test #006

        // #006
        // 1. Go to homepage.
        String BaseUrl = "https://www.tous.com/us-en/";
        webDriver.navigate().to(BaseUrl);
        String windowHandle = webDriver.getWindowHandle();
        pause(1);

        // 2. Click on one category.
        List<WebElement> category = webDriver.findElements(By.className("displayAuxiliar"));
        category.get(1).click();

        // 3. Enter in one product page.
        webDriver.findElement(By.xpath("//*[@id=\"showMenuCategories\"]/ul/div[1]/ul/div[1]/li/a")).click();
        pause(1);
        webDriver.findElement(By.id("current-product-info-918542620")).click();
        pause(1);

        // 4. Click on the add to wishlist button
        webDriver.findElement(By.className("icon-tous-pdp-save-wishlist")).click();

        // 5. Write a name for the new wishlist
        WebElement wishList = webDriver.findElement(By.id("createWishlistInputName"));
        wishList.sendKeys("FAV");

        // 6. Click on the "Create new wishlist" button
        wishList.click();
        webDriver.findElement(By.id("createWishlistSaveButton")).click();
        pause(3);
        // 7. Click on the wishlist button
        webDriver.findElement(By.className("icon-tous-pdp-save-wishlist")).click();

        // 8. Select the FAV wishlist
        WebElement fav = webDriver.findElement(By.name("selectedWishlist"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", fav);

        // 9. Click on the "Add to your wishlist" button
        webDriver.findElement(By.id("submit-selected-wishlists")).click();
        pause(5);
        // 10. Click on the wishlist button
        webDriver.findElement(By.xpath("//*[@id=\"container-icons2\"]/ul/li[2]/a")).click();

        // 11. Check if the saved item is in the wishlist
        List<WebElement>  favWishList = webDriver.findElements(By.className("js-wishlist")).
                get(0).findElements(By.className("row")).get(0).findElements(By.className("col-xs-12"));
        if(favWishList.size() != 0){
            System.out.println("Fav Element Exist : " + favWishList.size());
        }
        pause(10);

        // #006 End
        // 2. In the wishlist, click on the "see the list" button.

        // 3. Click on the "send the list" button.

        // 4. Write a sender email.

        // 5. Write a reciever email.

        // 6. Click on the "I agree" button.

        // 7. Click on the "Accept" button.

    }
}
