package Assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssert {
@Test
public void dws() {
	String expected="https://demowebshop.tricentis.com/";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actual = driver.getCurrentUrl();
	assertEquals(expected, actual);
	System.out.println("my script is successful.......");
	driver.close();
}
}
