package face_book_data_provider_selenoium_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class face_book_data_provider_POM {
WebDriver driver;	
	
	
@FindBy(name = "email") WebElement emailfield;
@FindBy(name = "pass") WebElement passwordfield;
@FindBy(name = "login")WebElement login;



public  void   emailfieldbox(String email) throws InterruptedException {
	emailfield.click();
	emailfield.clear();
	emailfield.sendKeys(email);
	Thread.sleep(1000);
}
public   void    passwordfieldbox(String password) throws InterruptedException {
	
passwordfield.click();
passwordfield.sendKeys(password);
Thread.sleep(1000);
}


public   void   loginbutton() throws InterruptedException {
	
	login.click();
	Thread.sleep(1000);
	
	}
public   face_book_data_provider_POM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}



}
