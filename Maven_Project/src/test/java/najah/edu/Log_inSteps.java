package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class Log_inSteps {
	
	WebDriver driver;

@Given("user is in login page")
public void userIsInLoginPage() {
	 WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
	    driver.manage().window().maximize();
	    driver.get("https:\\qacart-todo.herokuapp.com");

}
@When("User fill the login form and sumbit")
public void userFillTheLoginFormAndSumbit() {

		driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("mayshelbayeh5@gmail.com");
		driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("momo1234567sh");
		driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();

 
}
@Then("user should navigate to next page")
public void userShouldNavigateToNextPage() {
	boolean isWelcomeMessage=driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();	
	Assert.assertTrue(isWelcomeMessage)	;
}


}