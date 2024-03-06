package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDwsHomePage {
@Test
public void simple() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWSHomepage dws = new DWSHomepage(driver);
	dws.register_link.click();
	//DwsLogin dl= new DwsLogin(driver);
	dws.login.click();
}
}
