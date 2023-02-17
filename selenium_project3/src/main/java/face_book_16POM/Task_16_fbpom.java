package face_book_16POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Peactice_xmlcalass_1.javascript_3;

public class Task_16_fbpom {

	public WebDriver driver;
	
 @FindBy(name = "email")WebElement  emailfield;
@FindBy(name = "pass")  WebElement  passwordfield;
@FindBy(name = "login") WebElement  loginfield;

public  void   emailfieldclick(String email) throws InterruptedException {
	Thread.sleep(2000);
javascript_3.Jsclick(driver, emailfield);
Thread.sleep(2000);
	emailfield.clear();
	Thread.sleep(2000);
	
	emailfield.sendKeys(email);
	Thread.sleep(1000);

}
public   void   passwardfieldclick(String  password) throws InterruptedException {
	
	
	passwordfield.click();
	Thread.sleep(2000);
	passwordfield.sendKeys(password);
	Thread.sleep(2000);
}

public   void   loginfieldclick() {
	
	loginfield.click();
	
}

public  Task_16_fbpom(WebDriver driver) {
       this.driver = driver;
PageFactory.initElements(driver, this);
}







}
