package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Library.Baseclass;

public class EmailPage extends Baseclass {
	private final By changeemail = new By.ById("change-email");
    private final By email = new By.ById("email");
    private final By currentpassword = new By.ById("current-password");
    private final By status = new By.ByXPath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");
    private final By savebutton = new By.ByXPath("//*[@id=\"form-validate\"]/div/div[1]/button");

    @SuppressWarnings("static-access")
	public EmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setChangeEmail(String Email) {
        click(changeemail);
        clear(email);
        sendKeys(email, Email);
    }

    private void sendKeys(By email2, String email3) {
				
	}

	private void clear(By email2) {
			}

	private void click(By changeemail2) {
			}

	public void setCurrentPassword(String Password) {
        sendKeys(currentpassword, Password);
    }

    public String getStatus() {
        return getText(status);
    }

    private String getText(By status2) {
				return null;
	}

	public void save() {
        click(savebutton);
    }


    public void verifyEmailChanged() {
        String expectedStatus = "https://magento.softwaretestingboard.com/customer/account/login/";
        String actualStatus = getCurrentURL();
        assertEquals(actualStatus, expectedStatus, "Password not changed");
    }

	private String getCurrentURL() {
				return null;
	}
}
