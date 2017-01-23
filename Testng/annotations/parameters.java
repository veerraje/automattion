package annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
  @Parameters ({"one parametrs"})
	@Test ()
  public void test1(String para1) {
	  System.out.println("paramtrs one "+para1);
  }
  @Parameters( {"two parametrs"})
  @Test
  public void test2(String para2) {
	  System.out.println("parameters two "+para2);
  }
  @Parameters({"three parametrs"})
  @Test
  public void test3(String val3) {
	  System.out.println("parametrs three "+val3);
	  //System.out.println("parametrs four"+val4);
  }
}

