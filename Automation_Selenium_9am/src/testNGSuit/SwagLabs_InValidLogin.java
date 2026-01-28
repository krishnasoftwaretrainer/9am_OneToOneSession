package testNGSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagLabs_InValidLogin {
	
	@Test
	public void SwagLabsLogin_InvalidInvalid() {
		WebDriver driver;
		SoftAssert softAssert = new SoftAssert(); // Local Object

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
		softAssert.assertTrue(ActualErrorMessage.contains(ExpectedErrorMessage),
				"SwagLabs Login Invalid-Invalid Test Failed");
		softAssert.assertAll();

	}

}
