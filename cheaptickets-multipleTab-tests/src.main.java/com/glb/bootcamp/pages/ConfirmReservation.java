package com.glb.bootcamp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;

public class ConfirmReservation extends PageObjectBase{
	
	@FindBy(id = "pay-now-button")
	WebElement confirmationButton;
	
	public ConfirmReservation() {
		super();
		Waits.isVisible(confirmationButton);
	}
	
	public PaymentPage confirm(){
		confirmationButton.click();
		return new PaymentPage();
	}

}
