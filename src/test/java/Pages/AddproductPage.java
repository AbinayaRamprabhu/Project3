package Pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Library.Baseclass;

public class AddproductPage extends Baseclass{
	  private final By whatisnewbutton = new By.ByCssSelector("#ui-id-2 > li.level0.nav-1.category-item.first.level-top.ui-menu-item");
	    private final By hoodiessweatshirts_women___whatsnew = new By.ByXPath("//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[1]/a");
	    private final By mennavigation = new By.ByCssSelector("a[id='ui-id-5'] span:nth-child(2)");
	    private final By mentops = new By.ById("ui-id-17");
	    private final By mentopsjackets = new By.ById("ui-id-19");
	    @SuppressWarnings("static-access")
		public AddproductPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public WhatsNewpage clickAddMultiItem_from_WomenStore_WhatIsNew() {

	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        wait.until(ExpectedConditions.presenceOfElementLocated(whatisnewbutton));

	        click(whatisnewbutton);

	        click(hoodiessweatshirts_women___whatsnew);
	        return new WhatsNewpage(driver);
	    }


	    private void click(By whatisnewbutton2) {
			// TODO Auto-generated method stub
			
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		public NavigatePage clickAddItemsToShoppingCart_NavigationBar() {

	        Actions actions = new Actions(driver);

	        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

	        wait.until(ExpectedConditions.presenceOfElementLocated(mennavigation));
	        actions.moveToElement(driver.findElement(mennavigation)).perform();

	        wait.until(ExpectedConditions.presenceOfElementLocated(mentops));
	        actions.moveToElement(driver.findElement(mentops)).perform();

	        wait.until(ExpectedConditions.presenceOfElementLocated(mentopsjackets));
	        actions.moveToElement(driver.findElement(mentopsjackets)).perform();

	        click(mentopsjackets);

	        return new NavigatePage(driver);
	    }


}
