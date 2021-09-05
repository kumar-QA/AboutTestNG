package TestNG.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertion {

	@Test
	public void HardAssertion() {
		System.out.println("1");
		System.out.println("2");
		Assert.assertEquals(true, false);
		System.out.println("3");
		System.out.println("4");
		Assert.assertEquals(true, false);
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		/*
		 	*below line of not executed
		 	*test declared as failed after assertion
		 	*below assertion are also not executed
		 */
	}
	@Test
	public void softAssertion() {
		SoftAssert sa=new SoftAssert() ;
		System.out.println("1");
		System.out.println("2");
		sa.assertEquals(true, false);
		System.out.println("3");
		sa.assertEquals(true, false);
		System.out.println("4");
		System.out.println("5");
		sa.assertEquals(true, false,"reason for failure");
		System.out.println("6");
		/*
		 *softassert below statement are executed but testcase declared as pass eventhough test case failed
		 *to over come these we use assertAll();
		 *we can write messages of failure cause 
		 */
		sa.assertAll();
	}
}
