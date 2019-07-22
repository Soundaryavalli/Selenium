package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excerise3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		
		// i am storing drop down values in a variable
		WebElement dd = driver.findElement(By.name("category_id"));
		// clicking the drop down the values
		Select sel =new Select(dd);
		// Storing the drop down values in list
		List<WebElement> options = sel.getOptions();
		// getting the no of values present in drop down
		System.out.println(options.size());
		// getting the values of drop down
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		sel.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Web Database Development')]")).click();
		WebElement value = driver.findElement(By.name("quantity"));
		System.out.println(value.getAttribute("value"));
		driver.findElement(By.name("Insert1")).click();
		if(driver.findElement(By.name("Delete1_1")).isSelected())
		{
			System.out.println("Delete Checkbox is on");
			
		}
		else
			System.out.println("Delete Checkbox is off");
	}

}
