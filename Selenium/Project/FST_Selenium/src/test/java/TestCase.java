import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Base;
import org.example.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class TestCase extends Base {

    @BeforeMethod
            public void initialise() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        openURL();
    }
   @Test(priority = 1)
   public void verify_website_title(){
       String expectedTitle="Alchemy LMS – An LMS Application";
       String actualTitle;
       actualTitle=getTitle();
       Assert.assertEquals(actualTitle,expectedTitle);
       if(actualTitle.equalsIgnoreCase(expectedTitle)){
           driver.quit();
       }
       else{
           System.out.println("Assertion Failed");
       }


  }
   @Test(priority = 2)
   public void verify_website_heading(){
       LandingPage obj=new LandingPage(driver);
       String expectedHeading="Learn from Industry Experts";
       String actualHeading;
       //openURL();
       actualHeading=obj.validatewebsiteheading();
       Assert.assertEquals(actualHeading,expectedHeading);
       if(actualHeading.equalsIgnoreCase(expectedHeading)){
           driver.quit();
       }
       else{
           System.out.println("Assertion Failed");
       }


   }
    @Test(priority = 3)
    public void verify_infobox1_heading(){
        LandingPage obj=new LandingPage(driver);
        String expectedHeading="Actionable Training";
        String actualHeading;
        actualHeading=obj.validateinfoboxheading();
        Assert.assertEquals(actualHeading,expectedHeading);
        if(actualHeading.equalsIgnoreCase(expectedHeading)){
            driver.quit();
        }
        else{
            System.out.println("Assertion Failed");
        }


    }
    @Test(priority = 4)
    public void verify_second_popularcourse_heading(){
        LandingPage obj=new LandingPage(driver);
        String expectedHeading="Email Marketing Strategies";
        String actualHeading;
        actualHeading=obj.validate_second_popular_courseheading();
        Assert.assertEquals(actualHeading,expectedHeading);
        if(actualHeading.equalsIgnoreCase(expectedHeading)){
            driver.quit();
        }
        else{
            System.out.println("Assertion Failed");
        }


    }
    @Test(priority = 5)
    public void verifyMyAccountPageTitle() throws InterruptedException {
        LandingPage obj=new LandingPage(driver);
        String expectedHeading="My Account – Alchemy LMS";
        String actualHeading;
        actualHeading=obj.NavigatetoAnotherPage();
        Assert.assertEquals(actualHeading,expectedHeading);
        if(actualHeading.equalsIgnoreCase(expectedHeading)){
            driver.quit();
        }
        else{
            System.out.println("Assertion Failed");
        }


    }
    @Test(priority = 6)
    public void verifyLogin() throws InterruptedException {
        LandingPage obj=new LandingPage(driver);
        String expectedHeading="My Account – Alchemy LMS";
        String expectedLoginText="Howdy, root";
        String actualHeading;
        actualHeading=obj.NavigatetoAnotherPage();
        Assert.assertEquals(actualHeading,expectedHeading);
        obj.login();
        String actualLoginText=obj.getlogintext();
        Assert.assertEquals(actualLoginText,expectedLoginText);
        driver.close();

    }
    @Test(priority = 7)
    public void countnoofcourses(){
        LandingPage obj=new LandingPage(driver);
        obj.findallcourses();
    }
    @Test(priority = 8)
    public void contacttheadmin() throws InterruptedException {
        String expectedcontacttext="Thanks for contacting us! We will be in touch with you shortly.";
        LandingPage obj=new LandingPage(driver);
        String actualcontacttext=obj.adminpageoperations();
        Assert.assertEquals(actualcontacttext,expectedcontacttext);
        driver.quit();

    }
    @Test(priority = 9)
    public void completeasimplelesson() throws InterruptedException {
        LandingPage obj=new LandingPage(driver);
        obj.NavigatetoAnotherPage();
        obj.login();
        String expectedtitle="Analyze Content & Develop Writing Strategies – Alchemy LMS";
        String actualtitle=obj.verifytitleofthecoursepage();
        Assert.assertEquals(expectedtitle,actualtitle);
        obj.markcomplete();
        driver.quit();
    }

}
