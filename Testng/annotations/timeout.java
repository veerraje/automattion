package annotations;

import org.testng.annotations.Test;

public class timeout {
  @Test (timeOut = 500)
  public void test1() throws InterruptedException{
	  Thread.sleep(600);
	  System.out.println("first test method");
  }
  
  @Test
  public void test2() throws Exception {
	  Thread.sleep(300);
	  System.out.println("second test method");
  }
  
}
