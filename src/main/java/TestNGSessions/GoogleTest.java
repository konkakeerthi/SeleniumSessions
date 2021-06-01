package TestNGSessions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod//1//4//7
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver(); //launch browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}
	
	@Test(priority=1,groups = "Test")//Folder will be created with groups name
	//2
	public void googletitletest() {
		
		String title = driver.getTitle();
		System.out.println(title);	
		Assert.assertEquals(title, "Google" ,"Title is not Matched(Fail msg)"); //Validations
	}
	
	@Test(priority=2,groups="Title")
	//5
	public void googlelogotest() {		
		boolean b = driver.findElement(By.xpath("//img[@alt = 'Google']")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@Test(priority=3)//8
	public void maillinktest() {		
		driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@AfterMethod//3//6//9
	public void teardown() {
		driver.quit();		
	}

}
