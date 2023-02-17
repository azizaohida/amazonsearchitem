package ebay_Data_provider_sel_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebay_data_provider_POM {

WebDriver driver;

@FindBy(linkText = "Sign in") WebElement signin;

@FindBy(id = "userid")WebElement  emailfield;

@FindBy(id ="signin-continue-btn") WebElement continuebutton;


public  void signinbutton() {
	
	signin.click();
	
}

public  void   emailfieldbutton(String email) {
	emailfield.click();
	emailfield.clear();
	
    emailfield.sendKeys(email);

}

public   void   continuebuttonclick() {
	
	continuebutton.click();
	
}



public    ebay_data_provider_POM(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this );
	
}


}
