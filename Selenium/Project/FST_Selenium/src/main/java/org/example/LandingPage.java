package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.Base.getTitle;
import static org.example.Base.openURL;

public class LandingPage {
     WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver=driver;
    }

    By headingtext=By.xpath("//h1[@class='uagb-ifb-title']");
    By firstinfobox=By.xpath("//h3[@class='uagb-ifb-title']");
  By popularcourse=By.xpath("(//h3[@class='entry-title'])[2]");
  By MyAccountlink=By.xpath("//*[text()='My Account']");
  By Loginbtn=By.xpath("//a[text()='Login']");

    By userName=By.xpath("//*[@id='user_login']");
    By password=By.xpath("//*[@id='user_pass']");
    By submitbtn=By.xpath("//*[@name='wp-submit']");

    By Logintext=By.xpath("//*[@class='menupop with-avatar']/a");
    By allcoursesmenu=By.xpath("//*[text()='All Courses']");
    By contact=By.xpath("//*[text()='Contact']");
    By Fullname=By.xpath("//*[text()='Full Name ']/following::input[1]");
    By Email=By.xpath("//*[text()='Email ']/following::input[1]");
    By subject=By.xpath("//*[text()='Subject']/following::input[1]");
    By comments=By.xpath("//*[text()='Comment or Message ']/following::textarea");
    By buttonsubmit=By.xpath("//button[text()='Send Message']");
    By contacttext=By.xpath("(//*[contains(text(),'Send')]/following::div/p)[2]");
    By selectCourse=By.xpath("(//*[text()='Content Marketing']/following::a)[1]");
    By selectcourse1=By.xpath("(//*[text()='Course Content']/following::a)[2]");
    By Markcompletebtn=By.xpath("(//*[@value='Mark Complete'])[2]");
   public String validatewebsiteheading(){
       String actualheading;
       actualheading=driver.findElement(headingtext).getText();
       System.out.println(actualheading);
       return actualheading;
   }
    public String validateinfoboxheading(){
        String actualheading;
        actualheading=driver.findElement(firstinfobox).getText();
        System.out.println(actualheading);
        return actualheading;
    }
    public String validate_second_popular_courseheading(){
        String actualheading;
        actualheading=driver.findElement(popularcourse).getText();
        System.out.println(actualheading);
        return actualheading;
    }
    public String NavigatetoAnotherPage() throws InterruptedException {
       driver.findElement(MyAccountlink).click();
       Thread.sleep(1000);
       String actualpagetitle=getTitle();
        System.out.println(actualpagetitle);
       return actualpagetitle;
    }
    public void login(){
        driver.findElement(Loginbtn).click();
        driver.findElement(userName).sendKeys("root");
        driver.findElement(password).sendKeys("pa$$w0rd");
        driver.findElement(submitbtn).click();
    }
    public String getlogintext(){
    String logintextvalue=driver.findElement(Logintext).getText();
      return logintextvalue;

    }
    public void findallcourses() {
        driver.findElement(contact).click();
        List<WebElement> courses = driver.findElements(By.xpath("//h3[@class='entry-title']"));
        System.out.println("Total No of Courses" + courses.size());
        for (WebElement ele : courses) {

            System.out.println("The courses are" + ele.getText());
        }
    }
        public String adminpageoperations() throws InterruptedException {
            driver.findElement(contact).click();
            Thread.sleep(1000);
           driver.findElement(Fullname).sendKeys("Indrakshi Bhattacharjee");
           driver.findElement(Email).sendKeys("indrakshi.bhattacharjee@ibm.com");
           driver.findElement(subject).sendKeys("Content Marketing");
           driver.findElement(comments).sendKeys("Test Comments");
           driver.findElement(buttonsubmit).click();
           String actualtext=driver.findElement(contacttext).getText();
           System.out.println("The text message is " +actualtext);
           return actualtext;
    }
    public String verifytitleofthecoursepage() throws InterruptedException {
        driver.findElement(allcoursesmenu).click();
        Thread.sleep(1000);
        driver.findElement(selectCourse).click();
        Thread.sleep(1000);
        driver.findElement(selectcourse1).click();
        String actualCoursetitle=driver.getTitle();
        return actualCoursetitle;

    }
    public void markcomplete(){
        try {
            if(driver.findElement(Markcompletebtn).isDisplayed()){
                driver.findElement(Markcompletebtn).click();
               }
            else{
               System.out.println("The course is already completed");
            }
        } catch (Exception e) {

        }
    }
}
