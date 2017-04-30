package Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by DELL on 4/8/2017.
 */
public class BaseTest {
    protected MyApplication app;

    @BeforeSuite
    public void beforeSuite()  {
        app = new MyApplication();
        app.common.startDriver();

    }

    @AfterSuite
    public void afterSuite() {
        app.common.stopDriver();
    }
}
