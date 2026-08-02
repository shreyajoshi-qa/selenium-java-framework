package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.DoubleClickPage;
import com.shreya.utils.AlertUtils;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest extends BaseTest {
    @Test
    public void doubleClickOnButton(){
        DoubleClickPage doubleClickPage=new DoubleClickPage(driver);
        doubleClickPage.doubleClickOnButton();
        String actualText = AlertUtils.getAlertText(driver);
        Assert.assertEquals(actualText, "You double clicked me.. Thank You..");
        AlertUtils.acceptAlert(driver);

    }
}
