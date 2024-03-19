package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.Baseclass;

public class LoginPage extends Baseclass {
	  private final By email = new By.ById("email");
	    private final By password = new By.ById("pass");
	    private final By signin = new By.ById("send2");
	    @SuppressWarnings("unused")
		private final By status = new By.ByXPath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	  
	    public void setLoginCredentials(String Email, String Password) {
	        sendKeys(email, Email);
	        sendKeys(password, Password);
	    }

	   
	    public void signIn() {
	        click(signin);
	    }


	    public void verifySignINIs_Ok() {
	        String expectedURL = "https://magento.softwaretestingboard.com/";
	        String actualURL = driver.getCurrentUrl();
	        assertEquals(actualURL, expectedURL);
	    }

	    public void VerifySignINIs_incorrect() {
	        String expectedURL = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/";
	        String actualURL;
			try {
				actualURL = ChromeDriver.getCurrentUrl();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        assertEquals(actualURL, expectedURL);
	    }



}
