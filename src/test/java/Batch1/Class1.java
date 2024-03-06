package Batch1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.beust.jcommander.Parameters;

public class Class1 {
	@Test(groups = {"smoke"})
public void amazon() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://amazon.in/");
	Reporter.log("amazon",true);
	driver.close();
}
}
