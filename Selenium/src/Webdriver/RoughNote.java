package Webdriver;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class RoughNote{
	
    public static void main(String[] args) {
    
    	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SoundaryavalliRamach\\IBM\\Automation-Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		System.out.println(driver.getTitle());*/
         	
    	Scanner sc =new Scanner(System.in);
    	int size = sc.nextInt();
    	//sc.nextLine();
    	int [] marks = new int[size];  
    	int total = 0;
    	int i =0;
    	for(i=0;i<marks.length;i++)
    	{
    		//System.out.println(marks.length);
    		marks[i]= sc.nextInt();
    		total =total + marks[i];
    	}
    		System.out.println(total);
    	
    	}
		
		

}