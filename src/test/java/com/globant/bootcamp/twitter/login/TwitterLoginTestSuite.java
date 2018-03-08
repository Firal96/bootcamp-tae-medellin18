package com.globant.bootcamp.twitter.login;

import com.globant.bootcamp.twitter.pages.HomePage;
import com.globant.bootcamp.twitter.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.globant.bootcamp.twitter.driver.Drivers.quit;
import static org.testng.Assert.assertTrue;

/**
 * TwitterLoginTestSuite represents a suite of tests to verify the Login functionality.
 */
public class TwitterLoginTestSuite {
	
	HomePage homePage;

    /**
     * Tear down method.
     * Close the session
     */
    @AfterMethod
    public void tearDown() {
       // quit();
    }

    @Test
    public void testSuccessfulLogin() {
        homePage = new LoginPage().login("danielgiraldo9612@gmail.com", "careculo96");
        assertTrue(homePage.hasTweetButton(), ":)");
    }
    
    @Test
    public void testSuccessfulPosting(){
    	homePage.post("tweet automático");
    	assertTrue(homePage.hasNewPost());
    	quit();
    }
    


}
