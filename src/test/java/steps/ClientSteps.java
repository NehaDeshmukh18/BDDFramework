package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by neha.deshmukh on 7/5/2018.
 */
public class ClientSteps {

    WebDriver driver=new ChromeDriver();

    @Given("^the user is on landing page$")
    public void setup() {
        driver.get("https://www.freecrm.com/");
        driver.manage().window().maximize();
        System.out.println("On landing page");
 //       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("^she chooses to sign in$")
    public void she_chooses_to_sign_in(){
        driver.findElement(By.name("username")).sendKeys("naveenk");
        driver.findElement(By.name("password")).sendKeys("test@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
    @Then("^she should be logged in to the application$")
    public void she_should_be_logged_in_to_the_application() {
        try {
            Thread.sleep(2000);
            if(driver.findElement(By.xpath("//div[@id='navmenu']")).isDisplayed()){
                System.out.println("Login Successful");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
