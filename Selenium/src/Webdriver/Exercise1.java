package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sudarsan");
		driver.findElement(By.id("LastName")).sendKeys("Deva");
		driver.findElement(By.id("Email")).sendKeys("sudarsan.sds@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sudha@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sudha@123");
		driver.findElement(By.id("register-button")).click();
		
	driver.close();
		
		
	
	

	}
	

}
