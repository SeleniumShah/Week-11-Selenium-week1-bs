package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-2 - Project Name: com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1.	Setup Chrome browser
 * 2.	Open URL
 * 3.	Print the title of the page
 * 4.	Print the current url
 * 5.	Print the page source
 * 6.	Enter the email to email field
 * 7.	Enter the password to password field
 * 8.	Close the browser
 */

public class OrangeHrmLive {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // Launching the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the URL into Browser
        driver.get(baseUrl);

        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);
        // System.out.println("Page Title is " + driver.getTitle());

        // Get the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current URL is : " + url);
        //System.out.println("Current URL " + driver.getCurrentUrl());

        // Get Page Source
        String pageSource = driver.getPageSource();
        System.out.println("Page Source " + pageSource);
        //System.out.println("Page Source : " + driver.getPageSource());

        // Find the Username Field Element
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // Find the password field and type the password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Close the Browser
        driver.close();
    }
}
