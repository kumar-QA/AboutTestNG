package TestNG.com;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationApply {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		System.out.println("@Beforemetod  annoation is called");
	}
	@Test(priority=2)
	public void getTitle() {
		System.out.println("test executed");
		String title= driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=1)
	public void googleLogTest() {
		System.out.println("test executed");
		boolean  imgexist=driver.findElement(By.xpath("//div[contains(@class,'k1zIA')]//img[@class='lnXdpd']")).isDisplayed();
		if(imgexist)System.out.println("image exist is :"+imgexist);
	}
	@AfterMethod
	public void breakDown() {
		System.out.println("AfterMethod annotaion is called");
		driver.quit();
	}
	
	
}
