package BasicConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class javascriptexecutor {

	public static void main(String[] args) {
		        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YEIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		        WebDriver driver = new ChromeDriver(); //launch chrome
		
				
				
				driver.manage().window().maximize();//maximize window
				driver.manage().deleteAllCookies();//delete all cookies
				
				//Dynamic wait
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.id("email")).sendKeys("nurturefarmtest11@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("Nurture@111");
				//driver.findElement(By.xpath("//button[@id=\'u_0_d_6J\']")).click();
	

				
				//executeScript 
				WebElement loginBtn = driver.findElement(By.name("login"));
				flash(loginBtn, driver);
				drawBorder(loginBtn,driver);
				
				//File src = (TakesScreenshot) driver.getScreenshotAs(outputType.File);
				//FileUtils.copyfile(src, new file(path of folder package));
				//NO alerts on application,but userdefined alerts can be generated using js
				generateAlert(driver,"Alert msg--Issue with login button on login page");
				//driver.switch().to.alert();
				//alert().ok();
				
				clickElementByJS(loginBtn,driver);
				//1.using selenium
				driver.navigate().refresh();
				//2.jsexecutor
				RefreshBrowserByJS(driver);
				System.out.println(gettitleByJS(driver));
				
				System.out.println(getPageInnerText(driver));
				scrollPageDown(driver);
				
				//any element - scrolls till forgotpwd link is visible
				//webelement forgorpwd = driver.fe - forgot password
				//scrollIntoView(forgotpwd,driver);
				
				
				
			
							

	}
	
	    public static void flash(WebElement element ,WebDriver driver) {
	    	
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);//js executor reference
	    	String bg = element.getCssValue("backgroundcolour");//bgcolour of any element
	    	for(int i=0 ; i<10 ; i++) { //colour changes 10 times from green to purple
	    		changecolour("rgb(0,200,0)",element,driver); //1 colour to green
	    		changecolour(bg,element,driver);//2 default colour of element
	    	}
	    	}

		    public static void changecolour(String colour,WebElement element ,WebDriver driver) {
		    	
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	js.executeScript("arguments[0].style.backgroundcolour = +'colour'", element);
		    	
		    	try {
		    		Thread.sleep(2000);
		    	} catch(InterruptedException e) {
		    		
		    	}
	    	
	    }
		    public static void drawBorder(WebElement element, WebDriver driver) {
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	js.executeScript("arguments[0].style.border=3px solid red'", element);
		    	
		    }
		    
		    public static void generateAlert(WebDriver driver,String message)
		    {
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	js.executeScript("alert('"+message+"')");
		    }
		    
		    //when xpath is fine..but cant locate use jsexecutor to hit library directly inside html code
		    public static void clickElementByJS(WebElement element, WebDriver driver) {
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	js.executeScript("arguments[0].click();", element);
		    	
		    }
		    public static void RefreshBrowserByJS(WebDriver driver) {
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	js.executeScript("history.go(0)");
		    	
		    }
		    public static String gettitleByJS(WebDriver driver) {
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	String title = js.executeScript("return document.title;").toString();
		    	return title;
		    	
		    }
		    //capture entire text on that page //DOM commands js
		    public static String getPageInnerText(WebDriver driver) {
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		    	return pageText;
		    	
		    }
		    public static void scrollPageDown(WebDriver driver) {
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	js.executeScript("window.scrollTo(0,document.body.scrollHeight");
		    	
		    	
		    }
		    //scrolltill expected is visible
		    public static void scrollIntoView(WebElement element,WebDriver driver) {
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		    	js.executeScript("arguments[0].scrollIntoView(true);",element);
		    	
		    	
		    }
		    }




