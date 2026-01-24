package actionClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {

	public static void main(String[] args) throws InterruptedException {
		//ClassName obj = new ConstructorName();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/buttons");
		//driver.get("https://demoqa.com/dragabble");
		driver.get("https://demoqa.com/droppable");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		//Specfic Element
		
		Actions actions = new Actions(driver);
		
		//WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		//js.executeScript("arguments[0].scrollIntoView(true);",doubleClickBtn);
		
		//.doubleClick(doubleClickBtn).perform();
		
		//WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
		//actions.moveToElement(rightClickBtn).build().perform();
		//js.executeScript("arguments[0].scrollIntoView(true);",rightClickBtn);		
		//actions.contextClick(rightClickBtn).perform();
		
		//WebElement ClickAndHoldBtn = driver.findElement(By.id("dragBox"));
		//actions.clickAndHold(ClickAndHoldBtn).build().perform();
		//Thread.sleep(2000);
		//actions.moveByOffset(100, -100).build().perform();
	
	WebElement DragMeBtn = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	actions.dragAndDrop(DragMeBtn, target).perform();
	
	}

}
