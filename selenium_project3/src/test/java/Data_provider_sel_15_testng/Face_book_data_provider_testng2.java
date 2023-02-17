package Data_provider_sel_15_testng;

import org.testng.annotations.Test;

import Peactice_xmlcalass_1_testng.Utilities_class_3;
import face_book_data_provider_selenoium_15.face_book_data_provider_POM;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Face_book_data_provider_testng2  extends Utilities_class_3{
	
	@Test(dataProvider = "fblogindata")
  public void facebooklogin(String  email, String password) throws InterruptedException, IOException {
		face_book_data_provider_POM   fbp = new  face_book_data_provider_POM(driver);
		fbp.emailfieldbox(email);
         fbp.passwordfieldbox(password);
 RandommthodScreenshots();
      fbp.loginbutton();
      driver.navigate().back();
 }

  @DataProvider(name = "fblogindata")
  public Object[][] facebooklogindata() {
    return new Object[][] {
      new Object[] { "abc1@gmail.com", "abc123" },
      new Object[] { "abc2@gmail.com", "abc234" },
      new Object[] { "abc3@gmail.com", "abc345" },
      new Object[] { "abc4@gmail.com", "abc456" },
    
    };
  }
}
