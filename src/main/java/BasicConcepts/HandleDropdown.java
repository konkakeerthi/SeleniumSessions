package BasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hannafordfarmexchange.com.au/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		//Handle dropdown
		Select oselect = new Select(driver.findElement(By.xpath("//select[@id='identityProof']")));
		Thread.sleep(2000);
		oselect.selectByIndex(2);
		
		
	}

}
