package Pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Library.Baseclass;

public class AccountInfoPage extends Baseclass{
	 private final By myacountdropdownbutton = new By.ByXPath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
	    private final By myaccount = new By.ByXPath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]");
	    private final By changepassword = new By.ByXPath("//a[@class='action change-password']");
	    private final By edit = new By.ByXPath("//span[normalize-space()='Edit']");
	    private final By manageaddresses = new By.ByXPath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[4]/div[1]/a[1]/span[1]");
	    private final By addnewaddresses = new By.ByXPath("//span[normalize-space()='Add New Address']");
	    @SuppressWarnings("unused")
		private final By status = new By.ByXPath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");

	    @SuppressWarnings("static-access")
		public AccountInfoPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    @SuppressWarnings("unchecked")
		public PasswordPage clickChangePassword() {
	        @SuppressWarnings("rawtypes")
			FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(myacountdropdownbutton));
	        click(myacountdropdownbutton);

	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(myaccount)));
	        click(myaccount);
	        click(changepassword);
	        return new PasswordPage(driver);
	    }

	    private void click(By myacountdropdownbutton2) {
			// TODO Auto-generated method stub
			
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		public EmailPage clickChangeEmail() {
	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(myacountdropdownbutton));
	        click(myacountdropdownbutton);

	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(myaccount)));
	        click(myaccount);
	        click(edit);
	        return new EmailPage(driver);
	    }

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public defaultAddressPage clickAddDefaultAddresses() {
	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(myacountdropdownbutton));
	        click(myacountdropdownbutton);

	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(myaccount)));
	        click(myaccount);

	        click(manageaddresses);
	        return new defaultAddressPage(driver);
	    }

	    		@SuppressWarnings("unchecked")
				public AddAddressPage clickAddNewAddresses() {
	        			@SuppressWarnings("rawtypes")
						FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(myacountdropdownbutton));
	        click(myacountdropdownbutton);

	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(myaccount)));
	        click(myaccount);

	        click(manageaddresses);

	        click(addnewaddresses);
	        return new AddAddressPage(driver);
	    }


}
