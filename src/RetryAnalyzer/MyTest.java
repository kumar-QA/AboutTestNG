package RetryAnalyzer;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MyTest {

	//Test level
//	@Test(retryAnalyzer=RetryAnalyzer.class)
//	public void test1() {
//		Assert.assertEquals(true, false);
//	}
//	@Test(retryAnalyzer=RetryAnalyzer.class)
//	public void test2() {
//		Assert.assertEquals(false, true);
//	}
	
	//Run time
	
	@Test
	public void test1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void test3() {
		Assert.assertEquals(false, false);
	}
}
