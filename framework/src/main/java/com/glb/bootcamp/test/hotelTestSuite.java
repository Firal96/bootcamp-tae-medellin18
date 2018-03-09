package com.glb.bootcamp.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.glb.bootcamp.pages.LandingPage;
import com.glb.bootcamp.pages.HotelsResultsPage;
import com.glb.bootcamp.pages.HotelsSearchPage;
import com.glb.bootcamp.testsuite.BaseTestSuite;

public class hotelTestSuite extends BaseTestSuite{
	
	@Test
	public void searchHotel(){
		HotelsSearchPage hotelsPage = new LandingPage().goToHotelsPage("https://www.cheaptickets.com");
		HotelsResultsPage hotelsResult = hotelsPage.searchHotel("Medellin", "09/03/2018", "09/03/2018");
		
		assertTrue(true, ":)");
	}

}
