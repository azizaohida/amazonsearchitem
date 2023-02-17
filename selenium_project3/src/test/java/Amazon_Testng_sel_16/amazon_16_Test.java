package Amazon_Testng_sel_16;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import Amazon_POM_sel_16.Amazon_task_16_Pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class amazon_16_Test    extends  Utilities2   {
 
	
	@Test(dataProvider = "dp")
  public void f( String searchitems) throws InterruptedException {
	  Amazon_task_16_Pom   am = new Amazon_task_16_Pom(driver);
  am.searchfieldbutton(searchitems);
  }

    @DataProvider
  public Object[] dp() {
    	String  ud = System.getProperty("user.dir");
    	String xcelfilepath = ud+"\\TestData\\EvanTeacher_testdata.xlsx";
    	Xlsx_Reeader_EAL1  reader = new  Xlsx_Reeader_EAL1("xcelfilepath");
         Object[]   data = reader.getSheetData("amazonsearchitems");
          return  data;
        
    };
  }

