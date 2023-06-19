package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-3 - Project Name: com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1.	Setup Chrome browser
 * 2.	Open URL
 * 3.	Print the title of the page
 * 4.	Print the current url
 * 5.	Print the page source
 * 6.	Enter the email to email field
 * 7.	Enter the password to password field
 * 8.	Close the browser
 */


public class HerokuApp {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";

        // Launching the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open URL into Browser
        driver.get(baseUrl);

        // Maximise the Browser
        driver.manage().window().maximize();

        // Wait Duration
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        // Print the current url
        System.out.println("Print the current url " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Print the pageSource " + driver.getPageSource());

        // Enter the username to username field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("abcd123@gmail.com");

        // Enter the password to password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Prime123");

        // Close the Browser
        driver.close();


    }
}
