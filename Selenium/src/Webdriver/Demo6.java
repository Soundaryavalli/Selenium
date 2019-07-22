package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
   	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	//driver.get("http://newtours.demoaut.com");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	Thread.sleep(3000);
	Actions MO =new Actions(driver);
	//by default in the webpage enter option is login button so no need for mouse element
	
	MO.sendKeys(Keys.ENTER).perform();
	/*MO.sendKeys(Keys.TAB).perform();
	MO.sendKeys(Keys.TAB).perform();
	MO.sendKeys(Keys.TAB).perform();
	MO.sendKeys(Keys.ENTER).perform();
	*/
	
	// can do it a single line to move to marketplace button by 3 tabs and enter key
	MO.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
	//MO.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
	
	
	
	

	}

}
