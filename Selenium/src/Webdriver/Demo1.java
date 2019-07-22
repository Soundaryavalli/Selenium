package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// To launch the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
    //API - which contains all the browser implementation
		WebDriver driver = new ChromeDriver();
		
		// API to maximize the browser
		driver.manage().window().maximize();
		
		// API to get the url
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//Alternate API to open up the url/browser(Navigation Method)
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
     
		//wait but should not use in the realtime
		Thread.sleep(3000);
		
		// refresh the web page (Navigation Method)
			driver.navigate().refresh();
			
			// find the element and pass the value
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			//driver.findElement(By.xpath("//b[contains(text(),'Time')]")).click();
			
			// to get the title of the page
			
			String ActualTitle = driver.getTitle();
			System.out.println(ActualTitle);
					
			String ExpectedTitle = "OrangeHRM" ;
			
			if(ExpectedTitle.equals(ActualTitle))
			{
				Thread.sleep(3000);
  		    	driver.findElement(By.id("welcome")).click();
  			    Thread .sleep(3000);
			//driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	            driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			    driver.close();
			}
			else
			{
				System.out.println("This is not same");
				// to close the one browser which is opened through instance
				driver.close();
				//closing the mutiple browser which is opened through webdriver instance
			driver.quit();
			}
	}
	

}
