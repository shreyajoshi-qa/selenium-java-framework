package com.shreya.tests;

import com.shreya.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.shreya.pages.LoginPage;

public class FirstTest extends BaseTest {
    @Test
    public void launchGoogle() {
       driver.get("https://www.google.com");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.search("Selenium");
    }
}
