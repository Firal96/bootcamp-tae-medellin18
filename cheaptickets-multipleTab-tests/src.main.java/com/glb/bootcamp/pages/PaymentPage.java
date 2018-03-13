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
	WebElement cardSecurityCode;
	
	@FindBy(className = "pwp-insurance-zipcode")
	WebElement cardZip;
	
	
	
	public PaymentPage() {
		super();
		Waits.isVisible(cardNumber);
		Waits.isVisible(cardHolderName);
		Waits.isVisible(cardMonth);		
		Waits.isVisible(cardSecurityCode);
		Waits.isVisible(cardYear);
		Waits.isVisible(cardZip);
	}
	
	public boolean cardNumberVisible(){
		return cardNumber.isDisplayed();
	}
	
	public boolean cardHolderNameVisible(){
		return cardHolderName.isDisplayed();
	}
	
	public boolean cardMonthVisible(){
		return cardMonth.isDisplayed();
	}
	
	public boolean cardSecurityCodeVisible(){
		return cardSecurityCode.isDisplayed();
	}
	
	public boolean cardYearVisible(){
		return cardYear.isDisplayed();
	}
	
	public boolean cardZipVisible(){
		return cardZip.isDisplayed();
	}

}
