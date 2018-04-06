package com.tae.training.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StarbucksLandingTestParameters {
	//Parámetros
	@Parameters({"Coffee", "Tea", "Menu", "Coffeehouse", "Social Impact", "Starbucks Rewards", "Blog", "Gift Cards"})
	@Test(groups = {"grupo1"})
	public void testStarbucksMenuParameters(String coffee, String tea, String menu, String coffeehouse, 
								  String socialImpact, String starbucksRewards, String blog,
								  String giftCards) {
		
		Assert.assertEquals(coffee, "COFFEE");
		Assert.assertEquals(tea, "TEA");
		Assert.assertEquals(menu, "MENU");
		Assert.assertEquals(coffeehouse, "COFFEEHOUSE");
		Assert.assertEquals(socialImpact, "SOCIAL IMPACT");
		Assert.assertEquals(starbucksRewards, "STARBUCKS REWARDS");
		Assert.assertEquals(blog, "BLOG");
		Assert.assertEquals(giftCards, "GIFT CARDS");
	}
}