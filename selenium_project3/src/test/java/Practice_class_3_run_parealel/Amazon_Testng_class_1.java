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

import Peactice_xmlcalass_1.Amazon_Practice_class_1_pom;
import Practice_Class_2.Amazon_practice_class_2;

public class Amazon_Testng_class_1 {
	WebDriver driver;

	@Test
	public void amazon() {
		Amazon_practice_class_2 apc = new Amazon_practice_class_2(driver);
		apc.resistrybuttonclick();

		System.out.println("amazon run");

	}

}
