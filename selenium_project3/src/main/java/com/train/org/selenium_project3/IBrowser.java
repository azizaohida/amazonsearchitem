package com.train.org.selenium_project3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowser {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
     System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\selenium_project3\\Driver\\chromedriver.exe");


	  driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.get("https://www.walmart.com/");
	
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	
	// Sessionid
	String sessionid = driver.getWindowHandle();
	System.out.println(sessionid);
	//Current Url
	    String Url = driver.getCurrentUrl();
	System.out.println(Url);
	
	     String  pageTittle = driver.getTitle();
	System.out.println(pageTittle);
	//Veryfy the homepage title
	      String  HomepageTitle = driver.getTitle();
	
	if (HomepageTitle.equals("walmart")) {
		
		System.out.println("Title is correct - walmart");
	}
	      
	else {
		
		System.out.println("Title is incorrect - not correct");
	}
		
		
		
		
		
		
		
	      //close
	//driver.close();
	
	
	
	
	
	
	
	}

}
