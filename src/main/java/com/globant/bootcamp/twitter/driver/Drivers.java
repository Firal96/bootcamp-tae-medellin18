package com.globant.bootcamp.twitter.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * This is NOT the final solution.
 */
public class Drivers {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            driver = new ChromeDriver(options);           
            driver.manage().window().fullscreen();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
            driver.get("https://twitter.com/");
            
            WebElement we = driver.findElement(By.tagName("html"));
            we.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        }
        return driver;
    }

    public static void quit(){
        driver.quit();
    }

}
