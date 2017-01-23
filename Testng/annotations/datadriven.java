package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
	
    @Test(dataProvider="dp")
    public void alphabets(String upperCase, String lowerCase) {
        System.out.println("alphabets(" + upperCase + ", " + lowerCase + ")");
    }
     
    @DataProvider
    public Object[][] dp() {
        return new Object[][]{{"A", "a"}, {"B", "b"}};
    }
}