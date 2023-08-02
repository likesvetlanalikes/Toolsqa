package tests;

import org.testng.annotations.Test;

public class FormTest extends tests.base.BaseTest {

    @Test
    public void formTest(){
        formPage.open();

        assertTrue(FormPage.isPageOpen());

    }
}
