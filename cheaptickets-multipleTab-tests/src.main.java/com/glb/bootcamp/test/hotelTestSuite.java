package com.glb.bootcamp.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.glb.bootcamp.driver.Driver;
import com.glb.bootcamp.pages.HotelsResultsPage;
import com.glb.bootcamp.pages.HotelsSearchPage;
import com.glb.bootcamp.pages.LandingPage;
import com.glb.bootcamp.pages.PaymentPage;
import com.glb.bootcamp.testsuite.BaseTestSuite;

public class hotelTestSuite extends BaseTestSuite{
	
	@Test
	public void searchHotel(){
		SoftAssert softAssert = new SoftAssert();
		HotelsSearchPage hotelsPage = new LandingPage().goToHotelsPage("https://www.cheaptickets.com");
		HotelsResultsPage hotelsResult = hotelsPage.searchHotel("Medellin", "1","0");
		PaymentPage paymentPage = hotelsResult.pickHotel();
		softAssert.assertTrue(Driver.windowsSet().size() > 1);
		softAssert.assertTrue(paymentPage.checkPaymentFields());
		softAssert.assertAll();
	}
}
