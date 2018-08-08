package com.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest 
{
    @Test
    public void testLogin(){
    	WebDriver driver=new FirefoxDriver();
    	driver.get("http://way2automation.com");
    	driver.quit();
    	
    			
    }
    
}
