package com.glb.bootcamp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.pageobject.PageObjectBase;

public class LandingPage extends PageObjectBase{
	
	@FindBy(id = "primary-header-hotel")
	WebElement hotelButton;
	
	
	
	public HotelsSearchPage goToHotelsPage(String url){
		goTo(url);
		hotelButton.click();
		return new HotelsSearchPage();
		
	}

}
