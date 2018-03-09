package com.glb.bootcamp.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;

public class HotelsSearchPage extends PageObjectBase{
	
	@FindBy(id = "hotel-destination")
	WebElement hotelInput;
	
	@FindBy(id = "hotel-checkin")
	WebElement checkInInput;
	
	@FindBy(id = "hotel-checkout")
	WebElement checkOutOption;
	
	@FindBy(id = "search-button")
	WebElement searchButton;
	
	@FindBy(className = "start")
	WebElement initDate;
	
	@FindBy(className = "end")
	WebElement endDate;
	
	@FindBy(className = "icon-calendar")
	ArrayList<WebElement> calendars;
	
	
	HotelsSearchPage(){
		super();
		Waits.isClickable(initDate);
		Waits.isClickable(endDate);
	}
	
	public HotelsResultsPage searchHotel(String ciudad,String checkin, String checkout){
		//TODO Implement check dropdown boxes;
		hotelInput.sendKeys(ciudad);
		/*checkInInput.sendKeys(checkin);
		checkOutOption.sendKeys(checkout);		
		*/
		calendars.get(0).click();
		initDate.click();
		calendars.get(1).click();
		endDate.click();
		return new HotelsResultsPage();
	}

}
