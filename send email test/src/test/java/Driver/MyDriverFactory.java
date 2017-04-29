package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by natka on 09.04.2017.
 */
public class MyDriverFactory {
    public static WebDriver getDriver(){
        String property = System.getProperty("driver");
        switch (property){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                return new ChromeDriver();
            default:
                System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                return new FirefoxDriver();
        }
    }


}
