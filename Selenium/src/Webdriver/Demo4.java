package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Navigation methods- intermediate question
        // 1st navigation method to navigate to url
        driver.navigate().to("http://newtours.demoaut.com");  
        driver.findElement(By.linkText("Cruises")).click();
        
        // 2nd navigation method is back and forward the page
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        
        // 3rd navigation method is refresh
        
        driver.navigate().refresh();
         driver.close();
    
        //
	}

}
