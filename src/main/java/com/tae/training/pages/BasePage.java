package com.tae.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public BasePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		wait = new WebDriverWait(webDriver, 10);
		driver = webDriver;
	}

	protected WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}
	
	public void dispose() {
		if(driver != null) {
			driver.quit();
		}
	}
}