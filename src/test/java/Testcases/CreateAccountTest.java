package Testcases;

import org.testng.annotations.Test;

import Pages.CreateAccountPage;

public class CreateAccountTest extends Testbase{
	//Testcase 15
	  @Test
	    public void testCreateAccount() {
	        CreateAccountPage cap = homePage.clickCreateAccountPage();
	        cap.setPersonalInformation(firstname, lastname);
	        cap.setSignInInformation(email, password, confirm_password);
	        cap.create_account();
	        cap.verifyPageURL();
	    }
	  //Testcase 16
	    @Test(description = "verify that there is already an account with this email address")
	    public void test_There_is_already_an_account_with_this_email_address() {
	        CreateAccountPage cap = homePage.clickCreateAccountPage();
	        cap.setPersonalInformation(firstname, lastname);
	        cap.setSignInInformation(email, password, confirm_password);
	        cap.create_account();
	        cap.verifyEmailIsRegisteredBefore();
	    }
	    
}
