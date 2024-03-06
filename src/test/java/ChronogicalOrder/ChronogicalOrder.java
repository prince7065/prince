package ChronogicalOrder;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronogicalOrder {
	WebDriver driver = new ChromeDriver();
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void beforeClass() {
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("prince098@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("p1rince2@");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println("beforemethod");
	}
	@Test
	public void AddToCart() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> item = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement a:item) {
			a.click();
			Thread.sleep(1000);
		}
		driver.findElement(By.linkText("Shopping cart")).click();
		WebElement item1 = driver.findElement(By.linkText("3rd Album"));
		if(item1.isDisplayed()) {
			System.out.println("present");
		}
		else
			System.out.println("ab");
		WebElement item2 = driver.findElement(By.linkText("Music 2"));
		if(item2.isDisplayed()) {
			System.out.println("present");
		}
		else
			System.out.println("ab");
		WebElement item3 = driver.findElement(By.linkText("Music 2"));
		if(item3.isDisplayed()) {
			System.out.println("present");
		}
		else
			System.out.println("ab");
	}
	@AfterMethod
	public void aftermethod() {
		WebElement logout = driver.findElement(By.linkText("Log out"));
		if(logout.isDisplayed()) {
			System.out.println("present");
			logout.click();
		}
		else
			System.out.println("ab");
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("afterclass");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
}
