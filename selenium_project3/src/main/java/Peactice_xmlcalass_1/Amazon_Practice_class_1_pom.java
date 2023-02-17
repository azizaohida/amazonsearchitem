package Peactice_xmlcalass_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Practice_class_1_pom {
WebDriver driver;

@FindBy(linkText = "Registry") WebElement registry;
@FindBy(name = "name") WebElement  name;
@FindBy(id = "a-autoid-0-announce")WebElement selectaregistry;
@FindBy(linkText = "Gift List")WebElement giftlist;
@FindBy(xpath = "//button[@aria-label = 'Search']")WebElement   search;;




public   void    registrybutton() {
	
	registry.click();
}

public   void     namebutton() {
	
name.sendKeys("aziza shireen");	
	
}
public  void     selectregistrybutton() {
selectaregistry.click();
	Actions   act = new Actions(driver);
act.moveToElement(giftlist).build().perform();
giftlist.click();

}

public  void      searchbutton() {
	
search.click();
}



public   Amazon_Practice_class_1_pom(WebDriver driver) {
this.driver = driver;
   PageFactory.initElements(driver, this);

}




}
