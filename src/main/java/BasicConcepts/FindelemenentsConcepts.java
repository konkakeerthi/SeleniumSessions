package BasicConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelemenentsConcepts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
				
		
		//1.Get the Total count of links on the page
				//2.Total input tags - them By.Tagname("input")..similarly to button tags
				//Get the Text of links on the page
				
				List  <WebElement> linkList = driver.findElements(By.tagName("a"));
				//size of link list
				System.out.println(linkList.size());
				
				for(int i=0;i<linkList.size();i++) {
					
					String Text = linkList.get(i).getText();
					System.out.println(Text);
				}

	}

}
