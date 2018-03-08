package com.globant.bootcamp.twitter.pages;

import com.globant.bootcamp.twitter.driver.Drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "global-new-tweet-button")
    private WebElement newTweetButton;
    
    @FindBy(id = "tweet-box-home-timeline")
    private WebElement tweetBox;
    
    @FindBy(className="tweet-action")
    private List<WebElement> tweetButton;

    public HomePage() {
        PageFactory.initElements(Drivers.getDriver(), this);
    }

    public boolean hasTweetButton() {
        return newTweetButton.isDisplayed() && newTweetButton.isEnabled();
    }
    
    public boolean hasNewPost(){
    	WebElement newPost = Drivers.getDriver().findElement(By.className("my-tweet"));
    	return newPost.isDisplayed();
    }
    
    public void post(String tweet){
    	tweetBox.sendKeys(tweet);
    	tweetButton.get(0).click();
    }
}
