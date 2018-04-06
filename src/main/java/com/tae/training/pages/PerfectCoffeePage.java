package com.tae.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PerfectCoffeePage extends BasePage {
	
	public PerfectCoffeePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(id="questions-container")
	private WebElement questionContainerElement;
	
	public void loadPage() {
		getWait().until(ExpectedConditions.visibilityOf(questionContainerElement));
	}
}