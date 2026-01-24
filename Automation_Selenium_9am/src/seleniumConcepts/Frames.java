package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		/*
		WebElement singleFrameTab = driver.findElement(By.id("singleframe"));
		
		//driver.switchTo().frame("singleframe");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(singleFrameTab);
		
		Thread.sleep(2000);
		WebElement singleFrameTextBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		singleFrameTextBox.sendKeys("Single Frame Text Box");
	*/
		WebElement ifraemeWithInFrameTab = driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
		ifraemeWithInFrameTab.click();
		Thread.sleep(2000);
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(outerFrame);
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
		//WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		//driver.switchTo().frame(innerFrame);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement innerFrameTextBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		innerFrameTextBox.sendKeys("Inner Frame Text Box");
		
	
	
	
	}

}
