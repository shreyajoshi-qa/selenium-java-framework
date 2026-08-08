package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.WebTablePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test
    public void verifyAgeOfShreya() {
        WebTablePage page = new WebTablePage(driver);
        String age = page.getAgeByName("Shreya");
        Assert.assertEquals(age, "28");
    }
}
