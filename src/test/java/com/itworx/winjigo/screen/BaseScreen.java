package com.itworx.winjigo.screen;


import com.itworx.winjigo.driver.DriverManager;
import com.itworx.winjigo.waits.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class BaseScreen extends WaitUtils {

    JavascriptExecutor executor;
    public void clickOnElementUsingJS(WebElement link){
        executor = (JavascriptExecutor) DriverManager.getWebDriver();
        executor.executeScript("arguments[0].click();", link);
    }
    public String getElementText(By by){
        return waitUntilElementIsPresence(by).getText();
    }
    public boolean elementIsExisted(By by) {
        return !DriverManager.getWebDriver().findElements(by).isEmpty();
    }
    public void goTo(String url){
        DriverManager.getWebDriver().navigate().to(url);
    }
    public void back() {
        DriverManager.getWebDriver().navigate().back();
    }

}
