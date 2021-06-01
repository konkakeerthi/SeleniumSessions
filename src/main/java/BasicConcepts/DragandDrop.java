package BasicConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable'")))
        .moveToElement(driver.findElement(By.xpath("//*[@id='draggable'"))).release().build().perform();
        //implicit wait- Dynamic wait- wait for 40 sec to load..if within 2sec page loaded rest time ignored
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //for individual elements to load completely
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
