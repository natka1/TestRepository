package Pages;

import Driver.MyDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by DELL on 4/2/2017.
 */
public class BasePage {

    protected static final MyDriver driver= new MyDriver();
    protected final String BASE_URL = "https://mail.ru/";

    public BasePage() {

        PageFactory.initElements(driver,this);
    }
}
