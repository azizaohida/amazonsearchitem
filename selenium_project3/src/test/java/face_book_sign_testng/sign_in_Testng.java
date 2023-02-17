package face_book_sign_testng;

import org.testng.annotations.Test;

import Peactice_xmlcalass_1_testng.Utilities_class_3;
import face_book_class_15.face_book_signin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class sign_in_Testng    extends    Utilities_class_3 {

@Test(dataProvider = "dp")
  public void f(String email, String password) throws InterruptedException {
  
	  face_book_signin  fbs = new  face_book_signin(driver);
      Thread.sleep(3000);
	   fbs.emailfieldclick(email);
      Thread.sleep(4000);
	   fbs.passwardfieldclick(password);
	  fbs.loginfieldclick();
	System.out.println("print is done");
}

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "acver@gmail.com", "zibran2000" },
      
    };
  }
}
