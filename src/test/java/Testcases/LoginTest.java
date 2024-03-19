package Testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends Testbase{
	//Testcase 1
	 @Test(priority = 1, description = "Valid Login Scenario with valid username and password")
	    public void testLogin() {
	        LoginPage log = homePage.clickLoginPage();
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        log.verifySignINIs_Ok();

	    }
     //Testcase 2
	    @Test(priority = 2, description = "Invalid Login Scenario with invalid username and valid password")
	    public void testLogin_invalidCredentials() {
	        LoginPage log = homePage.clickLoginPage();
	        String password = "__P@ssw0rd__";
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        log.VerifySignINIs_incorrect();
	    }
	    //Testcase 3
     @Test(priority = 3, description = "Invalid Login Scenario with valid username and invalid password")
     public void testLogin_invalidCredentials1() {
	        LoginPage log = homePage.clickLoginPage();
	        String email = "76756";
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        log.VerifySignINIs_incorrect();
	    } 
     //Testcase 4
     @Test(priority = 4, description = "Invalid Login Scenario with invalid username and invalid password")
     public void testLogin_invalidCredentials2() {
	        LoginPage log = homePage.clickLoginPage();
	        String email = "76756";
	        String password = "ggh";
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        log.VerifySignINIs_incorrect();
	    } 
}
