package test.es.seidor;

import es.seidor.TestMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class functionTest extends TestMethods {
    @Test
    public void function(){
        //doubleclick
        String tous = "https://www.tous.com/es-es/";
        webDriver.get(tous);
        Actions action = new Actions(webDriver);
        WebElement elementdoubleclick2 = webDriver.findElement(By.className("simple-banner-component"));
        action.doubleClick(elementdoubleclick2).perform();
        pause(2);

        //contextclick
        WebElement elementrightclick = webDriver.findElement(By.className("simple-banner-component"));
        action.contextClick(elementrightclick).perform();
        action.contextClick(elementrightclick).pause(1);
        action.moveToElement(elementdoubleclick2);
        pause(2);
/*
        //mousehover
        WebElement topBar2 = webDriver.findElement(By.className("displayAuxiliar"));
        action.moveToElement(topBar2).perform();
        pause(5);

        //slider
        WebElement slider = webDriver.findElement(By.className("accordion-container"));
        int width=slider.getSize().getWidth();
        int h = slider.getSize().getHeight();
        Actions move = new Actions(webDriver);
        move.moveToElement(slider, ((width*10)/100), h).click();
        move.build().perform();

        //Taking a screenshot
        public static void takeScreenShotTest(WebDriver webDriver, String imageName) {
            // Directory that will keep saved pictures
            File directory = new File("C:\\captureSelenium");
            try {
                if (directory.isDirectory()) {
                    //Take the screeenshot
                    File imagen = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
                    //Move the image to the right file directory
                    FileUtils.copyFile(imagen, new File(directory.getAbsolutePath()   + "\\" + imageName +".png"));
                }
                else {
                    //An exception is thrown if the directory cannot be found
                    throw new IOException("ERROR : The specified route is not a directory!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
    }
}
