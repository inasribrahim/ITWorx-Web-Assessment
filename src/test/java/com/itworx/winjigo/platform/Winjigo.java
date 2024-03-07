package com.itworx.winjigo.platform;

import com.itworx.winjigo.driver.DriverManager;
import com.itworx.winjigo.screen.LoginPage;
import com.itworx.winjigo.screen.WinjigoHome;
import org.openqa.selenium.WebDriver;

public class Winjigo {

    public WinjigoHome home;
    public LoginPage loginPage;
    public Winjigo(){
        home = new WinjigoHome();
        loginPage = new LoginPage();

    }
}
