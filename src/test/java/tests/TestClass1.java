package tests;

import assertions.MyAssertion;
import base.BaseTest;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by kohlih on 11-07-2017.
 */
public class TestClass1 extends BaseTest {

    @Test
    public void TempTest1()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(1,1,softAssert);
        MyAssertion.assertAll(softAssert);
    }

    @Test
    public void TempTest2() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(2,2,softAssert);
        MyAssertion.assertAll(softAssert);
    }

    @Test
    public void TempTest3() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(3,4,softAssert);
        MyAssertion.assertAll(softAssert);
    }

    @Test
    public void TempTest4()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(4,5,softAssert);
        MyAssertion.assertAll(softAssert);
    }


    @Test
    public void TempTest5()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAssertion.AreEqual(5,5,softAssert);
        MyAssertion.assertAll(softAssert);
    }
}
