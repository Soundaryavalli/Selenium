package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Excerise3Q8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		Actions act = new Actions(driver);
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		act.moveToElement(click).build().perform();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Accessories')]")).click();
		WebElement dd = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(dd);
		sel.selectByIndex(1);
		
		WebElement dd1 = driver.findElement(By.id("products-pagesize"));
		Select sel1 = new Select(dd1);
		List<WebElement> list = sel1.getOptions();
		for(int i =0; i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		sel1.selectByIndex(0);
		WebElement dd2 = driver.findElement(By.id("products-viewmode"));
		Select sel2 = new Select(dd2);
		sel2.selectByIndex(1);
		
		driver.quit();

	}

}
