package Practice_class_3_run_parealel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3run {
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

	@Test
	public void test4() {
		System.out.println("this is test google");

		System.setProperty("WebDriver.Chrome.driver",
				"C:\\My automation Task\\My workspace 1\\selenium_project3\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

}
