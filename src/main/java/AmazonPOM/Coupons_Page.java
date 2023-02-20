package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons_Page {
WebDriver driver;

@FindBy(linkText = "Most Popular") WebElement mostPopular;

public void mostpopularClick() {
mostPopular.click();
}


public Coupons_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
