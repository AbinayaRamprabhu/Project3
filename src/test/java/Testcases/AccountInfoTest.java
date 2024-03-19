package Testcases;

import org.testng.annotations.Test;

import Pages.AccountInfoPage;
import Pages.AddAddressPage;
import Pages.EmailPage;
import Pages.LoginPage;
import Pages.PasswordPage;
import Pages.defaultAddressPage;

public class AccountInfoTest extends Testbase{
	//Testcase 10
	 @Test(priority = 4)
	    void testChangePassword() {
	        LoginPage log = homePage.clickLoginPage();
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        AccountInfoPage edit = homePage.clickEditAccountPage();
	        PasswordPage change = edit.clickChangePassword();
	        change.setCurrentPassword(password);
	        change.setNewPassword(password);
	        change.setConfirmNewPassword(confirm_password);
	        change.save();
	        change.verifyPasswordChanged();
	    }

   //Testcase 11
	    @Test(priority = 3)
	    void testChangeEmail() {
	        LoginPage log = homePage.clickLoginPage();
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        AccountInfoPage edit = homePage.clickEditAccountPage();
	        EmailPage change = edit.clickChangeEmail();
	        change.setChangeEmail(email);
	        change.setCurrentPassword(password);
	        change.save();
	        change.verifyEmailChanged();


	    }
     //Testcase 12
	    @Test(priority = 1)
	    void testAddNewAddress_DefaultAddress_FirstTime() {
	        LoginPage log = homePage.clickLoginPage();
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        AccountInfoPage edit = homePage.clickEditAccountPage();
	        defaultAddressPage Daddress = edit.clickAddDefaultAddresses();
	        Daddress.setContactInformation(firstname, lastname, company, phone_number);
	        Daddress.setStreetAddress(address1, address2, address3);
	        Daddress.setCity(city);
	        Daddress.setCountrydropdown(country);
	        Daddress.setState(state);
	        Daddress.setPostalCode(postalcode);
	        Daddress.saveAddress();
	        Daddress.verifyAddressAdded();

	    }

      //Testcase 13
	    @Test(priority = 2)
	    void testAddNewAddress_IfCountryUSA() {
	        LoginPage log = homePage.clickLoginPage();
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        AccountInfoPage edit = homePage.clickEditAccountPage();
	        AddAddressPage Naddress = edit.clickAddNewAddresses();
	        Naddress.setContactInformation(firstname, lastname, company, phone_number);
	        Naddress.setStreetAddress(address1, address2, address3);
	        Naddress.setCity(city);
	        Naddress.setCountrydropdown("United States");
	        Naddress.setState_DROPDOWN("Alaska");
	        Naddress.setPostalCode(postalcode);
	        Naddress.saveAddress();
	        Naddress.verifyAddressAdded();

	    }
	    //Testcase 14
	    @Test(priority = 2)
	    void testAddNewAddress_IfCountryIndia() {
	        LoginPage log = homePage.clickLoginPage();
	        log.setLoginCredentials(email, password);
	        log.signIn();
	        AccountInfoPage edit = homePage.clickEditAccountPage();
	        AddAddressPage Naddress = edit.clickAddNewAddresses();
	        Naddress.setContactInformation(firstname, lastname, company, phone_number);
	        Naddress.setStreetAddress(address1, address2, address3);
	        Naddress.setCity(city);
	        Naddress.setCountrydropdown("India");
	        Naddress.setState_DROPDOWN("TamilNadu");
	        Naddress.setPostalCode(postalcode);
	        Naddress.saveAddress();
	        Naddress.verifyAddressAdded();

	    }
	    

}
