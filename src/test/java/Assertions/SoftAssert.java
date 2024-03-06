package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
@Test
public void dws() {
	String expectedHome ="https://demowebshop.tricentis.com";
	String expectedreg ="https://demowebshop.tricentis.com/register";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	org.testng.asserts.SoftAssert softassert = new org.testng.asserts.SoftAssert();
	String actualHome = driver.getCurrentUrl();
	softassert.assertEquals(expectedHome, actualHome);
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	String actualreg = driver.getCurrentUrl();
	softassert.assertEquals(expectedreg,actualreg);
	driver.close();
	softassert.assertAll();
	 
}
}
