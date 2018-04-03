package com.tae.training.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StarbucksLandingTestDataProvider {
	//DataProvider
	@DataProvider(name = "Test Case 1 - Check Navigation Bar")
	public Object [][] createDataNavigationBar() {
		return new Object[][] {
			{ new String("COFFEE"), "COFFEE" },
			{ new String("TEA"), "TEA" },
			{ new String("MENU"), "MENU" },
			{ new String("COFFEEHOUSE"), "COFFEEHOUSE" },
			{ new String("SOCIAL IMPACT"), "SOCIAL IMPACT" },
			{ new String("STARBUCKS REWARDS"), "STARBUCKS REWARDS" },
			{ new String("BLOG"), "BLOG" },
			{ new String("GIFT CARDS"), "GIFT CARDS" },
			};
	}
	 
	@Test(dataProvider = "Test Case 1 - Check Navigation Bar")
	public void verifyNavigationBar(String dataSend, String result) {
		Assert.assertEquals(dataSend, result);
	}
}