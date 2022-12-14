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

public class feature2 {
	WebDriver driver;
	
	@When("user add new todo")
	public void userAddNewTodo() {
	  driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
		  
	  
	}
	@Then("the added todo is correctly displayed")
	public void theAddedTodoIsCorrectlyDisplayed() {
		WebElement task=driver.findElement(By.cssSelector("[data-testid=\"todo-text\"]"));
		assertEquals(task ,"quiz");
	}

	@Given("user is in home")
	public void user_is_in_home() {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
		    driver.manage().window().maximize();
		    driver.get("https://classic.freecrm.com");

			driver.findElement(By.name("username")).sendKeys("haneenbarham");
			 driver.findElement(By.name("password")).sendKeys("123456");
			 WebElement next_btn=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
			 next_btn.click();
	}
	
	@When("submit team view")
	public void submit_team_view() {
		driver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[16]/a")).getAttribute("list-style: none;\r\n"
				+ "			    font-family: verdana, sans-serif;\r\n"
				+ "			    font-size: 11px;\r\n"
				+ "			    font-weight: bold;\r\n"
				+ "			    border: 1px solid #127CA8;\r\n"
				+ "			    text-decoration: none;\r\n"
				+ "			    margin: 2px;\r\n"
				+ "			    color: black;\r\n"
				+ "			    display: block;\r\n"
				+ "			    padding: 3px 3px 3px 3px;");
		
		
		
		 
	}//*[@id="navMenu"]/ul/li[16]/a
	
	@Then("show all users")
	public void show_all_users() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}


}
