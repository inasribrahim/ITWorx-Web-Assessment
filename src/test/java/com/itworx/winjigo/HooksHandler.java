package com.itworx.winjigo;

import com.itworx.winjigo.driver.Driver;
import com.itworx.winjigo.driver.DriverManager;
import com.itworx.winjigo.tests.BaseTest;
import com.itworx.winjigo.read_properties.ReadProperties;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import java.io.IOException;

public class HooksHandler extends BaseTest {
        JavascriptExecutor executor;
        public static String getBrowserName() throws IOException {
            return ReadProperties.setWinjigoConfig().getProperty("browserName");
        }

        @BeforeTest(alwaysRun = true)
        protected void setUp() throws IOException {
            Driver.initDriver(getBrowserName());
            Driver.setMaximizeBrowser();
            clearCache();
            configProperties = ReadProperties.setWinjigoConfig();
        }

        @AfterTest(alwaysRun = true)
        public void close() {
            Driver.closeDriver();
        }
        public void clearCache(){
            executor = (JavascriptExecutor) DriverManager.getWebDriver();
            executor.executeScript("window.localStorage.clear();");
            executor.executeScript("window.sessionStorage.clear();");
        }
    }
