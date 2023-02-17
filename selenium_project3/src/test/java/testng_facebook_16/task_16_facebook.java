package testng_facebook_16;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import Task_16_utility_2.Utilities2;
import face_book_16POM.Task_16_fbpom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class task_16_facebook    extends  Utilities2 {
  
	@Test(dataProvider = "dp")
  public void facebooklogin(String email, String password) throws InterruptedException {
 
	  Task_16_fbpom  fb = new Task_16_fbpom(driver);
	  
	  fb.emailfieldclick(email);
 
	  fb.passwardfieldclick(password); 
	  fb.loginfieldclick();
	 
   driver.navigate().back();
   Thread.sleep(2000);
	}

 @DataProvider
public Object[][] facebooklogin1() {
    String  ud = System.getProperty("user.dir");
	String xcelfilepath = ud+"\\TestData\\EvanTeacher_testdata.xlsx";
	Xlsx_Reeader_EAL1  reader = new  Xlsx_Reeader_EAL1("xcelfilepath");
     Object[][]   data = reader.getSheetData("fb");
      return  data;
    
 
 
  }
}
   