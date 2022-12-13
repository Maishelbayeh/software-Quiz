package quiz.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class login {
WebDriver driver;

	@Given("user is in login page")
	public void userIsInLoginPage() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
		    driver.manage().window().maximize();
		    driver.get("https\\qacart-todo.herokuapp.com");

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
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User fill the login form and sumbit")
	public void user_fill_the_login_form_and_sumbit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should navigate to next page")
	public void user_should_navigate_to_next_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}







}
