package com.itworx.winjigo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/com/itworx/winjigo/tests/e2e",
        glue = {"com.itworx.winjigo.tests"},
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true
)

public class WinjigoTestRunner extends AbstractTestNGCucumberTests {
}

