package com.shreya.utils;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;


public class AlertUtils {

    public static String getAlertText(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public static void acceptAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void dismissAlert(WebDriver driver){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }
}
