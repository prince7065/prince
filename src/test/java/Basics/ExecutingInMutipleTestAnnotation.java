package Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecutingInMutipleTestAnnotation {
	@Test(priority = 0,enabled = false)
public void dws() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("dws",true);
	driver.close();
}
	@Test(priority = 1,invocationCount = 2,threadPoolSize = 3)
public void csk() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.chennaisuperkings.com/");
	Reporter.log("csk",true);
	driver.close();
}
	@Test(priority = 2)
public void rcb() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.royalchallengers.com/");
	Reporter.log("rcb",true);
	driver.close();
}
}
