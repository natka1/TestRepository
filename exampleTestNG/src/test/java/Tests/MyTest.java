package Tests;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by DELL on 3/26/2017.
 */
public class MyTest extends BaseTest {
    LoginPage loginPage;
    @BeforeClass
    public void beforeClassMyTest() throws Exception {
        loginPage= new LoginPage(driver);

    }

    @Test(description = "Login Test")
    public void testTest() throws Exception {

      String actual = loginPage.login("mytest_test","337774a").getMailUser();
      Assert.assertEquals(actual,"mytest_test@mail.ru","Error"); //проверка того что тест прошел

    }


}
