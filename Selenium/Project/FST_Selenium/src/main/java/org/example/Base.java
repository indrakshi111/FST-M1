package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Base {
    public static WebDriver driver = null;

    public static void openURL(){

       driver.get("https://alchemy.hguy.co/lms/");
    }
    public static String getTitle(){
        String actualtitle;
        actualtitle=driver.getTitle();
        return actualtitle;
    }

}