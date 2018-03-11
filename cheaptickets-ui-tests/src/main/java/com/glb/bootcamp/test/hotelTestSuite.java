package com.glb.bootcamp.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.glb.bootcamp.pages.HotelsResultsPage;
import com.glb.bootcamp.pages.HotelsSearchPage;
import com.glb.bootcamp.pages.LandingPage;
import com.glb.bootcamp.testsuite.BaseTestSuite;

public class hotelTestSuite extends BaseTestSuite{
	
	@Test
	public void searchHotel() throws InterruptedException{
		SoftAssert softAssert = new SoftAssert();
		HotelsSearchPage hotelsPage = new LandingPage().goToHotelsPage("https://www.cheaptickets.com");
		HotelsResultsPage hotelsResult = hotelsPage.searchHotel("Medellin", "2","2");		
		softAssert.assertTrue(hotelsResult.resultsDisplayed("Medellin"));
		HotelsResultsPage hotelsSearch = hotelsResult.searchHotel("Sky");	
		softAssert.assertTrue(hotelsSearch.hotelDisplayed("Sky"));
		softAssert.assertAll();
	}

}
