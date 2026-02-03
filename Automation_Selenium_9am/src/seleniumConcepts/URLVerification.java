package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLVerification {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		//driver.get("https://www.amazon.com/");
		
		String exceptedURL = "Https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		
		System.out.println("Excepted URL is: " + exceptedURL);
		System.out.println("Actual URL is: " + actualURL);
		
		//if(exceptedURL.equalsIgnoreCase(actualURL))
		if(exceptedURL.equals(actualURL))
		{
			System.out.println("Test case is passed");
		
	}
		else 
		{
			System.out.println("Test case is failed");
		}
		
		driver.quit();
	}

}
