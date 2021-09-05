package com.DataDriven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.test.utility.GeneralUtil;

public class DataDrivenOnRegistration {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	
	 @Test(dataProvider="getTestData")
	 public void RegistrationPage(String firstname,String lastname,String Address,String Email,String phoneno,String gender,String country) {
		 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).clear();
		 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys(firstname);
		 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).clear();
		 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys(lastname);
		 
		
		 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).clear();
		 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys(Address);
		 driver.findElement(By.xpath("//*[@id='eid']/input")).clear();
		 driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys(Email);
		 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).clear();
		 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys(phoneno);
		 if(gender=="Male") {
			 
			 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input")).click();
		 }else {
			 
			 driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input")).click();
		 }
		 Select select=new Select(driver.findElement(By.xpath("//*[@id='countries']")));
			 select.selectByVisibleText(country);

		 driver.findElement(By.xpath("//*[@id='submitbtn']")).click();	
	 }
	 
	 @DataProvider
		public String[][] getTestData() throws IOException {
		String[][] testvalue=GeneralUtil.getDataFromExcel();
		return testvalue;
		}
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
}


//driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
//driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("benson");
//driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
//driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Neal");
//driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
//driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("bensonneal9951995@gmail.com");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("benson@123#");
//driver.findElement(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")).click();