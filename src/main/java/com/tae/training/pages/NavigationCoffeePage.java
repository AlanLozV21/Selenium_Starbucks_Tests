package com.tae.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationCoffeePage extends BasePage {

	public NavigationCoffeePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(xpath="//*[@id='Hero']/ul/li/div[2]/div/div/h1")
	private WebElement imageHeader;
	
	public String getImageHeader() {
		return imageHeader.getText();
	}
}