package com.glb.bootcamp.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.driver.Driver;
import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;

public class HotelsResultsPage extends PageObjectBase {
	
	@FindBy(className = "section-header-main")
	WebElement title;
	
	@FindBy(className = "flex-link")
	List<WebElement> results;
	
	@FindBy(id = "inpHotelNameMirror")
	WebElement searchBar;
	
	@FindBy(className = "hotelNameFilterBtn")
	WebElement goButton;
	
	
	
	public HotelsResultsPage() {
		super();
		Waits.isVisible(title);
		Waits.isVisible(searchBar);
	}
	
	/**
	 * Checks that info displayed in the page is correct
	 * @param cityExpected
	 * @return
	 */
	
	
	public boolean resultsDisplayed(String cityExpected){
		if(title.isDisplayed()){
			String content = title.getAttribute("innerHTML");
			if(content.contains(cityExpected) && results.size() > 0){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Search for a specific hotel
	 * @param desiredHotel = The hotel you want to lookup
	 * @return
	 * @throws InterruptedException 
	 */

	public HotelsResultsPage searchHotel(String desiredHotel) throws InterruptedException {
		searchBar.sendKeys(desiredHotel);
		SuggestionsDropdown dropdown = new SuggestionsDropdown();
		dropdown.selectSuggestion();
		goButton.click();
		Thread.sleep(1000);
		return new HotelsResultsPage();
	}
	
	public boolean hotelDisplayed(String hotelName){
		String resultLink = results.get(0).getAttribute("href");
		boolean ok = resultLink.contains(hotelName);
		return ok;
	}

	public PaymentPage pickHotel() {
		results.get(0).click();
		Driver.switchTab();		
		ReservationPage reservationPage = new ReservationPage();
		return reservationPage.bookRoom();		
		
	}

}
