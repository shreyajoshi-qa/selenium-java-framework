package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.ActionsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest extends BaseTest {
    @Test
    public void verifyHover() {
        ActionsPage actionsPage = new ActionsPage(driver);
        actionsPage.hoverOnFirstImage();
        String actual = actionsPage.getUserName();
        Assert.assertEquals(actual, "name: user1");
    }

}
