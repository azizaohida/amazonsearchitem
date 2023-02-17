package Practice_class_3_run_parealel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Peactice_xmlcalass_1.Amazon_Practice_class_1_pom;
import Peactice_xmlcalass_1.Ebay_Practice_class_1_pom;

public class Test2run {
	WebDriver driver;

	@Test
	public void amazon() {

		System.out.println("amazon run");

		System.setProperty("WebDriver.Chrome.driver",
				"C:\\My automation Task\\My workspace 1\\selenium_project3\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");

	}

	public void ebay() {

		System.out.println("ebay run");

		System.setProperty("WebDriver.Chrome.driver",
				"C:\\My automation Task\\My workspace 1\\selenium_project3\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");

	}

}
