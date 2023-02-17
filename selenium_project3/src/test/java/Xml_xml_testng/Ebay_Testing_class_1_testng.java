package Xml_xml_testng;

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
import Peactice_xmlcalass_1_testng.Utilities_class_3;

public class Ebay_Testing_class_1_testng extends Utilities_class_3 {

	@Test
	public void ebay() {
		Ebay_Practice_class_1_pom ebm = new Ebay_Practice_class_1_pom(driver);

		ebm.sportinggoodsbutton();

		System.out.println("ebay run");

	}

}