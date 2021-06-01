package BasicConcepts;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@class='username']")).sendKeys("Name");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Name");
		driver.findElement(By.xpath("//input[contains(@class,'username')]")).sendKeys("Name");
		//dynamic id : id gets changed on every refresh
		//id = test _123 - starts with
		//id = test_567	
		
		//id = 1234_test - ends with
		//id = 676_test_t
		
		driver.findElement(By.xpath("//input[contains(@id,'test_)']")).sendKeys("Name");
		driver.findElement(By.xpath("//input[starts-with(@id,'test_)']")).sendKeys("Name");
		driver.findElement(By.xpath("//input[endswith(@id,'test_t)']")).sendKeys("Name");
		
		//for links custom x path
		//<a> tag for links will b there
		driver.findElement(By.xpath("//a[contains(Text(),'MyAccount']")).click();
		
		
		}
	}


