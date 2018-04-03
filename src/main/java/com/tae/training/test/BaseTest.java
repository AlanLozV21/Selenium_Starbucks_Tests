package com.tae.training.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.tae.training.pages.StarbucksLandingPage;
import com.tae.training.pages.TAETrainingStarbucksPage;
import com.tae.training.util.MyDriver;

public class BaseTest {
	MyDriver myDriver;
	
	private StarbucksLandingPage starbucksLandingObject;
	private TAETrainingStarbucksPage objectTAETrainingStarbucksPage;
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser"})
	
	public void beforeSuite() {
		myDriver = new MyDriver();
		starbucksLandingObject = new StarbucksLandingPage(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		starbucksLandingObject.dispose();
	}
	
	public StarbucksLandingPage getStarbucksLandingPage() {
		return starbucksLandingObject;
	}
	
	public TAETrainingStarbucksPage getTAETrainingStarbucksPage( ) {
		return objectTAETrainingStarbucksPage;
	}

}