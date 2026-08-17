package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {
    private WebDriver driver;
    private By jsAlertButton =By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmButton=By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromtButton=By.xpath("//button[text()='Click for JS Prompt']");
    private By promptResult = By.id("result");

    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickJsAlert() {
        driver.findElement(jsAlertButton).click();
    }
    public void clickJSConfirm(){
        driver.findElement(jsConfirmButton).click();
    }
    public void clickJSPrompt(){
        driver.findElement(jsPromtButton).click();

    }
    public void acceptAlert(){
      //  WaitUtils.waitForVisibility(driver,jsAlertButton);
        Alert alert=WaitUtils.waitForAlert(driver);
        alert.accept();
    }
    public String getAlertText() {
        Alert alert = WaitUtils.waitForAlert(driver);
        return alert.getText();
    }
    public String getPromptResult(){
        return driver.findElement(promptResult).getText();
    }
    public void dismissAlert(){
        Alert alert=WaitUtils.waitForAlert(driver);
        alert.dismiss();
    }
    public void enterTextInAlert(String text) {
        Alert alert=WaitUtils.waitForAlert(driver);
        alert.sendKeys(text);

    }

}
