package tests;

import assertions.MyAssertion;
import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by kohlih on 11-07-2017.
 */
public class TestClass2 extends BaseTest {

    @Test
    public void TempTest6()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(6,6,softAssert);
        MyAssertion.assertAll(softAssert);
    }

    @Test
    public void TempTest7()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(7,7,softAssert);
        MyAssertion.assertAll(softAssert);
    }

    @Test
    public void TempTest8()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(8,9,softAssert);
        MyAssertion.assertAll(softAssert);
    }

    @Test
    public void TempTest9()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(9,10,softAssert);
        MyAssertion.assertAll(softAssert);
    }


    @Test
    public void TempTest10()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(10,10,softAssert);
        MyAssertion.assertAll(softAssert);
    }
}
