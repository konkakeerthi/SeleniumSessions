package TestNGSessions;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i =9/0; //fail test case
	}
	
    @Test(dependsOnMethods="loginTest")
    public void HomePageTest() {
    	System.out.println("HomePage Test");//In fail case this testase is skipped as it is dependent
	}
    
    @Test(invocationCount=10) //execute same testCase many times ; Dump data into system
    public void Sum() {
    	int a=10;
    	int b=20;
    	int c=a+b;
    	System.out.println("Sum is =" + c);
	}
    
   // @Test(invocationtimeOut=20000)//Tc wil be executed for 2s //Never usefull in code
    	public void infinateloopTest() {
    	int i =1;
    	while(i==1) {
    		System.out.println(i);
    	}
    }
    	@Test(expectedExceptions=NumberFormatException.class)//THough excpetion is there it wont fail TC.//we wont use.only for knowledge
    	
    		public void Test() {
    	        String x="100A";
    	        Integer.parseInt(x);
       		}
    	
    	
    
    
    
}
