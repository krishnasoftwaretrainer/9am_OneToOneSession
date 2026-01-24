package swaglogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Swag_ValidUserName_ValidPwd 
{

	public static void main(String args[]) throws InterruptedException
	{
		//HeadLess Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		//driver.findElement(By.className("submit-button btn_action")).click();
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL is: "+actualURL);
		if(expectedURL.equalsIgnoreCase(actualURL)) //true
			{
			System.out.println("Test Case is Passed");
		}
		else //false
		{
			System.out.println("Test Case is Failed");
		}
		Thread.sleep(2000);
		driver.close();
	
	}
}
