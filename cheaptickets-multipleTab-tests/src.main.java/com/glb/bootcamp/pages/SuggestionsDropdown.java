package com.glb.bootcamp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.pageobject.PageObjectBase;
import com.glb.bootcamp.waits.Waits;

public class SuggestionsDropdown extends PageObjectBase{
	
	@FindBy(id="aria-option-0")
	WebElement option;
	
	@FindBy(id = "taHotelsResultsContainer")
	WebElement dropdown;
	
	
	public SuggestionsDropdown() {
		super();
		Waits.isVisible(option);
				
	}
	
	public void selectSuggestion() {
		option.click();
		
	}

}
