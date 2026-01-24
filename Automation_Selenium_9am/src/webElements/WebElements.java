package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		/*
		WebElement MaleRadio=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		MaleRadio.click();
		Thread.sleep(2000);
				
		WebElement FemaleRadio=driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		FemaleRadio.click();
		Thread.sleep(2000);
		
		if(FemaleRadio.isDisplayed() && !FemaleRadio.isSelected()) //true
		{
			FemaleRadio.click();
			
		}
		else
		{
			System.out.println("Already Selected or Not Displayed");
		}
		*/
		/*
		WebElement CricketCheckbox=driver.findElement(By.id("checkbox1"));
		WebElement MoviesCheckbox=driver.findElement(By.id("checkbox2"));
		WebElement HockeyCheckbox=driver.findElement(By.id("checkbox3"));
		CricketCheckbox.click();
		Thread.sleep(2000);
		if(CricketCheckbox.isDisplayed()&& CricketCheckbox.isEnabled()&& !CricketCheckbox.isSelected())
		{
			CricketCheckbox.click();
			Thread.sleep(2000);
		}
		
		if(!MoviesCheckbox.isSelected())
		{
			MoviesCheckbox.click();
			Thread.sleep(2000);
		}
		if(!HockeyCheckbox.isSelected())
		{
			HockeyCheckbox.click();
			Thread.sleep(2000);
		}
		
		HockeyCheckbox.click();
		*/
		/*
		List<WebElement> CheckBox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));;
			
			for(int i=0;i<3;i++) //0<3 1<3 2<3 3<3 false
			{
				CheckBox.get(i).click();
				Thread.sleep(2000);
			}
			*/
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)"); //+ - + -
		WebElement SkillsDropdown=driver.findElement(By.id("Skills"));
		Select skills=new Select(SkillsDropdown);
		//skills.selectByIndex(4);
		//skills.selectByVisibleText("Certifications");
		skills.selectByValue("Analytics");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
	//Scroll WebPage 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)"); //+ - + -
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-300)"); //+ - + -
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(300,0)"); //+ - + -
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-300,0)"); //+ - + -
		*/
	}

}
