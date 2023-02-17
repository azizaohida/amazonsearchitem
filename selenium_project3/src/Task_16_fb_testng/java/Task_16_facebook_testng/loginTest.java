package Task_16_facebook_testng;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import face_book_6POM.Task_16_fbpom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class loginTest extends  Utilities2{
 
	@Test(dataProvider = "fblogin")
 
	public void f(String email, String password) {
  
		Task_16_fbpom   ob = new Task_16_fbpom(driver);
  ob.emailfieldclick(email);
  ob.passwardfieldclick(password);
  ob.loginfieldclick();
  driver.navigate().back();
 }

  @DataProvider(name = "fblogin")
  public Object[][] login() {
   String ud = System.getProperty("user.dir");
	  
	  xcelfilepath = ud+"\\TestData\\EvanTeacher_testdata.xlsx";
	  Xlsx_Reeader_EAL1 reader =  new Xlsx_Reeader_EAL1("xcelfilepath");  
	  Object[][] data = reader.getSheetData("fb");
	  
	  };
  }
}
