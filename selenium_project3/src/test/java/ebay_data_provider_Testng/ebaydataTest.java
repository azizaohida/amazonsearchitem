package ebay_data_provider_Testng;

import org.testng.annotations.Test;

import Peactice_xmlcalass_1_testng.Utilities_class_3;
import ebay_Data_provider_sel_15.ebay_data_provider_POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class ebaydataTest  extends  Utilities_class_3  {

	@Test(dataProvider = "ebaylogindata")
 
  public void f(String email) {
  
	  ebay_data_provider_POM  ebaypm = new  ebay_data_provider_POM(driver);
   ebaypm.signinbutton();
  ebaypm.emailfieldbutton(email);
  ebaypm.continuebuttonclick(); 
   
   
   driver.navigate().back();
    
    
    
	}
 @DataProvider(name = "ebaylogindata")
  public Object[][] ebaysignindata() {
    return new Object[][] {
      new Object[] { "ebc1@gmail.com"},
      new Object[] { "ebc2@gmail.com" },

      new Object[] { "ebc3@gmail.com"},
      new Object[] { "ebc4@gmail.com" },
      new Object[] { "ebc5@gmail.com"},

   };
  }
}
