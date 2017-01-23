package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import org.testng.internal.FactoryMethod;

import parameter.object;

public class dataproviders {
 
/*	@DataProvider (name = "data-provider")
	public object [][] dataprovidermethod(){
		return new object[][] { {"two fashg"}, {"fgas gahgshk"} };
		
	}*/
	
	@Test
  public void factorytest() {
		System.out.println(" simple test");
  }
}
	 class testfactory{
	@Factory
	public object[] testmethod(){
		return new object[] { new object() ,new object() };
	}
}
