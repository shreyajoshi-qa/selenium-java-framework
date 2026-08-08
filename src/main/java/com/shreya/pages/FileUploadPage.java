package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
    private WebDriver driver;
    private By uploadInput=By.id("file-upload");
    private By uploadButton = By.id("file-submit");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void uploadFile(String filePath){
        WaitUtils.waitForVisibility(driver, uploadInput);
        driver.findElement(uploadInput).sendKeys(filePath);
    }
    public void clickUploadButton(){
        WaitUtils.waitForVisibility(driver, uploadButton);
        driver.findElement(uploadButton).click();


    }
}


