package com.glb.bootcamp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glb.bootcamp.pageobject.PageObjectBase;

public class ChildrenAgePicker extends PageObjectBase{
	
	@FindBy (id="hotel-1-age-select-1")
	WebElement child1;
	
	@FindBy (id="hotel-1-age-select-2")
	WebElement child2;
	
	public void pickKidsAge(){
		selectByText(this.child1, "1");
		selectByText(this.child2, "2");
	}

}
