package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomepage {
	DWSHomepage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//a[@class='ico-register']")
	WebElement register_link;
	@FindBy (xpath="//a[@class='ico-login']")
	WebElement login;
}

