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
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//*[@id=\"navMenu\"]/ul/li[17]/a")).click(); 
		
		 
	}//*[@id="navMenu"]/ul/li[16]/a
	
	@Then("show all users")
	public void show_all_users() {
		
String s=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]")).getText();
System.out.println(s);
	assertEquals(s, "Team for asall");
		


}
}