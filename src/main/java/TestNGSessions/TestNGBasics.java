package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	//--Preconditions--starting with @before
	/*
	 * Setup for chrome
launchBrowser
login
enter URL
Google Title Test
Logout of app
close browser
Delete all cookies
PASSED: googleTitleTest
	 *   
	 *   Beforesuite - BeforeTest (TtNG)- BeforeClass - @BeforeMethod - @Test - AfterMethod(@BeforeMethod - @Test2 - @Aftermethod) - @AfterClass - @AfterTest
	 */
	@BeforeSuite //1
    public void setup() {
		System.out.println("Setup for chrome");		
	}
	
	@BeforeClass//3
	public void login() {
		System.out.println("login");
	}
	
	@BeforeMethod//4
    public void enterURL() {
		System.out.println("enter URL");
	}
	
	@BeforeTest //2
    public void launchBrowser() {
		System.out.println("launchBrowser");
	}
	//Testcases
	
	@Test//5
	 public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	//postconditions--starting with @After	
	@AfterMethod //6
	 public void logout() {
		System.out.println("Logout of app");			
	}
	
	@AfterTest //8
	 public void deleteallcookies() {
		System.out.println("Delete all cookies");
	}
	
	@AfterClass //7
	 public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterSuite //9
	 public void generatestreport() {
		System.out.println("Generate Test report");
	}
	
	
	
	
	
	
	
	

}
