package Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.AddproductPage;
import Pages.CheckOutPage;
import Pages.LoginPage;
import Pages.NavigatePage;

public class CheckOutTest extends Testbase {
	 //Testcase 17
	 @Test
	    void testCheckoutCartItems() {
	        LoginPage log = homePage.clickLoginPage();
	        log.setLoginCredentials(email, password);
	        log.signIn();

	        AddproductPage aitsc = homePage.clickAddItemsToShoppingCart();
	        NavigatePage aitsc_wn = aitsc.clickAddItemsToShoppingCart_NavigationBar();

	        aitsc_wn.addMultiItem_Men_Jackets(MenProduct);
	        aitsc_wn.selectQuantity("2");
	        aitsc_wn.selectSize(1);
	        aitsc_wn.submitProductToCart();
	        CheckOutPage checkout = homePage.clickCheckoutCartItems();
	        checkout.checkoutItemInCart();
	        String actualStatus = checkout.getCurrentURL();
	        assertTrue(actualStatus.contains("success"), "No item is purchased");

	    }
	//Testcase 18
		 @Test
		    void testCheckoutCartItems1() {
		        LoginPage log = homePage.clickLoginPage();
		        log.setLoginCredentials(email, password);
		        log.signIn();

		        AddproductPage aitsc = homePage.clickAddItemsToShoppingCart();
		        NavigatePage aitsc_wn = aitsc.clickAddItemsToShoppingCart_NavigationBar();

		        aitsc_wn.addMultiItem_Men_Jackets(WomenProduct);
		        aitsc_wn.selectQuantity("2");
		        aitsc_wn.selectSize(1);
		        aitsc_wn.submitProductToCart();
		        CheckOutPage checkout = homePage.clickCheckoutCartItems();
		        checkout.checkoutItemInCart();
		        String actualStatus = checkout.getCurrentURL();
		        assertTrue(actualStatus.contains("success"), "No item is purchased");

		    }
}
