package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Activity17 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://www.training-support.net/selenium/selects");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        WebElement selectdropdown=driver.findElement(By.id("single-select"));
        Select select=new Select(selectdropdown);
        select.selectByVisibleText("Option 2");
        // Print the selected option
        System.out.println("Second option: " + select.getFirstSelectedOption().getText());

        // Select the third option using index
        select.selectByIndex(3);
        // Print the selected option
        System.out.println("Third option: " + select.getFirstSelectedOption().getText());

        // Select the fourth option using value attribute
        select.selectByValue("4");
        System.out.println("Fourth option: " + select.getFirstSelectedOption().getText());
List<WebElement> selecttext=select.getOptions();
for(WebElement opt:selecttext){
    System.out.println("The options are"+ opt.getText());
}
// Close the browser
        driver.quit();

    }
}