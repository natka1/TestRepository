package Tests;

import Driver.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by DELL on 4/8/2017.
 */
public class BaseTest {

    protected WebDriver driver;
    final String BASE_URL = "https://mail.ru/";

    @BeforeSuite
    public void beforeSuite() throws Exception {
        driver = MyDriverFactory.getDriver();
        driver.get(BASE_URL);
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        driver.quit();
    }
}
