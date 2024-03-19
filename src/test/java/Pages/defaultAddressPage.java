package Pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import Library.Baseclass;

public class defaultAddressPage extends Baseclass{

    private final By firstname = new By.ById("firstname");
    private final By lastname = new By.ById("lastname");
    private final By company = new By.ById("company");
    private final By telephone = new By.ById("telephone");
    private final By street_1 = new By.ById("street_1");
    private final By street_2 = new By.ById("street_2");
    private final By street_3 = new By.ById("street_3");
    private final By city = new By.ById("city");
    private final By state = new By.ById("region");
    private final By statedropdown = new By.ById("region_id");
    private final By postalcode = new By.ById("zip");
    private final By countrydropdown = new By.ById("country");
    private final By saveaddress = new By.ByXPath("//*[@id=\"form-validate\"]/div/div[1]/button");
    private final By status = new By.ByXPath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    @SuppressWarnings("unused")
	private final By addnewaddresses = new By.ByXPath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[6]/div[1]/button");

    @SuppressWarnings("static-access")
	public defaultAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setContactInformation(String FirstName, String LastName, String Company, String PhoneNumber) {
        clear(firstname);
        sendKeys(firstname, FirstName);
        clear(lastname);
        sendKeys(lastname, LastName);
        sendKeys(company, Company);
        sendKeys(telephone, PhoneNumber);
    }

    private void sendKeys(By firstname2, String firstName3) {
		
		
	}

	private void clear(By firstname2) {
				
	}

	public void setStreetAddress(String Address1, String Address2, String Address3) {
        sendKeys(street_1, Address1);
        sendKeys(street_2, Address2);
        sendKeys(street_3, Address3);
    }

    public void setCity(String City) {
        sendKeys(city, City);
    }

    public void setState_DROPDOWN(String State) {
        Select select = new Select(driver.findElement(statedropdown));
        select.selectByVisibleText(State);
    }

    public void setState(String State) {
        sendKeys(state, State);
    }

    public void setPostalCode(String PostalCode) {
        sendKeys(postalcode, PostalCode);
    }

    public void setCountrydropdown(String Country) {
        Select select = new Select(driver.findElement(countrydropdown));
        select.selectByVisibleText(Country);
    }

    public void saveAddress() {
        click(saveaddress);
    }

    private void click(By saveaddress2) {
				
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void verifyAddressAdded() {
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(status));


        String expectedStatus = "https://magento.softwaretestingboard.com/customer/address/index/";
        String actualStatus = getCurrentURL();
        assertEquals(actualStatus, expectedStatus, "Address not saved");

    }

	private String getCurrentURL() {
				return null;
	}

}
