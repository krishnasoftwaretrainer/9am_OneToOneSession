package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		//CRUD Operations:Create(Insert), Read(Select), Update, Delete
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		for (int i = 1; i <= 3; i++) {
			
		WebElement addBtn = driver.findElement(By.id("addNewRecordButton"));
		addBtn.click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement age = driver.findElement(By.id("age"));
		WebElement salary = driver.findElement(By.id("salary"));
		WebElement department = driver.findElement(By.id("department"));
		WebElement submitBtn = driver.findElement(By.id("submit"));
		
			//addBtn.click();
			Thread.sleep(1000);
			firstName.sendKeys("John");
			lastName.sendKeys("Doe");
			userEmail.sendKeys("John@gmail.com");
			age.sendKeys(String.valueOf(25));
			salary.sendKeys(String.valueOf(40000));
			department.sendKeys("Engineering");
			submitBtn.click();
			Thread.sleep(1000);
			}
		
		
		/*
		firstName.sendKeys("John");
		lastName.sendKeys("Doe");
		userEmail.sendKeys("John@gmail.com");
		age.sendKeys("30");
		salary.sendKeys("50000");
		department.sendKeys("Engineering");
		WebElement submitBtn = driver.findElement(By.id("submit"));
		submitBtn.click();
		Thread.sleep(2000);
		
		WebElement SearchBox = driver.findElement(By.id("searchBox"));
		SearchBox.sendKeys("John");
		Thread.sleep(2000);
		
		WebElement UpdateBtn = driver.findElement(By.id("edit-record-4"));
		UpdateBtn.click();
		
		WebElement lastNameUpdate = driver.findElement(By.id("lastName"));
		lastNameUpdate.clear();
		Thread.sleep(2000);
		lastNameUpdate.sendKeys("Smith");
		
		WebElement submitUpdateBtn = driver.findElement(By.id("submit"));
		submitUpdateBtn.click();
		Thread.sleep(2000);
		
		WebElement DeleteBtn = driver.findElement(By.id("delete-record-4"));
		DeleteBtn.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		*/
		
	}

}
