package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excerise2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		// i am storing dd values in a variable
		WebElement dd = driver.findElement(By.name("category_id"));
		// i am clicking the drop down
		Select sel = new Select(dd);
	
		// to select the value from drop down
		//sel.selectByValue("Databases");
		sel.selectByIndex(2);
		driver.findElement(By.name("DoSearch")).click();
		
		
		
		
	}

}
