package es.seidor;
import javafx.scene.web.WebHistory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.WebStorage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/* Mission 1 :
       Get the temporary email and bring it to login screen. */

public class AllLanguages extends TestMethods {

        @Test
        public void switchLanguages(){
            String wikipedia = "https://ko.wikipedia.org/wiki/%EC%9C%84%ED%82%A4%EB%B0%B1%EA%B3%BC:%EB%8C%80%EB%AC%B8";
            webDriver.navigate().to(wikipedia);
            List<WebElement> links2 = webDriver.findElements(By.className("interlanguage-link-target"));
            List<String> storage = new ArrayList<String>();
            for (int i= 0 ; i < links2.size() ; i++) {
                links2 = webDriver.findElements(By.className("interlanguage-link-target"));
                pause(1);
                links2.get(i).click();
                String url  = webDriver.getCurrentUrl();
                storage.add(url);
                System.out.println(storage.get(i));
                webDriver.navigate().back();
            }
            pause(5);
            }

        }