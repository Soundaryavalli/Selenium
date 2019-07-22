package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(3000);
		
		//i want to store the element in a variable
		WebElement username = driver.findElement(By.name("userName"));
		
		if(username.isEnabled())
		{
		//sending the value to username
		username.sendKeys("sunil");
		//username.clear();
		//username.sendKeys("soundarya");
		}
		
		if (username.isDisplayed())
			
		{
		  //to find the element name,type,id by using get attribute with type, id,name of the edit field
			String name =username.getAttribute("type");
			
			//get attribute is to get the value of what ever we send the value to edit field
			String value = username.getAttribute("value");
			
			System.out.println(name);
			System.out.println(value);
			// getAttribute() is getting the value from edit field and if any element attribute is dynamic in nature
			
			System.out.println("Username is dispalyed :" + username.getAttribute("value"));
			
			// getText() is getting  inner text of the label,dropdown and links
			String text = driver.findElement(By.xpath("//font[contains(text(),'User')]")).getText();
		    System.out.println(text);
		}
		
		
		driver.findElement(By.name("password")).sendKeys("sunil");
        driver.findElement(By.name("login")).click();
        
        //work with radio button
        
       if( driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
       {
	
    	   driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
	   }
       
       // Working with drop down
       // i am storing drop down element in a variable
       WebElement dd = driver.findElement(By.xpath("//*[@name ='passCount']"));
      
       // Select is going to click on the drop down
       Select sel =new Select(dd);
       
       // get all the values from the drop down
       //getOptions() - is to retirve all the values from the  listbox 
       List<WebElement> options= sel.getOptions();
       
       //size is not selenium method. it is java method - intermediate question
       System.out.println(options.size());
       
       for (int i =0; i<options.size();i++)

       {
    	   System.out.println(options.get(i).getText());
       }
       // to select the value from the drop down
       sel.selectByIndex(3);
       
       // to get the first value which is selected
       WebElement first = sel.getFirstSelectedOption();
       System.out.println(first.getAttribute("Value"));
       
       Thread.sleep(3000);
       sel.selectByVisibleText("1");
       
       Thread.sleep(3000);
       sel.selectByValue("2");
       
       // to get the value which is selected
       String options1= driver.findElement(By.name("passCount")).getAttribute("value");
        System.out.println(options1);
       
        driver.findElement(By.xpath("//*[@value='Business']")).click();
        driver.findElement(By.name("findFlights")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("reserveFlights")).click();
        driver.findElement(By.name("passFirst0")).sendKeys("Soundarya");
        driver.findElement(By.name("passLast0")).sendKeys("Sudarsan");
       WebElement dropdown = driver.findElement(By.name("creditCard"));
    		   Select CreditCard =new Select(dropdown);
    		   List<WebElement> optioncard = CreditCard.getOptions();
    		   
    		   CreditCard.selectByIndex(2);
    		   driver.findElement(By.name("creditnumber")).sendKeys("1234 5678 1234 5678");
    		 
    		   
    		   // Working with Check box 
    		   
    		   List <WebElement> Checkbox = driver.findElements(By.name("ticketLess"));
    		   
    		  /* to select one checkbox
    		   for (int i=0;i<1;i++)
    		   {
    			   Checkbox.get(0);
    		   }*/
    			   
    		   // to select all the checkbox
    		     				 for(WebElement e : Checkbox)
    		     				   {
    		     					   e.click();
    		     				   }
    					   
    				   
       }
       }




