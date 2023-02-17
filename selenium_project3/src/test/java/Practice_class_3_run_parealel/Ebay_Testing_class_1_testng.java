package Practice_class_3_run_parealel;

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
import org.testng.annotations.Test;

import Peactice_xmlcalass_1.Ebay_Practice_class_1_pom;

public class Ebay_Testing_class_1_testng {
	WebDriver driver;

	@Test
	public void ebay() {
		Ebay_Practice_class_1_pom ebm = new Ebay_Practice_class_1_pom(driver);

		ebm.sportinggoodsbutton();

	}

	@BeforeClass
	public void beforeclass() throws InterruptedException {

		Ibrowser("chrome", "https://www.ebay.com");
	}

	@AfterClass
	public void afterclass() throws IOException {

		Screeshots();

	}

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