package TestNG.com;

import org.testng.annotations.Test;

public class Features1 {

				//priority
//	@Test(priority=3)
//	public void logIn() {System.out.println("login page");}
//	@Test(priority=2)
//	public void homePage() {System.out.println("Home page");}
//	@Test(priority=1)
//	public void registrationPage() {System.out.println("Regeistration  page");}
	
                 //	groups
	
//	@Test(priority=3,groups="Login")
//	public void logIn() {System.out.println("login page");}
//	@Test(priority=2,groups="Test")
//	public void homePage() {System.out.println("Home page");}
//	@Test(priority=1,groups="Test")
//	public void registrationPage() {System.out.println("Regeistration  page");}
	
				//dependsOnMethods
	
	@Test(priority=3,groups="Login")
	public void logIn() {System.out.println("login page");}
	@Test(priority=2,groups="Test",dependsOnMethods="logIn")
	public void homePage() {System.out.println("Home page");}
	@Test(priority=1,groups="Test",dependsOnMethods="logIn")
	public void registrationPage() {System.out.println("Regeistration  page");}
}
