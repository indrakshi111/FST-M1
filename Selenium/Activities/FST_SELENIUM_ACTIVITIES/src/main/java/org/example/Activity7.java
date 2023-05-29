package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Activity7 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Create the Actions object
        Actions action = new Actions(driver);

        // Open the page
        driver.get("https://training-support.net/selenium/drag-drop");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        WebElement ball=driver.findElement(By.id("draggable"));
        WebElement dropzone1=driver.findElement(By.id("droppable"));
        WebElement dropzone2=driver.findElement(By.id("dropzone2"));
        action.clickAndHold(ball).moveToElement(dropzone1).release().build().perform();
        String Text=driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
        if(Text.equalsIgnoreCase("Dropped!")){
            System.out.println("The ball has dropped zone1");
        }

        String Text1=driver.findElement(By.xpath("//*[@id='dropzone2']/p")).getText();
  action.dragAndDrop(ball,dropzone2).build().perform();
        if(Text.equalsIgnoreCase("Dropped!")){
            System.out.println("The ball has dropped zone2");
        }



        //Close the browser
        driver.close();
    }
}