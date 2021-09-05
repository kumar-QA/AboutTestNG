package TestNG.com;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AboutParametersFeature {
 WebDriver driver;
 @Test()
 @Parameters({"Browser","Url","EmailId","Password"})
 public void emailLogin(String Browser,String Url,String EmailId,String Password) {
	 if(Browser.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }else if(Browser.equals("firefox")) {
		 System.setProperty("webdriver.gecko.driver","C:\\BrowserDrivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
	 }

	 driver.get(Url);
	 driver.manage().window().maximize();// maxmize window
	 driver.manage().deleteAllCookies();// delete all cookies
	 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 
	 
	 driver.findElement(By.name("email")).clear();
//	 driver.findElement(By.name("email")).sendKeys("bensonneal59@gmail.com");	
	 driver.findElement(By.name("email")).sendKeys(EmailId);
	 driver.findElement(By.name("password")).clear();
//	 driver.findElement(By.name("password")).sendKeys("Kumar@59");
	 driver.findElement(By.name("password")).sendKeys(Password);

	 driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
	 
 }
}
