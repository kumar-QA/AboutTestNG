package TestNgListener;



import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotTest extends BaseForScreenShot{
	@BeforeMethod
	public void setUp() {
		initializtion();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void Reg() {
		Assert.assertEquals(true, false);
		
	}
	@Test
	public void Search() {
		Assert.assertEquals(true, false);
		
	}
	@Test
	public void login() {
		Assert.assertEquals(true, false);
		
	}
	
}
