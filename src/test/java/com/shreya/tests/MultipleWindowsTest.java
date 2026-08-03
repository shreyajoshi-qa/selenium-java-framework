package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.MultipleWindowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MultipleWindowsTest extends BaseTest {
    @Test
    public void switchWindowsHandle(){
        MultipleWindowsPage multipleWindowsPage=new MultipleWindowsPage(driver);
        String parentWindow = driver.getWindowHandle();
       String parentWindowText= multipleWindowsPage.getParentWindowText();
       multipleWindowsPage.clickOnClickHere();
       multipleWindowsPage.switchToChildWindow(parentWindow);
        String childWindowText= multipleWindowsPage.getChildWindowText();
        Assert.assertEquals(childWindowText, "New Window");
        multipleWindowsPage.switchToParentWindow(parentWindow);
        Assert.assertEquals(parentWindowText, "Opening a new window");


    }
}
