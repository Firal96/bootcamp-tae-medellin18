package com.glb.bootcamp.pages;

import java.util.Calendar;
import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.driver.Driver;
import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;
import static com.glb.bootcamp.driver.Drivers.getDriver;

public class HotelsSearchPage extends PageObjectBase{
	
	@FindBy(id = "hotel-destination")
	WebElement hotelInput;
	
	@FindBy(id = "hotel-checkin")
	WebElement checkInInput;
	
	@FindBy(id = "hotel-checkout")
	WebElement checkOutOption;
	
	@FindBy(id = "search-button")
	WebElement searchButton;
	
	@FindBy(className = "icon-calendar")
	List<WebElement> calendars;
	
	@FindBy(id = "hotel-1-adults")
	WebElement adults;
	
	@FindBy(id = "hotel-1-children")
	WebElement children;
	
	
//	HotelsSearchPage(){
//		super();
//		Waits.isClickable(initDate);
//		Waits.isClickable(endDate);
//	}
	
	
	/**
	 *  Method for uploading information in the searchHotelPage, the checkIn date is current day plus 30 days and checkout date
	 *  is checkIn date plus 1
	 * @param city = city of destination
	 * @param adults = number of Adults
	 * @param children = number of children
	 * @return
	 */
	public HotelsResultsPage searchHotel(String city,String adults, String children){
		calendars.get(0).click();
		Calendar currentDay = Calendar.getInstance();
		CalendarPicker initDate = new CalendarPicker();
		Calendar checkInDay = Calendar.getInstance();
		checkInDay.add(Calendar.DATE, 30);
		initDate.pickDate(currentDay, checkInDay);
		calendars.get(1).click();
		CalendarPicker endDate = new CalendarPicker();
		Calendar checkOutDay = Calendar.getInstance();
		checkOutDay.add(Calendar.DATE, 31);
		endDate.pickDate(checkInDay, checkOutDay);
		hotelInput.sendKeys(city);		
		selectByText(this.adults, adults);
		selectByText(this.children, children);
		searchButton.click();
		return new HotelsResultsPage();
	}
	
	
	

}
