package base;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kohlih on 11-07-2017.
 */
public class BaseTest {
    //private static SoftAssert softAssert;
    //private static ThreadLocal threadLocal = new ThreadLocal();
    private static Map<String,SoftAssert> softAsserts = new ConcurrentHashMap<String, SoftAssert>();


    @BeforeMethod(alwaysRun = true)
    public void createSoftAssert(Method method)
    {
        SoftAssert softAssert = new SoftAssert();
        softAsserts.put(method.getName(),softAssert);
    }

    public SoftAssert getSoftAssert(ITestContext context) {
        return softAsserts.get(context.getName());
    }
}