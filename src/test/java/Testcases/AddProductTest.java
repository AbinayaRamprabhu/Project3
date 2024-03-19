package Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.AddproductPage;
import Pages.NavigatePage;
import Pages.WhatsNewpage;

public class AddProductTest extends Testbase {
	//Testcase 19
	@Test
    void test_AITSC_from_WhatIsNew() {
        AddproductPage aitsc = homePage.clickAddItemsToShoppingCart();
        WhatsNewpage aitsc_wn = aitsc.clickAddMultiItem_from_WomenStore_WhatIsNew();


        aitsc_wn.addMultiItem_Women_HoodiesSweatshirts(WomenProduct);
        aitsc_wn.selectQuantity("2");
        aitsc_wn.selectSize(1);
        String productname = aitsc_wn.submitProductToCart();
        String actualStatus = aitsc_wn.verifyItemAddedToCart();
        String expectedStatus = "You added " + productname + " to your shopping cart.";

        assertEquals(actualStatus, expectedStatus, "Item not added to shopping cart.");

    }


   //Testcase 20
    @Test
    void test_AITSC_from_NavigationBar() {
        AddproductPage aitsc = homePage.clickAddItemsToShoppingCart();
        NavigatePage aitsc_wn = aitsc.clickAddItemsToShoppingCart_NavigationBar();

        aitsc_wn.addMultiItem_Men_Jackets(MenProduct);
        aitsc_wn.selectQuantity("2");
        aitsc_wn.selectSize(1);
        String productname = aitsc_wn.submitProductToCart();
        String actualStatus = aitsc_wn.verifyItemAddedToCart();
        String expectedStatus = "You added " + productname + " to your shopping cart.";

        assertEquals(actualStatus, expectedStatus, "Item not added to shopping cart.");

    }
  
    


}
