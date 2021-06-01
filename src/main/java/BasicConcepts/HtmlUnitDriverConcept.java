package BasicConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		//WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		System.out.println("Title before login is : ---" + driver.getTitle());
		
		//driver.getTitle();
		
		driver.findElement(By.id("email")).sendKeys("nurturefarmtest11@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nurture@111");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Title After login is : ---"+ driver.getTitle());

	}

}
