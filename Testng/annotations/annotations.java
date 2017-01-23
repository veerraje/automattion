package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

                                  //Note : testng console output
                                   /*before shuite  (1) 
                                   before test will execute before main test method (2) 
                                   before class (3)
                                   before method (5)
                                   test first (main Test method) 
                                   before group (4)
                                   before method
                                   test second
                                   after class 
                                   test third
                                   after test will exceute after main test method*/
public class annotations {         // after shuite 
 @Test
  public void test1() {
	  System.out.println("test first");
	  
  }
 @Test (groups = "abc")
 public void test2() {
	  System.out.println("test second");
	  
 }
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("befor test wiil execute before main test method");
  }

  @AfterTest 
  public void afterTest() {
	  System.out.println("after test will exceute after main test method");
  }

  @BeforeSuite 
  public void beforeSuite() {
	  System.out.println("before shuite");
  }

  @AfterSuite 
  public void afterSuite() {
	  System.out.println("after shuite");     
  }
  @BeforeMethod
  public void beforemethd() {
	  System.out.println("before method");
  }  
  @BeforeGroups (groups = "abc")
  public void beforegroup() {
	  System.out.println("before group");
  } 
}

 class class2 {
	@Test
	 public void test3() {
		  System.out.println("test third");
		  
	 }
	
}
