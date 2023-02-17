package Practice_Class_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class Amazon_practice_class_2 {
WebDriver driver;

	@FindBy(linkText = "Registry") WebElement registry;
	@FindBy(name = "name") WebElement  name;
public   void    resistrybuttonclick() {
	
	registry.click();

}
public   void     namebutton1() {
	
name.sendKeys("runu");	
}


public   Amazon_practice_class_2(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}

}
