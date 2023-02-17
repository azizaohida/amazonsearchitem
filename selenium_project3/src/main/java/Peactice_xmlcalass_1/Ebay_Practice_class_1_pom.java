package Peactice_xmlcalass_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Practice_class_1_pom {
WebDriver driver;
@FindBy(linkText = "Sporting Goods")WebElement sportinggoods;
@FindBy(linkText = "Golf Clubs") WebElement golfclubs;


public  void   sportinggoodsbutton() {
	
	sportinggoods.click();
	Actions act = new Actions(driver);
act.moveToElement(golfclubs).build().perform();
javascript_3.drawBroderblue(golfclubs, driver);
}

public  Ebay_Practice_class_1_pom(WebDriver driver) {
	
	this.driver = driver;
PageFactory.initElements(driver, this);


}




}
