package com.glb.bootcamp.pages;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.driver.Driver;
import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;

public class CalendarPicker extends PageObjectBase{
	
	@FindBy(className = "datepicker-day-number")
	List<WebElement> dates;
	
	@FindBy(className = "datepicker-next")
	WebElement nextMonth;
	
	@FindBy(tagName = "tbody")
	WebElement calBody;
	
	CalendarPicker(){
		super();
		Waits.isVisible(calBody);
	}
	
	/**
	 * Picks a date in the Calendar dropdown
	 * @param originDate
	 * @param desiredDate
	 */
	
	public void pickDate(Calendar originDate, Calendar desiredDate){
		int years = desiredDate.get(Calendar.YEAR) - originDate.get(Calendar.YEAR);
		int months = desiredDate.get(Calendar.MONTH) - originDate.get(Calendar.MONTH);
		int monthsDifference = years*12 + months;
		for (int i = 0; i < monthsDifference; i++) {
			nextMonth.click();			
		}
		int day = desiredDate.get(Calendar.DAY_OF_MONTH);
		dates.get(day-1).click();
	}
	
	

}
