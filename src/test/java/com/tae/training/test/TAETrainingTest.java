package com.tae.training.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tae.training.pages.NavigationCoffeePage;
import com.tae.training.pages.TAETrainingStarbucksPage;

public class TAETrainingTest extends BaseTest {
	
	@Test(groups = {"grupo1"})
	public void testStarbucksInit() {
		TAETrainingStarbucksPage trainingTAEStarbucksPage = getTAETrainingStarbucksPage();
		NavigationCoffeePage navigationCoffeeObject = trainingTAEStarbucksPage.clickAction();
		Assert.assertEquals(navigationCoffeeObject.getImageHeader(), "All your favorites, all the time");
	}
	
	@Parameters({"stringA", "stringB"})
	@Test(groups = {"grupo1"})
	public void testStringConcat(String a, String b) {
		String concat=a+b;
		Assert.assertEquals(concat, "This is my first test automation practice");
	}
}
