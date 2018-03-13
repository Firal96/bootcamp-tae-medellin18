package com.glb.bootcamp.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.glb.bootcamp.driver.Driver;
import com.glb.bootcamp.pages.HotelsResultsPage;
import com.glb.bootcamp.pages.HotelsSearchPage;
import com.glb.bootcamp.pages.LandingPage;
import com.glb.bootcamp.pages.PaymentPage;
import com.glb.bootcamp.testsuite.BaseTestSuite;

public class HotelTestSuite extends BaseTestSuite{
	
	@Test
	public void searchHotel(){
		SoftAssert softAssert = new SoftAssert();
		HotelsSearchPage hotelsPage = new LandingPage().goToHotelsPage("https://www.cheaptickets.com");
		HotelsResultsPage hotelsResult = hotelsPage.searchHotel("Medellin", "1","0");
		PaymentPage paymentPage = hotelsResult.pickHotel();
		softAssert.assertTrue(Driver.windowsSet().size() > 1);
		softAssert.assertTrue(paymentPage.cardHolderNameVisible());
		softAssert.assertTrue(paymentPage.cardMonthVisible());
		softAssert.assertTrue(paymentPage.cardNumberVisible());
		softAssert.assertTrue(paymentPage.cardSecurityCodeVisible());
		softAssert.assertTrue(paymentPage.cardYearVisible());
		softAssert.assertTrue(paymentPage.cardZipVisible());
		softAssert.assertAll();
	}
}
