package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.JavaScriptAlertPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlertTest extends BaseTest {

    @Test
    public void javaScriptAlertOnClick(){
        JavaScriptAlertPage javaScriptAlertPage=new JavaScriptAlertPage(driver);
        javaScriptAlertPage.clickJsAlert();
        String actualText= javaScriptAlertPage.getAlertText();
        Assert.assertEquals(actualText,"I am a JS Alert");
        javaScriptAlertPage.acceptAlert();
        //javaScriptAlertPage.dismissAlert();
    }
    @Test
    public void javaScriptAlertConfirm(){
        JavaScriptAlertPage javaScriptAlertPage=new JavaScriptAlertPage(driver);
        javaScriptAlertPage.clickJSConfirm();
        String actualText=javaScriptAlertPage.getAlertText();
        Assert.assertEquals(actualText,"I am a JS Confirm");
        javaScriptAlertPage.dismissAlert();

    }
    @Test
    public void javaScriptAlertPrompt(){
        JavaScriptAlertPage javaScriptAlertPage=new JavaScriptAlertPage(driver);
        javaScriptAlertPage.clickJSPrompt();
        javaScriptAlertPage.enterTextInAlert("Shreya");
        String actualText=javaScriptAlertPage.getAlertText();
        Assert.assertEquals(actualText,"I am a JS prompt");
        javaScriptAlertPage.acceptAlert();
        String promptResultText=javaScriptAlertPage.getPromptResult();
        Assert.assertEquals(promptResultText,"You entered: Shreya");



    }


}
