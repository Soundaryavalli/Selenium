package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excerise5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("Soundarya");
		driver.findElement(By.name("user_password")).sendKeys("sound");
		driver.findElement(By.name("first_name")).sendKeys("Soundarya");
		driver.findElement(By.name("last_name")).sendKeys("Rams");
		driver.findElement(By.name("email")).sendKeys("sounrama@in.ibm.com");
		WebElement dd = driver.findElement(By.name("state_id"));
		 Select Sel = new Select(dd);
		 Sel.selectByIndex(3);
		 WebElement dd1 = driver.findElement(By.name("country_id"));
		 Select country = new Select(dd1);
		// country.selectByIndex(3);
		 country.selectByVisibleText("Algeria");
		 WebElement dd2 = driver.findElement(By.name("gender_id"));
		 Select gender = new Select(dd2);
		 List <WebElement> options =gender.getOptions();
		 /*for(int i =0;i<options.size();i++)
		 {
			 System.out.println(options.get(i).getText());
		 }*/
		//System.out.println(options.get(0)); 
		gender.selectByVisibleText("Female");
		//gender.selectByValue("Female");
		// gender.selectByIndex(1);
		
		 
		 driver.findElement(By.name("Insert")).click();
		 
		

	}

}
