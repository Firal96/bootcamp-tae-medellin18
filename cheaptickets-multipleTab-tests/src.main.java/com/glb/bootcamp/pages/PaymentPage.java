package com.glb.bootcamp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;

public class PaymentPage extends PageObjectBase{
	
	
	@FindBy(className = "cardholder-above-cardname")
	WebElement cardHolderName;
	
	@FindBy(id= "creditCardInput")
	WebElement cardNumber;
	
	@FindBy(className = "cc-expiry-month")
	WebElement cardMonth;
	
	@FindBy(className = "cc-expiry-year")
	WebElement cardYear;
	
	@FindBy(id = "new_cc_security_code")
	WebElement cardsecurityCode;
	
	@FindBy(className = "pwp-insurance-zipcode")
	WebElement cardZip;
	
	
	
	public PaymentPage() {
		super();
		Waits.isVisible(cardNumber);
		Waits.isVisible(cardHolderName);
		Waits.isVisible(cardMonth);		
		Waits.isVisible(cardsecurityCode);
		Waits.isVisible(cardYear);
		Waits.isVisible(cardZip);
	}

	public boolean checkPaymentFields() {
		return cardHolderName.isDisplayed() && cardMonth.isDisplayed() && cardNumber.isDisplayed() 
				&& cardsecurityCode.isDisplayed() && cardYear.isDisplayed() && cardZip.isDisplayed();
	}
	

}
