package annotations;

import org.testng.annotations.Test;

public class group {     //  different groups program
 
	
	@Test(groups = "Sanity")
  public void test1() {
	  //int a = 10/0;
	  System.out.println("Sanity group");
  }
  
  @Test(groups = "regresion")
  public void test2(){
	  System.out.println("regresion Groups");
  }
  
  @Test(groups = "poitive" ) //alwaysRun = true)
  public void test3() {
	  System.out.println("Positive groups");
  }
  @Test(groups = "negative")
  public void test4() {
	  System.out.println("negative group");
                                       // here i created four group
  }
 
  
  
  @Test (dependsOnGroups = "Sanity")
  public void test5(){                           // like this we can depends on each other
	  System.out.println("Test 5 depends on Sanity or regresion group");
  }

}

