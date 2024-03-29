package najah.edu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	    driver.get("https://classic.freecrm.com");

}
@When("User fill the login form and sumbit")
public void userFillTheLoginFormAndSumbit() {

	driver.findElement(By.name("username")).sendKeys("haneenbarham");
	 driver.findElement(By.name("password")).sendKeys("123456");
	 WebElement next_btn=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
	 next_btn.click();
	
 
}
@Then("user should navigate to next page")
public void userShouldNavigateToNextPage() {
	driver.switchTo().frame("mainpanel");
	
String s=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[1]")).getText();
System.out.println(s);
assertEquals(s, "CRMPRO");

}


}