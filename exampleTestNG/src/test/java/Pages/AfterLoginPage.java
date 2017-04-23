package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by DELL on 4/2/2017.
 */
public class AfterLoginPage extends BasePage {
    public AfterLoginPage(WebDriver driver) {
        //PageFactory.initElements(driver, this);
        super(driver);
    }

    @FindBy(id = "PH_user-email")
    private WebElement userLoginEmail;


    public String getMailUser() {
        return userLoginEmail.getText();
    }


}
