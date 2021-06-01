package BasicConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementvisibilityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver(); //launch chrome

		
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://register.freecrm.com/register/");
		 
		//isdispalyed
		boolean b1 = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(b1);
		//isenabled method
		boolean b2 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b2);//false
		
		//select I Agree checkbox:
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b3);//true
		
		//isselected only applicable for chkbox,dropdown,radiobutton
         boolean b4 = driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
         System.out.println(b4);//true
         
         boolean b5 = driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
         System.out.println(b5);//false
         
         
         
	}
	
	
	

}
