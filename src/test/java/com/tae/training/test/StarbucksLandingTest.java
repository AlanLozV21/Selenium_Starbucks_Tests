package com.tae.training.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tae.training.pages.StarbucksLandingPage;

public class StarbucksLandingTest extends BaseTest {
	//Object Properties
	@Test
	public void testStarbucksMenuProperties() {
		File objectFile = new File("C:/Users/oscar.lozada/eclipse-workspace/TAETraining/src/main/java/com/tae/training/util/Object.properties");
		FileInputStream fileInput = null;
		StarbucksLandingPage starbucksLandingPage = getStarbucksLandingPage();
		starbucksLandingPage = new StarbucksLandingPage(myDriver.getDriver());
		try {
			fileInput = new FileInputStream(objectFile);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Assert.assertEquals("COFFEE", myDriver.getDriver().findElement(By.id(prop.getProperty("NavigationCoffeeTab"))).getText());
		Assert.assertEquals("TEA", myDriver.getDriver().findElement(By.id(prop.getProperty("NavigationTeaTab"))).getText());
		Assert.assertEquals("MENU", myDriver.getDriver().findElement(By.id(prop.getProperty("NavigationMenuTab"))).getText());
		Assert.assertEquals("COFFEEHOUSE", myDriver.getDriver().findElement(By.id(prop.getProperty("NavigationCoffeehouseTab"))).getText());
		Assert.assertEquals("SOCIAL IMPACT", myDriver.getDriver().findElement(By.id(prop.getProperty("NavigationSocialImpactTab"))).getText());
		Assert.assertEquals("STARBUCKS REWARDS", myDriver.getDriver().findElement(By.id(prop.getProperty("NavigationStarbucksRewardsTab"))).getText());
		Assert.assertEquals("BLOG", myDriver.getDriver().findElement(By.id(prop.getProperty("NavigationBlogTab"))).getText());
		Assert.assertEquals("GIFT CARDS", myDriver.getDriver().findElement(By.id(prop.getProperty("NavigationGiftCardsTab"))).getText());
	}
}