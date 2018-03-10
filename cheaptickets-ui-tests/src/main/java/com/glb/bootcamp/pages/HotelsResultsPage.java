package com.glb.bootcamp.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;

public class HotelsResultsPage extends PageObjectBase {
	
	@FindBy(className = "section-header-main")
	WebElement title;
	
	@FindBy(className = "flex-link")
	List<WebElement> results;
	
	@FindBy(id = "inpHotelNameMirror")
	WebElement searchBar;
	
	
	/**
	 * Checks that info displayed in the page are correct
	 * @param cityExpected
	 * @return
	 */
	
	public HotelsResultsPage() {
		super();
		Waits.isVisible(title);
		Waits.isVisible(searchBar);
	}
	
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
	 */

	public HotelsResultsPage searchHotel(String desiredHotel) {
		searchBar.sendKeys(desiredHotel);
		suggestionsDropdown dropdown = new suggestionsDropdown();
		dropdown.selectSuggestion();
		return new HotelsResultsPage();
	}
}
