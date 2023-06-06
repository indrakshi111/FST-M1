package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class GoogleSearchSteps {
    WebDriver driver;
    WebDriverWait wait;
    @Given("^User is on Google Home Page$")
    public void user_is_on_google_search_page(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver() ;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.google.com");
    }
    @When("^User types in Cheese and hits ENTER$")
    public void user_types_in_cheese_and_enter(){

        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
    }
    @Then("^Show how many search results were shown$")
    public void show_search_results(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);

    }
    @And("^Close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
