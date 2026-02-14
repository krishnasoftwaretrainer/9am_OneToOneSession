package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagValidLogin {

	WebDriver driver;
	@Given("The user is on the signup page")
	public void the_user_is_on_the_signup_page()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
				
	}
	@When("The user enters a username {string} and user enters a password {string}")
	public void the_user_enters_a_username_and_user_enters_a_password(String vusername, String vpassword) throws InterruptedException
	{
	    WebElement username = driver.findElement(By.id("user-name"));
	    username.sendKeys(vusername);
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(vpassword);
	    Thread.sleep(2000); // Wait for 2 seconds to allow the page to load after clicking the login button
		
	
	}
	@And("The user clicks the signup button")
	public void the_user_clicks_the_signup_button() throws InterruptedException {
	   WebElement loginButton = driver.findElement(By.id("login-button"));
	   loginButton.click();	
	   Thread.sleep(2000); // Wait for 2 seconds to allow the page to load after clicking the login button
	
	}
	@Then("The user should see a signup successful alert")
	public void the_user_should_see_a_signup_successful_alert() throws InterruptedException 
	{
		
	    String expectedURL ="https://www.saucedemo.com/inventory.html";
	    String actualURL = driver.getCurrentUrl();
	    System.out.println("Expected URL: " + expectedURL);
	    System.out.println("Actual URL: " + actualURL);
	  
		
		//String ExceptedTitle = "Swag Labs";
		//String ActualTitle = driver.getTitle();
		
		
	    Thread.sleep(2000); // Wait for 2 seconds to allow the page to load after clicking the login button
		//Assert.assertEquals("Login was not successful" , ExceptedTitle, ActualTitle);
	    //Assert.assertTrue(actualURL.contains("inventory.html"));
	   Assert.assertEquals("Login was not successful.", expectedURL, actualURL);
	   Thread.sleep(2000); // Wait for 2 seconds to allow the page to load after clicking the login button
		
	   driver.quit();
	    
	   
	   
	   
	   
	   /*
	    if (expectedURL.equals(actualURL))
	    {
	        System.out.println("Login was successful. User is on the expected URL: " + expectedURL);
	    } 
	    else
	    {
	        System.out.println("Login was not successful. Expected URL: " + expectedURL + ", but got: " + actualURL);
	    }
	*/ 
	    
	}
}
