package com.train.org.selenium_project3;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Utilities_practice_class_1 {
	public WebDriver driver;

	@Parameters({ "browser", "urlAddress" })
	@BeforeClass
	public void Ibrowser(String nameofbrowser, String url) throws InterruptedException {
		if (nameofbrowser.equalsIgnoreCase("Edge")) {
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

	public void Screeshots() throws IOException {
		Date objects = new Date();
		System.out.println(objects);
		String Date = objects.toString().replace(" ", "_").replace(":", "_");
		System.out.println(Date);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshotFile, new File(
				"C:\\My automation Task\\My workspace 1\\selenium_project3\\screenshots\\" + Date + "Myss.jpg"));

	}

}
