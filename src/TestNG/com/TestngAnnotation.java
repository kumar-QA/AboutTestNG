package TestNG.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestngAnnotation {
	@BeforeSuite
	public void suitetest() {
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void classtest() {
		System.out.println("Before class ");
	}
	@BeforeTest
	public void beforetet() {
		System.out.println("Before test");
	}
	@BeforeMethod
	public void method() {
		System.out.println("Before method");
	}
	
	@Test
	public void test() {
		System.out.println("hello");
	}
	@Test
	public void test1() {
		System.out.println("hello1");
	}
	@AfterClass
	public void Afterclasstest() {
		System.out.println("After class ");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("After test");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After method");
	}
	@AfterSuite
	public void suite() {
		System.out.println("afterSuite");
	}
	
}
