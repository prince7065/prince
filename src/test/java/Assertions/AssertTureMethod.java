package Assertions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class AssertTureMethod {
@Test
public void java() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	WebElement link = driver.findElement(By.linkText("jdk-8u401-linux-x64.rpm"));
	SoftAssert sa = new SoftAssert();
	sa.assertTrue(link.isDisplayed());
	link.click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement downlink = driver.findElement(By.xpath("//a[@class='download-file icn-lock']"));
	sa.assertTrue(downlink.isEnabled());
	//downlink.click();
	js.executeScript("arguments[0].click()",downlink);
	driver.close();
}
}
