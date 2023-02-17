package Amazon_POM_sel_16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_task_16_Pom {

   WebDriver driver;
@FindBy(id = "twotabsearchtextbox") WebElement  searchfield;

public     void     searchfieldbutton(String searchitems) throws InterruptedException {
	
	searchfield.click();

  searchfield.sendKeys(searchitems);
}

public    Amazon_task_16_Pom(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

}
