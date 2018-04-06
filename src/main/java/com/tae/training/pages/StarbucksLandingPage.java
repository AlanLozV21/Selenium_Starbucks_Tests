package com.tae.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StarbucksLandingPage extends BasePage {
	private String STARBUCKS_URL = "https://www.starbucks.com/";
	
	public StarbucksLandingPage(WebDriver webDriver) {
		super(webDriver);
		webDriver.get(STARBUCKS_URL);
	}
		
	@FindBy(id="nav")
	private WebElement navigationBar;
	
	@FindBy(id="nav_coffee")
	private WebElement navigationCoffeeTab;
	
	Actions builder = new Actions(getDriver());
	Action mouseOverCoffeeTab = builder.moveToElement(navigationCoffeeTab).build();
	
	public void loadPage() {
		getWait().until(ExpectedConditions.visibilityOf(navigationBar));
		mouseOverCoffeeTab.perform();
	}
	
	public PerfectCoffeePage findYourPerfectCoffeeAction() {
		return new PerfectCoffeePage(getDriver());
	}
}