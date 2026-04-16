package Project.step.defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class LoginTest {
	public WebDriver driver;
	 public static void main(String[] args) {
		 // ✅ WebDriverManager setup
	        WebDriverManager.chromedriver().setup();
 
	        // Browser launch
	        WebDriver driver = new ChromeDriver();
 
	        driver.get("https://practicetestautomation.com/practice-test-login/");
	        driver.manage().window().maximize();
 
	        System.out.println(driver.getTitle());
	        driver.manage().window().maximize();
 
	        // Locate elements
	        WebElement username = driver.findElement(By.id("username"));
	        WebElement password = driver.findElement(By.id("password"));
	        WebElement submitBtn = driver.findElement(By.id("submit"));
 
	        // Enter credentials
	        username.sendKeys("student");
	        password.sendKeys("Password123");
 
	        // Click login
	        submitBtn.click();
 
	        // Validation
	        String currentUrl = driver.getCurrentUrl();
 
	        if (currentUrl.contains("logged-in-successfully")) {
	            System.out.println("Login Successful ✅");
	        } else {
	            System.out.println("Login Failed ❌");
	        }
 
	        // Close browser
	        driver.quit();
	    }
	}