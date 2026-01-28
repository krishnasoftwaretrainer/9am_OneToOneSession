package PropertiesTestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLogin_Prop {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream propFile= new FileInputStream("./src/PropertiesTestData/SwagData.properties");
		
		Properties prop = new Properties();
		
		prop.load(propFile);
		
		driver.get(prop.getProperty("build1Url"));
		
		//WebElement username = driver.findElement(By.id("user-name"));
		//WebElement password = driver.findElement(By.id("password"));
		//WebElement loginBtn = driver.findElement(By.name("login-button"));
		
		WebElement username = driver.findElement(By.id(prop.getProperty("SwagUserNameID")));
		WebElement password = driver.findElement(By.id(prop.getProperty("SwagPasswordID")));
		WebElement loginBtn = driver.findElement(By.name(prop.getProperty("SwagLoginButtonID")));
		
		
		username.sendKeys(prop.getProperty("SwagUsername"));
		password.sendKeys(prop.getProperty("SwagPassword"));
		loginBtn.click();
		
		
	}

}
