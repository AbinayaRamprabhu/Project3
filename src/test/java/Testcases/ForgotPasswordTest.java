package Testcases;

import org.testng.annotations.Test;

import Pages.ForgotPasswordPage;

public class ForgotPasswordTest extends Testbase{
	//Testcase 9
	   @Test
	    public void testForgotPassword() {
	        ForgotPasswordPage forget = homePage.clickForgetPasswordPage();
	        forget.enterEmail(email);
	        forget.clickResetMyPassword();
	        forget.verifyResetPassword();
	    }

}
