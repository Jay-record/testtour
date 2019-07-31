package es.seidor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestMethods extends TousLoginTest {
    public void landomtest() {

    }
    public void scrollDown(){
        JavascriptExecutor jsescrolldown = (JavascriptExecutor)webDriver;
        jsescrolldown.executeScript("window.scrollBy(0,250)", ""); }

    public void doubleClick(WebElement doubleclick){
        Actions action = new Actions(webDriver);
        action.doubleClick(doubleclick).perform(); }

    public void rightClick (WebElement elementrightclick){
        Actions rightClickAction = new Actions(webDriver).contextClick(elementrightclick);
        rightClickAction.build().perform(); }

public void javascripexecutormethod(WebElement a){
    JavascriptExecutor js = (JavascriptExecutor)webDriver;
    js.executeScript("arguments[0].click();", a);
}
}
