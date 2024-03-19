package Testcases;

import org.testng.annotations.Test;

public class HomeTest extends Testbase {
	//Testcase 5
	 @Test
	    void testCreateAcount() {
	        homePage.clickCreateAccountPage();

	    }
  //Testcase 6
	    @Test
	    void testSignIn() {
	        homePage.clickLoginPage();
	    }
}
