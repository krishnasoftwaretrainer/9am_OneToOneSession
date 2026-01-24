package actionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Actions {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement TextArea1=driver.findElement(By.id("ta1"));
		WebElement TextArea2=driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
				
		//TextArea1.sendKeys("Welcome to Selenium Automation");
		//TextArea1.sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		//TextArea1.sendKeys("abcdefghijklmnopqrstuvwxyz");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
			
		actions.keyDown(Keys.SHIFT).sendKeys(TextArea1, "abcdefghijklmnopqrstuvwxyz").keyUp(Keys.SHIFT).build().perform();	
		actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("C").build().perform();
		actions.sendKeys(Keys.TAB).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		//actions.keyDown(TextArea2, Keys.CONTROL).sendKeys("A").build().perform();
		actions.sendKeys(Keys.DELETE).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
				
	}

}
