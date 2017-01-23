package attribute;

import org.testng.annotations.Test;

public class dependsmethod {
  @Test (dependsOnMethods = {"test3" , "test2"})
  public void test1() {
	  
	  System.out.println("test case 1");
  }
  @Test
  public void test2() {
	  
	  System.out.println("test case 2");
  }
  @Test
  public void test3() {
	  
	  System.out.println("test case 3");
  }
}

