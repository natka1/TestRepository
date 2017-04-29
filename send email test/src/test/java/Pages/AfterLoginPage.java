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

    @FindBy(className = "b-toolbar__btn")
    private WebElement writeButton;

    public String getMailUser() {
        return userLoginEmail.getText();
    }
    public SendEmailPage write() throws InterruptedException {
        //new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt());


        writeButton.click();
        Thread.sleep(3000);
        return new SendEmailPage(driver);
    }


}
