package assertions;

import org.testng.asserts.SoftAssert;

/**
 * Created by kohlih on 11-07-2017.
 */
public class MyAssertion {

    public static void assertAll(SoftAssert softAssert) {
        softAssert.assertAll();
    }

    public static void AreEqual(int expected, int actual, SoftAssert softAssert) {
        softAssert.assertEquals(actual,expected);
    }
}
