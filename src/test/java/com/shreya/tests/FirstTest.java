package com.shreya.tests;

import com.shreya.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    @Test
    public void launchGoogle() {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}
