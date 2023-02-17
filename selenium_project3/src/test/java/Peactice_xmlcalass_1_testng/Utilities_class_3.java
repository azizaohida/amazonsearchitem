package Peactice_xmlcalass_1_testng;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Utilities_class_3 {

	public WebDriver driver;

	@Parameters({ "Browser", "urlAddress" })
	@BeforeClass
	public void Ibrowser(String nameofbrowser, String url) throws InterruptedException {
		if (nameofbrowser.equalsIgnoreCase("edge")) {
			System.setProperty("WebDriver.Edge.driver",
					"C:\\My automation Task\\My workspace 1\\selenium_project3\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();

			driver.get(url);

			driver.manage().window().maximize();
		}

		else if (nameofbrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.Chrome.driver",
					"C:\\My automation Task\\My workspace 1\\selenium_project3\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get(url);
		}
	}

	@AfterClass
	public void afterClass() throws IOException {
	}
@AfterMethod
public   void  aftermethod() throws IOException {
	
	aftermethodclass_Screenshots();
}
	
	
	
	
	public void RandommthodScreenshots() throws IOException {
		Date objects = new Date();
		System.out.println(objects);
		String Date = objects.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Date);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshotFile, new File(
				"C:\\My automation Task\\My workspace 1\\selenium_project3\\screenshots\\RandommthodScreenshots\\" + Date + "Myss.jpg"));

	}

	public void   aftermethodclass_Screenshots() throws IOException {
		Date objects = new Date();
		System.out.println(objects);
		String Date = objects.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Date);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshotFile, new File(
				"C:\\My automation Task\\My workspace 1\\selenium_project3\\screenshots\\aftermethodclass_Screenshots\\" + Date + "Myss.jpg"));

	}	
	
	
	public void       afterclass_Screenshots() throws IOException {
		Date objects = new Date();
		System.out.println(objects);
		String Date = objects.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Date);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshotFile, new File(
				"C:\\My automation Task\\My workspace 1\\selenium_project3\\screenshots\\afterclass_Screenshots\\" + Date + "Myss.jpg"));

	}		
	
	
	
	
	
}


