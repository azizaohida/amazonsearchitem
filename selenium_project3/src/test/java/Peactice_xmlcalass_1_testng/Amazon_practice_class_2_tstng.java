package Peactice_xmlcalass_1_testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.train.org.selenium_project3.Utilities_practice_class_1;

import Practice_Class_2.Amazon_practice_class_2;

public class Amazon_practice_class_2_tstng extends Utilities_class_3 {

	@Test(groups = { "sanity", "regression" })
	public void f() {

		Amazon_practice_class_2 apc = new Amazon_practice_class_2(driver);

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String frshomepg = "https://www.amazon.com/registries?ref_=nav_cs_registry";
		// Assert.assertEquals(url, expectedurl);
		System.out.println("this is  hard  assertatin");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(url, url, frshomepg);
		soft.assertAll();
		System.out.println("this is sanity, regreesion test1");

	}

	@Test(groups = { "smoke" })
	public void test2() {
		Amazon_practice_class_2 apc = new Amazon_practice_class_2(driver);
		apc.namebutton1();
		System.out.println("this is smoke test2");
	}

}
