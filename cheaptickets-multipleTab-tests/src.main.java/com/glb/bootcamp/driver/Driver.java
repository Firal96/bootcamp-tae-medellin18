package com.glb.bootcamp.driver;

import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.glb.bootcamp.browser.Browsers;

/**
 * Driver container of {@link WebDriver} instance and the {@link Browsers} information.
 */
public final class Driver {

    private Browsers browsers;

    private WebDriver webDriver;

    private WebDriverWait webDriverWait;
    
    private FluentWait fluentWait;	

    /**
     * Default constructor.
     *
     * @param browsers  the browser information
     * @param webDriver the webdriver instance
     */
    public Driver(Browsers browsers, WebDriver webDriver) {
        this.browsers = browsers;
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 30);
        webDriverWait.pollingEvery(1, SECONDS)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NotFoundException.class);
        this.fluentWait = new FluentWait(webDriver)
        		.withTimeout(30, SECONDS)        		 
        	    .pollingEvery(1, SECONDS)        	 
        	    .ignoring(NoSuchElementException.class);
        this.webDriverWait = new WebDriverWait(webDriver, 30);
        	 
    }

    public Browsers getBrowserName() {
        return browsers;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }
    
    public FluentWait getFluentWait(){
    	return fluentWait;
    }

}
