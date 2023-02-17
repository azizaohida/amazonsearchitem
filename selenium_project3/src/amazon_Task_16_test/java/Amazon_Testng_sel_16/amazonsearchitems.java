package Amazon_Testng_sel_16;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import Amazon_POM_sel_16.Amazon_task_16_Pom;
import Peactice_xmlcalass_1.Amazon_Practice_class_1_pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class amazonsearchitems    extends    Utilities2  {
 
	WebDriver driver;
	@Test(dataProvider = "amazon")
  public void search( String searchitems) {
	  Amazon_task_16_Pom     ap = new   Amazon_Practice_class_1_pom(driver);
  
       ap.searchfieldbutton(searchitems);
  
  
  }

  @DataProvider(name ="amazon")
  public Object[] searchitemsall() {
    
	  String  ud = System.getProperty("user.dir");
	  
	xcelfilepath = ud+"\\TestData\\EvanTeacher_testdata.xlsx" ;
	Xlsx_Reeader_EAL1   reader  = new Xlsx_Reeader_EAL1(xcelfilepath);
	  Object[]  data = reader.getSheetData("amazonsearchitems");
   return data;
  
  };
  }
}
