package webElements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Navigations {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		// Screen Shot-1
		File sc1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc1, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ FlipKart.png"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		// Screen Shot-1
		File sc2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc2, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ Amazon.png"));
				
		driver.navigate().refresh();
		Thread.sleep(2000);
		// Screen Shot-1
		File sc3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc3, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ AmazonProducts.png"));
				
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Test Completed Successfully");
		
	}

}
