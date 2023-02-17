package Practice_class_3_run_parealel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	
	
	@Test
	  public void google() {
	 
		  System.out.println("google run");

		  System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\selenium_project3\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
			
		} 

}

@Test
  public void facebook() {
 
	  System.out.println("facebook run");

	  System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\selenium_project3\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
		
	} 