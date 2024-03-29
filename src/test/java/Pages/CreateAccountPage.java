package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Library.Baseclass;

public class CreateAccountPage extends Baseclass{
	   private final By firstname = new By.ById("firstname");
	    private final By lastname = new By.ById("lastname");
	    private final By email = new By.ById("email_address");
	    private final By password = new By.ById("password");
	    private final By confirm_password = new By.ById("password-confirmation");
	    private final By create_account_button = new By.ByXPath("//*[@id=\"form-validate\"]/div/div[1]/button");
	    private final By clickherebtn = new By.ByXPath("//a[normalize-space()='click here']");
	    @SuppressWarnings("unused")
		private final By emailtextboxresetpasswor = new By.ById("email_address");
	    @SuppressWarnings("unused")
		private final By clicktresetpasswordbtn = new By.ByXPath("//span[normalize-space()='Reset My Password']");

	    private final By status = new By.ByXPath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");

	    @SuppressWarnings("static-access")
		public CreateAccountPage(WebDriver driver) {
	        this.driver = driver;
	    }

	   	    public void setPersonalInformation(String firstName, String lastName) {
	        sendKeys(firstname, firstName);
	        sendKeys(lastname, lastName);
	    }

	   	    private void sendKeys(By firstname2, String firstName3) {
								
			}

			public void setSignInInformation(String Email, String Password, String confirmPassword) {
	        sendKeys(email, Email);
	        sendKeys(password, Password);
	        sendKeys(confirm_password, confirmPassword);
	    }

	   	    public void create_account() {
	        click(create_account_button);
	    }

	   	    private void click(By create_account_button2) {
								
			}

			public void verifyPageURL() {
	        String expectedPageSource = "https://magento.softwaretestingboard.com/customer/account/";
	        String actualPageSource = getCurrentURL();
	        assertEquals(actualPageSource, expectedPageSource, "account not created");
	    }

	    private String getCurrentURL() {
					return null;
			}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		public void verifyEmailIsRegisteredBefore() {
	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(clickherebtn));

	        String expectedStatus = "There is already an account with this email address";
	        wait.until(ExpectedConditions.presenceOfElementLocated(status));


	        String actualStatus = driver.findElement(status).getText();
	        System.out.println(actualStatus);
	        assertTrue(actualStatus.contains(expectedStatus), "account not created");
	    }
}
