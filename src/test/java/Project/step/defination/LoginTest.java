package Project.step.defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;


public class LoginTest {

    WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }

    @And("user enters password {string}")
    public void user_enters_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        String url = driver.getCurrentUrl();

        if (url.contains("logged-in-successfully")) {
            System.out.println("Login Successful ✅");
        } else {
            System.out.println("Login Failed ❌");
        }

        driver.quit();
    }
}