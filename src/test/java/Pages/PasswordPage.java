package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Library.Baseclass;

public class PasswordPage extends Baseclass {
	 private final By currentpassword = new By.ById("current-password");
	    private final By newpassword = new By.ById("password");
	    private final By confirmnewpassword = new By.ById("password-confirmation");
	    private final By savebutton = new By.ByXPath("//*[@id=\"form-validate\"]/div/div[1]/button");

	    public PasswordPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void setCurrentPassword(String currentPassword) {
	        sendKeys(currentpassword, currentPassword);
	    }

	    public void setNewPassword(String newPassword) {
	        sendKeys(newpassword, newPassword);
	    }

	    public void setConfirmNewPassword(String confirmNewPassword) {
	        sendKeys(confirmnewpassword, confirmNewPassword);
	    }

	    public void save() {
	        click(savebutton);
	    }

	    public void verifyPasswordChanged() {
	        String expectedStatus = "https://magento.softwaretestingboard.com/customer/account/login/";
	        String actualStatus = getCurrentURL();
	        assertEquals(actualStatus, expectedStatus, "Password not changed");
	    }
}
