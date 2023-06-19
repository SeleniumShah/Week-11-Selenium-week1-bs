package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Project-4 - Project Name: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1.	Setup Chrome browser
 * 2.	Open URL
 * 3.	Print the title of the page
 * 4.	Print the current url
 * 5.	Print the page source
 * 6.	Enter the email to email field
 * 7.	Enter the password to password field
 * 8.	Close the browser
 */


public class MultiBrowserTest_SauceDemo {

    static String Browser = "Edge";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (Browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (Browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (Browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }

        driver.get(baseUrl);

        // Maximise
        driver.manage().window().maximize();

        // Wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title of the page
        System.out.println("The title of the page is : " + driver.getTitle());

        // Print the Current url
        System.out.println("The Current URL is : " + driver.getCurrentUrl());

        // Enter the email to email field
        WebElement emailLogin = driver.findElement(By.id("user-name"));
        emailLogin.sendKeys("abcd123@gmail.com");

        // Enter the password to password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Prime123");

        // Close Browser
        driver.close();

    }

}
