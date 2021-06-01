package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class yahootest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailid"})
	public void yahoologintest(String url,String emailid) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver(); //launch browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
	}

}
