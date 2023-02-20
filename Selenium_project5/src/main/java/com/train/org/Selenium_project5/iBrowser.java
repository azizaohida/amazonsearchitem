package com.train.org.Selenium_project5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iBrowser {

	static WebDriver driver;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome. driver", "C:\\My automation Task\\My workspace 1\\Selenium_project5\\Driver\\chromedriver.exe");

		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	Thread.sleep(4000);
	
	driver.get("https://www.ebay.com/");
	
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	
	
	
	}

}
