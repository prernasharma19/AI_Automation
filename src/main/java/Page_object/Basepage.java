package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {

	public WebDriver driver;
	public Basepage(WebDriver driver) {
	          this.driver = driver;
	          PageFactory.initElements(driver, this);
		    }
		}


