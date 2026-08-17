package com.shreya.tests;
import com.shreya.base.BaseTest;
import com.shreya.pages.IFramePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest {

    @Test
    public void IFrameSwitch(){
        IFramePage iFramePage=new IFramePage(driver);
        iFramePage.switchToEditorFrame();
        iFramePage.enterText("Hello Shreya!");
        String actualText = iFramePage.getEditorText();
        Assert.assertEquals(actualText, "Your content goes here.");
        iFramePage.switchToDefaultContent();


    }
}
