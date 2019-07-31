package es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends TousLoginTest {
    @Test
  /*  public void setScroll(){
        String wikipedia = "https://www.tous.com/es-es/pulsera-silueta-de-plata-vermeil/p/913561550";
        webDriver.get(wikipedia);
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("window.scrollTo(0,500)","");
        pause(5);
    } */
    public void showHiddenElement(){
        String wikipedia = "https://www.tous.com/es-es/pulsera-silueta-de-plata-vermeil/p/913561550";
        webDriver.get(wikipedia);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement elemento = webDriver.findElement(By.className("sub-category-list"));
        js.executeScript("argument[0].click();", elemento);

    /*  JavascriptExecutor scroll = (JavascriptExecutor) webDriver;
        WebElement elemento = webDriver.findElement(By.id("mailbox"));
        scroll.executeScript("argument[0].scrollIntroView();", elemento); */

    }


}
