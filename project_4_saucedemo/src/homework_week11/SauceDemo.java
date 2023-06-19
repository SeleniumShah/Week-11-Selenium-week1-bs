package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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


public class SauceDemo {

    public static void main(String[] args) {


        String baseUrl = "https://www.saucedemo.com/";

        // Launching the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get(baseUrl);

        // Maximize
        driver.manage().window().maximize();

        // Wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title of the page
        System.out.println("Page title is : " + driver.getTitle());

        // Print the current URL
        System.out.println("The Current URL is : " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("The PageSource is : " + driver.getPageSource());

        // Enter the email to email field
        WebElement emailLogin = driver.findElement(By.id("user-name"));
        emailLogin.sendKeys("abcd123@gmail.com");

        // Enter the password to password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Prime123");

        // Close the Browser
        driver.close();

    }

}

