package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownSelection(){
        DropDownPage dropDownPage=new DropDownPage(driver);
        dropDownPage.selectOptionByValue("1");
        String option1=dropDownPage.getSelectedOption();
        Assert.assertEquals(option1,"Option 1");
        dropDownPage.selectOptionByValue("2");
        String option2=dropDownPage.getSelectedOption();
        Assert.assertEquals(option2,"Option 2");

    }

}
