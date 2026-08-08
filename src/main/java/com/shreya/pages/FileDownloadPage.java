package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownloadPage {
    private WebDriver driver;
    private By downloadFile = By.linkText("selenium-demo-6384647058173547972.txt");

    public FileDownloadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void downloadFile(){
        WaitUtils.waitForVisibility(driver, downloadFile);
        driver.findElement(downloadFile).click();
    }
}
