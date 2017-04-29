package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by natka on 28.04.2017.
 */
public class SendEmailPage extends BasePage {
    public SendEmailPage(WebDriver driver) {

        super(driver);
    }


    @FindBy(xpath = "//div/textarea[@data-original-name=\"To\"]")
    private WebElement address_;

    @FindBy(xpath = "//div/input[@name=\"Subject\"]")
    private WebElement subject_;

    @FindBy(xpath = "//div/[@data-name=\"send\"]span[@class=\"b-toolbar__btn__text\"]")
    private WebElement sendButton;

    public void send(String address, String subject) throws InterruptedException {


        address_.sendKeys(address);
        subject_.sendKeys(subject);
        sendButton.click();



        //Thread.sleep(15000);
        //return new AfterLoginPage(driver);
    }



    }
