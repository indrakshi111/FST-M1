package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Activity5 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Create the Actions object
        Actions action = new Actions(driver);

        // Open the page
        driver.get("https://www.training-support.net/selenium/input-events");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Perform left click
        action.click().build().perform();
        // Print the front side text
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

    //perform double click
        action.doubleClick().build().perform();
        // Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Perform right click
        action.contextClick().build().perform();
        // Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Close the browser
        //driver.close();
    }
}