package com.tae.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	public void loadPage() {
		getWait().until(ExpectedConditions.visibilityOf(navigationBar));
	}
}