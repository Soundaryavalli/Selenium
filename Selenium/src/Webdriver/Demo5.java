package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://newtours.demoaut.com");  
        WebElement link = driver.findElement(By.linkText("Cruises"));
        
        // This is for multiple actions
       // mouse or key board actions in driver. driver is my browser
          Actions MH = new Actions (driver);
       
        // this single action where it mouse over on particular element
        //build identifies the action, build will compile
          
          Action mouseover = MH.moveToElement(link).build();
        
        // will move the cursor to that element.
        //perform  will do that action
           mouseover.perform();
        
        // Both the codes will click enter from the keyboard and build is not required for sendkeys
         //  MH.sendKeys(link,(Keys.ENTER)).perform();
           MH.sendKeys(link,(Keys.RETURN)).perform();
        
    
         
      

	}

}
