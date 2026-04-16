package Page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TutorialNinjasPageObject {

    WebDriver driver;

    public TutorialNinjasPageObject(WebDriver driver) {
        this.driver = driver;
    }

    By myAccount = By.xpath("//span[text()='My Account']");
    By login = By.linkText("Login");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.xpath("//input[@value='Login']");

    public void navigateToLoginPage() {
        driver.findElement(myAccount).click();
        driver.findElement(login).click();
    }

    public void login(String userEmail, String userPassword) {
        driver.findElement(email).sendKeys(userEmail);
        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(loginBtn).click();
    }
}