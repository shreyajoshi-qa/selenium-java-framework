package com.shreya.utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class WaitUtils {
    public static void waitForVisibility(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public static File waitForFileDownload(
            WebDriver driver,
            String downloadPath,
            File[] filesBefore) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        return wait.until(d -> {

            File downloadDir = new File(downloadPath);
            File[] files = downloadDir.listFiles();

            if (files != null) {

                for (File file : files) {

                    boolean isNewFile = true;

                    for (File oldFile : filesBefore) {

                        if (file.equals(oldFile)) {
                            isNewFile = false;
                            break;
                        }
                    }

                    if (isNewFile &&
                            !file.getName().endsWith(".crdownload")) {

                        return file;
                    }
                }
            }

            return null;
        });
    }
    public static Alert waitForAlert(WebDriver driver) {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void waitForInvisibility(WebDriver driver, By locator) {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(locator)
        );
    }
}
