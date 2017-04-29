package Tests;

import Pages.AfterLoginPage;
import Pages.LoginPage;
import Pages.SendEmailPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by DELL on 3/26/2017.
 */
public class MyTest extends BaseTest {
    LoginPage loginPage;
    AfterLoginPage afterLoginPage;
    SendEmailPage sendEmailPage;
    @BeforeClass
    public void beforeClassMyTest() throws Exception {
        loginPage= new LoginPage(driver);
        afterLoginPage = new AfterLoginPage(driver);
    }

    @Test(description = "Login Test")
    public void testTest() throws Exception {

      String actual = loginPage.login("mytest_test","337774a").getMailUser();
      Assert.assertEquals(actual,"mytest_test@mail.ru","Error"); //проверка того что тест прошел

    }

    @Test (description = "WriteEmail Test")
    public void testWriteEmail() throws Exception {
       // loginPage.login("mytest_test","337774a");

        afterLoginPage.write();

    }

    @Test (description = "SendEmail Test")
    public void testSendEmail() throws Exception {
        sendEmailPage = new SendEmailPage(driver);
        sendEmailPage.send("natka89.08@gmail.com", "test");
    }
}
