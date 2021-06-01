package BasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//max window
		driver.manage().deleteAllCookies();//delete cookies
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.name("username")).sendKeys("chirrachalama");
		driver.findElement(By.name("password")).sendKeys("@452dear");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		

	}

}
