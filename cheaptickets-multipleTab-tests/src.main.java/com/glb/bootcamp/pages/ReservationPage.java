package com.glb.bootcamp.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;

public class ReservationPage extends PageObjectBase{
	
	@FindBy(className = "book-button")
	List<WebElement> bookButtons;
	
	@FindBy(id = "mock-book-button")
	WebElement reservationButton;
	
	ReservationPage(){
		super();
		Waits.isClickable(reservationButton);
	}

	public PaymentPage bookRoom(){
		// TODO Auto-generated method stub
		bookButtons.get(0).click();
		return new ConfirmReservation().confirm();
		
	}

}
