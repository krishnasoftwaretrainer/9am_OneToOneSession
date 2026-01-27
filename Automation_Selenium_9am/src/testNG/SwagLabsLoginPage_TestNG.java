package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagLabsLoginPage_TestNG 
{
	//Global Objects
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert(); //Local Object
	
	@Test(priority=1,invocationCount=2)
	public void SwagLabsLogin_ValidValid() throws InterruptedException
	{
		 driver = new ChromeDriver();  //Local Object
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//Smoke Testing 
		String ExceptedURL = "https://www.saucedemo.com/";
		String ActualURL1 = driver.getCurrentUrl();
		//Hard Assertion
		//Assert.assertEquals(ActualURL1, ExceptedURL, "SwagLabs URL Mismatch");
		//Soft Assertion
		//SoftAssert softAssert = new SoftAssert(); //Local Object
		softAssert.assertEquals(ActualURL1, ExceptedURL, "SwagLabs URL Mismatch");
			
		//Functional Testing
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		String ActualURL = driver.getCurrentUrl();
		//Hard Assertion
		//Assert.assertTrue(ActualURL.contains("inventory.html"), "SwagLabs Login Valid-Valid Test Failed");
		softAssert.assertTrue(ActualURL.contains("inventory.html"), "SwagLabs Login Valid-Valid Test Failed");
				
		softAssert.assertAll();
		
		//if(ActualURL.contains("inventory.html")) //true false 
		
		//Assertions in TestNG
		
		/*	
		//if(driver.getCurrentUrl().contains("inventory.html"))
		{
			WebElement logoutMenu = driver.findElement(By.id("react-burger-menu-btn"));
			logoutMenu.click();
			Thread.sleep(2000); // Adding a wait to ensure the menu is fully loaded
			WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
			logoutLink.click();
			Thread.sleep(2000); // Adding a wait to ensure the logout is processed
			driver.close();
		}
		else
		{
			System.out.println("SwagLabs Login Valid-Valid Test Failed");
		}
			*/
	}
	
	@Test(priority=2,invocationCount=2)
	public void SwagLabsLogin_InvalidInvalid()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		String ExceptedURL = "https://www.saucedemo.com/";
		String ActualURL = driver.getCurrentUrl();
		
		softAssert.assertEquals(ActualURL, ExceptedURL, "SwagLabs URL Mismatch");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("fjsjfjj");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sjfjsj");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActualErrorMessage = errorMessage.getText();
		String ExpectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		softAssert.assertTrue(ActualErrorMessage.contains(ExpectedErrorMessage), "SwagLabs Login Invalid-Invalid Test Failed");
		softAssert.assertAll();
		
	}
	
	
}
