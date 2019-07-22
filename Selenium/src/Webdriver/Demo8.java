package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
	driver.get("http://realestate.upskills.in/wp-admin/");
	String initialurl = driver.getCurrentUrl();
	System.out.println(initialurl);
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("adminuser@12345");
		driver.findElement(By.name("login")).click();
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		act.contextClick(link).build().perform();		
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(3000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 Thread.sleep(3000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(3000);
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 if (url.equals(initialurl))
				 
			 
				 {
			 System.out.println("It is equal");
			 
				 }
		 else
		 {
			 System.out.println("It is not equal");
		 }
		 
		 
				 
		 
		 
		
		

	}

}
