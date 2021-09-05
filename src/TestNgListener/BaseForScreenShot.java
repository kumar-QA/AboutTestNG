package TestNgListener;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseForScreenShot {
public static WebDriver driver;
public static void initializtion() {
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	
}
public void failed(String testMethoodName) {
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File("E:/Eclipse_workspace/AboutTestNG/ScreenShots/"+testMethoodName+"_"+".jpg"));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
}
}
