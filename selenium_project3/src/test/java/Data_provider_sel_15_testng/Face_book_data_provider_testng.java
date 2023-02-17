package Data_provider_sel_15_testng;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import Amazon_Testng_sel_16.Utilities2;
import Peactice_xmlcalass_1_testng.Utilities_class_3;
import face_book_data_provider_selenoium_15.face_book_data_provider_POM;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Face_book_data_provider_testng  extends Utilities2 {
	
	@Test(dataProvider = "fblogindata")
  public void facebooklogin(String  email, String password) throws InterruptedException, IOException {
		face_book_data_provider_POM   fbp = new  face_book_data_provider_POM(driver);
		fbp.emailfieldbox(email);
         fbp.passwordfieldbox(password);
         fbp.loginbutton();
      driver.navigate().back();
 }

  @DataProvider(name = "fblogindata")
  public Object[][] facebooklogindata() {

      String  ud =  System.getProperty("user.dir");
	  
	  String xcelfilepath = ud+"\\TestData\\EvanTeacher_testdata.xlsx";
 Xlsx_Reeader_EAL1 reader  =  new  Xlsx_Reeader_EAL1(xcelfilepath);
       Object[][] data = reader.getSheetData("fb");
	    return data;
 
  
  };
  }

