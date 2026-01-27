package seleniumConcepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		//driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		//WebElement chooseFileButton = driver.findElement(By.id("input-4"));
		//chooseFileButton.sendKeys("C:\\Users\\HP\\Downloads\\sampleFile (1).jpeg");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		WebElement IamExperienced = driver.findElement(By.xpath("//div[@data-val=\"exp\"]"));
		IamExperienced.click();
		Thread.sleep(2000);
		//WebElement uploadResume = driver.findElement(By.id("resumeUpload"));
		
		WebElement uploadResume = driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", uploadResume);
		Thread.sleep(1000);
		uploadResume.click();
		Thread.sleep(2000);
		//uploadResume.sendKeys("D:\\Krishna N_QA_5years_Resume.docx");
		//Use AutoIT here 
		Runtime.getRuntime().exec("D:\\QT\\QT_Selenium_225,226,227\\Resume1.exe");
		
		
	}

}
