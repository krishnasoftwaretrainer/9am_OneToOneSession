package testNGSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagLabs_ValidLogin {

	// Global Objects
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert(); // Local Object

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
			
		}	
}
