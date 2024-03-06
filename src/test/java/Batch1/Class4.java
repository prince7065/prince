package Batch1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Class4 {
	@Parameters("url")
		@Test
	public void myntra(String aUrl) {
		WebDriver driver = new ChromeDriver();
		driver.manage ().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("url");
		Reporter.log("myntra",true);
		driver.close();
	}
}
