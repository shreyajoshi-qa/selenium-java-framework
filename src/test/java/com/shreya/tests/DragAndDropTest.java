package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.DragAndDropPage;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {
    @Test
    public void dragAndDropToDestination(){
        DragAndDropPage dragAndDropPage=new DragAndDropPage(driver);
        dragAndDropPage.dragSourceToDestination();
    }
}
