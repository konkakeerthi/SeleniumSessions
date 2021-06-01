package BasicConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver(); //launch chrome

		
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("nurturefarmtest11@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nurture@111");
		Thread.sleep(2000);
		driver.findElement(By.name("login"));
		
		//dynamic webtable give xpath
		driver.findElement(By.xpath("//a[contains(text(),'test2')]/parent::td/preceding-sibling::td//input[@name='contactid']")).click();
		
		

	}

}
