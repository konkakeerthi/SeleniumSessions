package BasicConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid username")) {
			System.out.println("Valid message");					
		}
		else {
			System.out.println("Invalid message");
		}
		alert.accept();//click on ok button
		//alert.dismiss();//click on cancel button
		//attach file windows : file uploads
		//driver.findElement(By.xpath(xpathExpression)).sendkeys("c://");
		

	}

}
