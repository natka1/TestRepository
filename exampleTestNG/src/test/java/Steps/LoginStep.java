package Steps;

import Pages.LoginPage;
import Users.User;

import java.util.logging.Logger;

/**
 * Created by natka on 29.04.2017.
 */
public class LoginStep extends LoginPage{

    Logger logger = Logger.getLogger("LoginStep");
    public AfterLoginStep login(User user) throws InterruptedException {

        setName_(user.login);
        setPassword_(user.password);
        logger.info(String.format("log User name - %s password -%s",user.login, user.password));
        authButtonClick_();

        return new AfterLoginStep();
    }
}
