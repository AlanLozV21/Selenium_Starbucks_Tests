package com.tae.training.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
	
	private WebDriver driver;
	
	public MyDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/oscar.lozada/Drivers/GoogleChrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
}