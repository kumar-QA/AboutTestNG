package TestNG.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Features2 {

	//timeout
	
//	 @Test(timeOut=200)
//	 public void test() {
//		 int i=1;
//		 while(i==1) {System.out.println(i);}
//	 }
	 
	//nvocationCount
	
//	 @Test(invocationCount=10)
//	 public void IC() {
//		 int a=10;
//		 int b=a+10;
//		 System.out.println(b);
//	 }
//	 @Test(invocationTimeOut=2000)method wait till invoactioncount number execute with the time of  invocationtimeout condition then that test case declared as pass
	 
	 //Expected expections
	 @Test(expectedExceptions=NumberFormatException.class)
	 public void handlingExpection() {
		String s="100A";
		Integer.parseInt(s);//error:	java.lang.NumberFormatException: For input string: "100A"
	 }
	 
	 //Assertion(Assert)
	 @Test()
	 public void Assertiontest() {
		 int i=10;
		 boolean condition=true;
//		 boolean condition1=false;
		 
//		 if(i=1) {System.out.println("true");}else {System.out.println("false")}//insted we use assertion
		 
		 Assert.assertEquals(i, 10,"not equal");
		 Assert.assertTrue(condition);//checking true or false
		 //other wise we can write below
		 Assert.assertEquals(condition, true,"not equal to true");
//		 Assert.assertTrue(condition1,"not true");
	 }

}
