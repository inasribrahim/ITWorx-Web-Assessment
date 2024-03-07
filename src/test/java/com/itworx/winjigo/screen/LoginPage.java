package com.itworx.winjigo.screen;

import org.openqa.selenium.By;


public class LoginPage extends BaseScreen {
    private final By usernameTextField = By.xpath("//input[@type='email']");
    private final By passwordTextField = By.xpath("//input[@type='password']");
    private final By logInButton = By.id("btnLogin");

    private LoginPage enterUsername(String username)  {
        waitUntilElementUntilIsVisible(usernameTextField).sendKeys(username);
        return this;
    }

    private LoginPage enterPassword(String password){
        waitUntilElementIsPresence(passwordTextField).sendKeys(password);
        return this;
    }

    private LoginPage clickOnLogin(){
        waitUntilElementUntilIsClickable(logInButton).click();
        return this;
    }

    public void Login(String username,String password){
        enterUsername(username).enterPassword(password).clickOnLogin();
    }

}
