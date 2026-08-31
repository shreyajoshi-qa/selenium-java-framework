package com.shreya.pages;

import com.shreya.base.BasePage;
import com.shreya.utils.WaitUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage extends BasePage {
    private By jsAlertButton =By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmButton=By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromtButton=By.xpath("//button[text()='Click for JS Prompt']");
    private By promptResult = By.id("result");

    public JavaScriptAlertPage(WebDriver driver) {
        super(driver);
    }
    public void clickJsAlert() {
        click(jsAlertButton);
    }
    public void clickJSConfirm(){
        click(jsConfirmButton);
    }
    public void clickJSPrompt(){
        click(jsPromtButton);

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

        return getText(promptResult);
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
