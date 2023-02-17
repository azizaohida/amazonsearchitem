package face_book_class_15;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class face_book_signin    {
WebDriver driver;
	
 @FindBy(name = "email")WebElement  emailfield;
@FindBy(name = "pass")  WebElement  passwordfield;
@FindBy(name = "login") WebElement  loginfield;

public  void   emailfieldclick(String email) throws InterruptedException {
	
	Thread.sleep(1000);
	emailfield.click();
	Thread.sleep(1000);
	emailfield.clear();
	emailfield.sendKeys(email);
	}
public   void   passwardfieldclick(String  password) throws InterruptedException {
	passwordfield.click();
    
	passwordfield.sendKeys(password);

}

public   void   loginfieldclick() {
	
	
	loginfield.click();
	}

public  face_book_signin(WebDriver driver) {
       this.driver = driver;
PageFactory.initElements(driver, this);
}



}