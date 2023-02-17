package Amazon_Testng_sel_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Amazon_POM_sel_16.homepage_16;

public class testng_amazon_Test    extends  Utilities2 {
 
	
  @Test
  public void amazon() {
  
		homepage_16  ob = new homepage_16(driver);
  ob.bestsellerbuttton();
  ob.newreleasebutton();
  
  
  }


	
}