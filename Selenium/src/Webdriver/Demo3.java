package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
				Thread.sleep(3000);
		
		
			// find the element and pass the value
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("no of links" +links.size());
			for (WebElement e:links)
			{
				String alllinks = e.getText();
				System.out.println(alllinks);
				
			}
			

	}

}
