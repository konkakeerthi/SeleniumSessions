package BasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
        // 2. FF
		//System.setProperty("webdriver.gecko.driver", "path");
		//WebDriver driver = new FirefoxDriver();//launch browser
		//driver.get("http://www.google.com");//enter URL
		
		//Tab text is title.
		String title = driver.getTitle();
		System.out.println(title);
		
		//validation point
		if(title.equals("Google")) {
			System.out.println("Correct Title");}
		else {
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//1.xpath - not hierrachey 2
		//absolute xpath should nt be used only relative xpath
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("jameswatson");
		//2.id - 1
		driver.findElement(By.id("lastName")).sendKeys("1233");
		driver.findElement(By.id("username")).sendKeys("jameswatson591");
		
		//3.name - 3
		driver.findElement(By.name("Passwd")).sendKeys("Jameswatson$1233");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Jameswatson$1233");
		
		//4.Linktext - 
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		//cssselector - 2
		driver.findElement(By.cssSelector("#firstName")).sendKeys("David");
		//rightclick and copy css selector or #(idvalue) or .(classname)
		//Classname and partial link text not recommended
		
		
		//driver.quit();
	}

}
