package seleniumConcepts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelection_Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//for(int i=1;i<=3;i++)
		while(true)
		{
			System.out.println("Enter the browser name");
			String browser = scanner.next();
			
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriver cdriver = new ChromeDriver();
			cdriver.manage().window().maximize();
			cdriver.get("https://www.amazon.com/");
			cdriver.quit();
			break;

		case "firefox":
			WebDriver fdriver=new FirefoxDriver();
			fdriver.manage().window().maximize();
			fdriver.get("https://www.facebook.com/");		
			fdriver.quit();
			break;

		case "edge":
				WebDriver edriver=new EdgeDriver();
				edriver.manage().window().maximize();
				edriver.get("https://www.twitter.com/");	
				edriver.quit();
				break;
		default:
			System.out.println("Invalid Browser Name");
			System.out.println("Please select a browser: Chrome, Firefox, Edge");
			break;

		}
		
		}
		
	}

}
