package Tests;

import Users.User;
import Users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by DELL on 3/26/2017.
 */
public class MyTest extends BaseTest {

    @Test(description = "Login Test")
    public void testTest() throws Exception {
        User validUser = UserFactory.getValidUser();
        app.login.login(UserFactory.getValidUser());

      Assert.assertEquals(app.afterLogin.getMailUser(),validUser.mail,"Error"); //проверка того что тест прошел

    }


}
