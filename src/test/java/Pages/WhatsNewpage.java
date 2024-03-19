package Pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Library.Baseclass;

public class WhatsNewpage extends Baseclass {
	   private final By status = new By.ByXPath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
	    private final By quantity = new By.ById("qty");
	    private final By addtocartbutton_f = new By.ById("product-addtocart-button");
	    private final By nameofproduct = new By.ByXPath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1");

	    public WhatsNewpage(WebDriver driver) {
	        this.driver = driver;
	    }

	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public void addMultiItem_Women_HoodiesSweatshirts(String productName) {
	        String xpath_addtocartbutton = "//a[normalize-space()='" + productName + "']";
	        By addtocartbutton = new By.ByXPath(xpath_addtocartbutton);
	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addtocartbutton)));
	        click(addtocartbutton);

	    }

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public void selectSize(int sizeNum) {
	        String xpath_size = "option-label-size-143-item-" + (166 + sizeNum);
	        By size = new By.ById(xpath_size);
	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(size));
	        click(size);

	    }

	 

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public void selectQuantity(String Quantity) {
	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(quantity));
	        clear(quantity);
	        sendKeys(quantity, Quantity);
	    }

	    public String submitProductToCart() {
	        click(addtocartbutton_f);
	        return driver.findElement(nameofproduct).getText();
	    }

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public String verifyItemAddedToCart() {
	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(status));

	        return getText(status);
	    }


}
