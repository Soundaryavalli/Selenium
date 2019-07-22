package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
		driver.get("http://retail.upskills.in/admin/");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	
	Actions mouse =  new Actions(driver);
	mouse.sendKeys(Keys.ENTER).perform();
	
	WebElement click = driver.findElement(By.id("menu-catalog"));
	
	//Action mo = mouse.moveToElement(click).build(); 
		//mo.perform();
	
	mouse.moveToElement(click).build().perform();
	
	driver.close();
	}

}
