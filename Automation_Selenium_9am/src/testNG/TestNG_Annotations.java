package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Annotations {
	
	WebDriver driver;
	
	//@BeforeTest
	@BeforeMethod
	public void BrowserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}	
	
	//Test Case 1: SwagLabs Login Valid-Valid
	@Test(priority=1)
	public void SwagLabsLogin_ValidValid() throws InterruptedException
	{
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
	}
	
	//Test Case 2: SwagLabs Login InValid-InValid  disabled test case
	
	@Test(priority=2, enabled=true)
	public void SwagLabsLogin_InvalidInvalid()
	{
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("fjsjfjj");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sjfjsj");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
	}
	
	//@AfterTest
	@AfterMethod
	public void BrowserClose()
	{
		driver.close();
	}

}
