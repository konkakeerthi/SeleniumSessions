package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicListeners {
	
	@Test(retryAnalyzer = TestNGSessions.RetryAnalyser.class)
	public void Test1()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(true, false);
	}


}
