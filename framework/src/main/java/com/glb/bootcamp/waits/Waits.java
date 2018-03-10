package com.glb.bootcamp.waits;

import static com.glb.bootcamp.driver.Drivers.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Waits supports the explicit waiting operation, using {@link WebDriverWait} and {@link ExpectedConditions}.
 */
public final class Waits {

    /**
     * Verifies if an element is clickable before clicking on it.
     *
     * @param webElement the {@link WebElement}
     * @return the {@link WebElement}
     */
    public static WebElement isClickable(WebElement webElement) {
//        return waiting().until(elementToBeClickable(webElement));
    	return waiting().until(elementToBeClickable(webElement));
    }

    /**
     * Verifies if an element is visible before interacting with it.
     *
     * @param webElement the {@link WebElement}
     * @return the {@link WebElement}
     */
    public static WebElement isVisible(WebElement webElement) {
        return waiting().until(visibilityOf(webElement));
    }

    private static WebDriverWait waiting() {
        return getDriver().getWebDriverWait();
    }
    
//    private static FluentWait waitingFluent(){
//    	return getDriver().getFluentWait();
//    }
//    private static WebElement waitingl(WebElement webElement) {
//    	return getDriver().getFluentWait().until(elementToBeClickable(webElement));
//    }
}
