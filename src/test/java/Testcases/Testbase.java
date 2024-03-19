package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Library.TestData;
import Pages.HomePage;

public class Testbase extends TestData {
	  protected HomePage homePage;
	    WebDriver driver;

	    @BeforeMethod
	    public void setUpChromeDriver() {
	        driver = new ChromeDriver();
	        goHome();
	    }


	    public void goHome() {
	        driver.get("https://magento.softwaretestingboard.com/");
	        driver.manage().window().maximize();
	        homePage = new HomePage(driver);
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
