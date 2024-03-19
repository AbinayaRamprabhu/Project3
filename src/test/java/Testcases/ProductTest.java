package Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.ProductPage;

public class ProductTest extends Testbase {
	//Testcase 7
	   @Test
	    void testSearchProduct() {
	        ProductPage searchproduct = homePage.clickSearchProduct();
	        String product = "shirts";
	        searchproduct.enterProductName(product);
	        String actualstatus = searchproduct.getStatus();
	        assertTrue(actualstatus.contains(product), "test False");
	    }
	 //Testcase 8
	   @Test
	    void testSearchProduct1() {
	        ProductPage searchproduct = homePage.clickSearchProduct();
	        String product = "Womenproducts";
	        searchproduct.enterProductName(product);
	        String actualstatus = searchproduct.getStatus();
	        assertTrue(actualstatus.contains(product), "test False");
	    }
}
