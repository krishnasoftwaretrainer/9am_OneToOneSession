package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frames.html");
		//Default to Frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"D:\\SELENIUM\\Selenium Scripts\\Frames\\frame_a.html\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("001")).sendKeys("Admin");
		
		//Frame1 to Frame2
		//Frme1 to Default and Default to Frame2
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"D:\\SELENIUM\\Selenium Scripts\\Frames\\frame_b.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("002")).sendKeys("System");
		
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"D:\\SELENIUM\\Selenium Scripts\\Frames\\frame_c.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.id("003")).sendKeys("Testing");
	}

}
