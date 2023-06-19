package homework_week11;

/**
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl =   https://demo.nopcommerce.com/login?returnUrl=%2
 * 1.	Setup Chrome browser
 * 2.	Open URL
 * 3.	Print the title of the page
 * 4.	Print the current url
 * 5.	Print the page source
 * 6.	Enter the email to email field
 * 7.	Enter the password to password field
 * 8.	Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class comNopCommerce {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        //Lunching the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //open the URL into Browser
        driver.get(baseUrl);

        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title of the page
        System.out.println("Page title is : " + driver.getTitle());

        // Print the current Url
        driver.getCurrentUrl();
        System.out.println("The current url is " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source is " + driver.getPageSource());

        // Find the email field
        WebElement emailField = driver.findElement(By.id("Email"));

        // Type the email to email field
        emailField.sendKeys("Prime123@gmail.com");

        // Find the password field
        WebElement passwordField = driver.findElement(By.name("Password"));

        // Type the password to password Field
        passwordField.sendKeys("Prime123");

        // Close the Browser
        driver.close();

    }
}
