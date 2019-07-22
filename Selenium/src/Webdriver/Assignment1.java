package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com");
		 Thread.sleep(3000);
		// Storing the links in list
			//		 List <WebElement> text =driver.findElements(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		 List <WebElement> text =driver.findElements(By.tagName("a"));	
		 // Getting the array size and storing in txt variable 
			String[] txt = new String[text.size()];
				
			
			// Getting Text for each link			
					int i =0;
				for (WebElement e : text)
		       {					
						 
						 txt[i] = e.getText();
															 
				     i++;
		       }
			String Title = "Under Construction: Mercury Tours";
			// Printing the Text of each link which is working and under construction
			for (String s : txt)
				{
					driver.findElement(By.linkText(s)).click();
											
				if (driver.getTitle().equals(Title))
				{
					System.out.println( s + " is under Construction");
				}
				else 
				{
					System.out.println( s +" is working");
				}
		      				
		       }
			
			 driver.navigate().back();
			//to close the active browser  /current browser and all of its tabs
			//common between these two
			// there i no return type between driver. close and driver.quit
			// it will not accept any arguments
			
			driver.close();
			// close all the active browser which is opened with selenium instance
			//driver.quit();
	} 
	}
		


