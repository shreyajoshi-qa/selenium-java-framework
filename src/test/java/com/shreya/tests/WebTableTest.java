package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.LoginPage;
import com.shreya.pages.WebTablePage;
import com.shreya.utils.AlertUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends BaseTest {

    @Test
    public void verifyDueAmountForSmith() {

        WebTablePage page = new WebTablePage(driver);

        String dueAmount = page.getDueAmountByLastName("Smith");

        Assert.assertEquals(dueAmount, "$50.00");
    }

    @Test
    public void clickEditForSmith() {
        WebTablePage page = new WebTablePage(driver);
        page.clickEditByLastName("Smith");

    }

    @Test
    public void verifyCompleteRowForSmith() {

        WebTablePage page = new WebTablePage(driver);

        List<String> rowData = page.getRowDataByLastName("Smith");

        System.out.println(rowData);

        Assert.assertEquals(rowData.get(0), "Smith");
        Assert.assertEquals(rowData.get(1), "John");
        Assert.assertEquals(rowData.get(3), "$50.00");
    }

    @Test
    public void verifyCellValueDynamically() {

        WebTablePage page = new WebTablePage(driver);

        String dueAmount = page.getCellValue("Smith", 3);

        Assert.assertEquals(dueAmount, "$50.00");
    }

    @Test
    public void verifySmith() {
        WebTablePage page = new WebTablePage(driver);

        List<String> rowData = page.getRowDataByLastName("Smith");

        System.out.println(rowData);

        Assert.assertEquals(rowData.get(0), "Smith");
        String dueAmount = page.getDueAmountByLastName("Smith");

        Assert.assertEquals(dueAmount, "$50.00");
        page.clickEditByLastName("Smith");

    }

    @Test
    public void verifyAllLastNames() {
        WebTablePage page = new WebTablePage(driver);
        List<String> rowData = page.getAllLastNames();
        System.out.println(rowData);
        Assert.assertTrue(rowData.contains("Smith"));
    }

    @Test
    public void verifyDueAmountCount() {
        WebTablePage page =new WebTablePage(driver);
        int count=page.getCountByDueAmount("$50.00");
        System.out.println(count);
        Assert.assertEquals(count,2);

    }

}