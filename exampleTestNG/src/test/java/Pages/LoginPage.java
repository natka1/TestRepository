package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by DELL on 4/2/2017.
 */
public class LoginPage extends BasePage{


	@FindBy(id="mailbox__login")
	private WebElement name_;

	@FindBy(id="mailbox__password")
	private WebElement password_;

	@FindBy(id="mailbox__auth__button")
	private WebElement authButton;


	protected void setName_(String name) {
		name_.sendKeys(name);
	}

	protected void setPassword_(String password) {
		password_.sendKeys(password);
	}
	protected void authButtonClick_() throws InterruptedException {
		authButton.submit();
		Thread.sleep(7000);
	}
}
