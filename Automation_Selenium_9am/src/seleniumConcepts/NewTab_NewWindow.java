package seleniumConcepts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		//String Window1=driver.getWindowHandle();
		//System.out.println("Window 1 ID: "+Window1);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		//String Window2=driver.getWindowHandle();
		//System.out.println("Window 2 ID: "+Window2);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(2000);
		//String Window3=driver.getWindowHandle();
		//System.out.println("Window 3 ID: "+Window3);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(2000);
		//String Window4=driver.getWindowHandle();
		//System.out.println("Window 4 ID: "+Window4);
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println("All Window IDs: ");
		
		for(int i=0;i<allwindows.size();i++) {
			System.out.println(allwindows);
		}
		
		//driver.close();
		driver.quit();
	}

}
