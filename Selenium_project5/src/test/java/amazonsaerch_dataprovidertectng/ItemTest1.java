package amazonsaerch_dataprovidertectng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import amazonsearch_pom.Amazon_searh_items1;

public class ItemTest1    extends  Utilities2 {
 
	@Test(dataProvider = "dp")
  public void f( String  searchitem) throws InterruptedException {
		Amazon_searh_items1  amt1 =  new Amazon_searh_items1(driver);
      amt1.searchfieldbutton(searchitem);
  
 }

  @DataProvider
  public Object[] dp() {
	  String  ud =  System.getProperty("user.dir");
	   String excelfilepath = ud+"\\TestData_amazon\\EvanTeacher_testdata.xlsx";
 Xlsx_Reeader_EAL1  reader  =  new  Xlsx_Reeader_EAL1(excelfilepath);
      Object[] data = reader.getSheetData("amazonitem");
	    return data;
    };
  }

