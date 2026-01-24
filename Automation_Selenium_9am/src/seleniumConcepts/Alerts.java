package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		/*
		WebElement Displayalert = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		Displayalert.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: "+alert.getText());
		alert.accept();
		*/
		/*
		WebElement AlertwithOKCancel = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
		AlertwithOKCancel.click();
		Thread.sleep(2000);
		WebElement Displayalert = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		Displayalert.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: "+alert.getText());
		//alert.dismiss();
		alert.accept();
		Thread.sleep(2000);
		WebElement AfterAlertText = driver.findElement(By.id("demo"));
		System.out.println("Text after alert: "+AfterAlertText.getText());
		*/
		
		WebElement AlertwithTextbox = driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
		AlertwithTextbox.click();
		Thread.sleep(2000);
		WebElement Displayalert = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		Displayalert.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: "+alert.getText());
		alert.sendKeys("Krishna");
		alert.accept();
		Thread.sleep(2000);
		WebElement AfterAlertText = driver.findElement(By.id("demo1"));
		System.out.println("Text after alert: "+AfterAlertText.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
