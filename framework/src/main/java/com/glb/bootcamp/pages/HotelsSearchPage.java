package com.glb.bootcamp.pages;

import java.util.List;

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
	
	WebElement initDate;
	
	WebElement endDate;
	
	@FindBy(className = "icon-calendar")
	List<WebElement> calendars;
	
	
//	HotelsSearchPage(){
//		super();
//		Waits.isClickable(initDate);
//		Waits.isClickable(endDate);
//	}
	
	public HotelsResultsPage searchHotel(String ciudad,String checkin, String checkout){
		//TODO Implement check dropdown boxes;
		
		/*checkInInput.sendKeys(checkin);
		checkOutOption.sendKeys(checkout);		
		*/
		calendars.get(0).click();
		initDate = getDriver().getWebDriver().findElement(By.className("start"));
		clickOn(initDate);
		calendars.get(1).click();
		initDate = getDriver().getWebDriver().findElement(By.className("end"));
		clickOn(endDate);
		hotelInput.sendKeys(ciudad);
		searchButton.click();
		return new HotelsResultsPage();
	}

}
