package com.glb.bootcamp.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.pageobject.PageObjectBase;

public class suggestionsDropdown extends PageObjectBase{
	
	@FindBy(className = "highlight")
	List<WebElement> dropDown;
	
	public void selectSuggestion() {
		dropDown.get(0).click();
	}

}
