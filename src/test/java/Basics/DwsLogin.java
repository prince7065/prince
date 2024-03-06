package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwsLogin {
	@Test(dataProvider = "login")
	public void login(String email,String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.close();
	}
	@org.testng.annotations.DataProvider(name = "login")
	public Object[][] sender(){
		Object[][] obj= new Object[2][2];
		obj[0][0]="prince098@gmail.com";
		obj[0][1]="p1rince2@";
		obj[1][0]="prince123@gmail.com";
		obj[1][1]="p1rince2@";
		return obj;
	}
}
