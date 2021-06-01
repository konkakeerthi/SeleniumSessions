package BasicConcepts;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		//File src = (TakesScreenshot) driver.getScreenshotAs(outputType.File);
		//FileUtils.copyfile(src, new file(path of folder package));

	}

}
