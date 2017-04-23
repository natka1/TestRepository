package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by DELL on 4/2/2017.
 */
public class LoginPage extends BasePage{
    //WebDriver driver;

	@FindBy(id="mailbox__login")
	private WebElement name_;

	@FindBy(id="mailbox__password")
	private WebElement password_;

	@FindBy(id="mailbox__auth__button")
	private WebElement authButton;


	public LoginPage(WebDriver driver) {
		/*this.driver=driver;
		PageFactory.initElements(driver,this);*/
		super(driver);
	}

	public AfterLoginPage login(String name, String password) throws InterruptedException {
		//new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt());

		name_.sendKeys(name);
		password_.sendKeys(password);
		authButton.submit();
		Thread.sleep(15000);
		return new AfterLoginPage(driver);
	}

}
