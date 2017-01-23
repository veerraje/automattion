package attribute;

import org.testng.annotations.Test;

public class invocution {
  
	
	
	@Test (dependsOnMethods = "test2")
  public void test1() {
	  
	  System.out.println("run");
  }
	@Test (invocationCount = 0, alwaysRun = true)
	  public void test2() {
		  
		  System.out.println("run gvsah");
	  }
}
