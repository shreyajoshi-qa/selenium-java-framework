package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.ActionsPage;
import com.shreya.pages.ContextMenuPage;
import com.shreya.utils.AlertUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {
    @Test
    public void rightClickOnBox(){
        ContextMenuPage contextMenuPage =new ContextMenuPage(driver);
        contextMenuPage.contextClick();
        String actualText = AlertUtils.getAlertText(driver);
        Assert.assertEquals(actualText, "You selected a context menu");
        AlertUtils.acceptAlert(driver);
    }
}
