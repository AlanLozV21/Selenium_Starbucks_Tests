package com.tae.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TAETrainingStarbucksPage extends BasePage {
	private String STARBUCKS_URL = "https://www.starbucks.com/";
	
	public TAETrainingStarbucksPage(WebDriver webDriver) {
		super(webDriver);
		webDriver.get(STARBUCKS_URL);
	}
	
	@FindBy(id="nav")
	private WebElement navigationBar;
	
	@FindBy(id="nav_coffee")
	private WebElement navigationCoffeeButton;

	public NavigationCoffeePage clickAction() {
		getWait().until(ExpectedConditions.visibilityOf(navigationBar));
		navigationCoffeeButton.click();
		return new NavigationCoffeePage(getDriver());
	}
}
