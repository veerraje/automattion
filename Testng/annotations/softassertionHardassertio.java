package annotations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertionHardassertio {

	WebDriver driver;  // hard assertion means ,1 if a test method is fail it will stop entire execution   
	                  // soft mean, 1 if a test case is fail , it will not stop our script,but it will stop in last after, entire execution of script
	@Test                  // hard assert , import assert. all method
	public void test1(){  // soft assert creat object of softassert calss and call method
    driver.get("https://www.google.co.in/");
 	//String title = driver.getTitle();
    System.out.println("test is start");
	Assert.assertEquals("Pragya","Pragya Hi"); // here para meter it is not equals  so it will fail forcefully	
	System.out.println("test is end"); // end will not execute , cause of, condition is false
	}
	
	@Test
	public void test2(){
	System.out.println("start test");
	Assert.assertEquals(12, 12);// it will pass , they are equals, like this u can campare title of app
	System.out.println("end test"); // end test statement will execute, cause of cxondition is true 
	}
	
	@Test
	public void test3(){
	Assert.assertTrue(true); // it will execute if element is enable, display
	System.out.println("assert true");
	Assert.assertTrue(false); // it will fail test forcefully
	System.out.println("assert false");
	}
	
	
	
	@Test
	public void test4(){
		
		SoftAssert soft = new SoftAssert();  //creat object of soft assertion class , by testng 
		
		System.out.println("start test of soft");
		soft.assertEquals("pragya", "mohanta");
		System.out.println("end test of soft"); // here condition is false , still both statement will display 
	}                                           // due to soft assertion 
	
	
	
	
	
}
