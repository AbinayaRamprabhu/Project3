package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Library.Baseclass;

public class HomePage extends Baseclass {
	 private final By createaccount = new By.ByXPath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
	    private final By signin = new By.ByXPath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
	    private final By forgetpassword = new By.ByXPath("//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a");

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	  	    public CreateAccountPage clickCreateAccountPage() {
	        click(createaccount);
	        return new CreateAccountPage(driver);
	    }


	   	    public LoginPage clickLoginPage() {
	        click(signin);
	        return new LoginPage(driver);
	    }

	    public ForgotPasswordPage clickForgetPasswordPage() {
	        click(signin);
	        click(forgetpassword);
	        return new ForgotPasswordPage(driver);
	    }

	    public AccountInfoPage clickEditAccountPage() {
	        return new AccountInfoPage(driver);
	    }


	    public AddproductPage clickAddItemsToShoppingCart() {
	        return new AddproductPage(driver);
	    }

	    public ProductPage clickSearchProduct() {
	        return new ProductPage(driver);
	    }

	    public CheckOutPage clickCheckoutCartItems() {
	        return new CheckOutPage(driver);
	    }
}
