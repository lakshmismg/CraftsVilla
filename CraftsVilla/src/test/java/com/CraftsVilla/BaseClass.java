package com.CraftsVilla;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;


public class BaseClass {
WebDriver driver;
Properties prop;
@BeforeMethod
	public void loginpage(@Optional("Chrome") String browser) throws Exception
	{
		
			FileInputStream fr = new FileInputStream("C:\\Users\\Lakshmi\\JavaSelenium\\WordPress\\src\\test\\resource\\config.properties");
				 prop = new Properties();
				prop.load(fr);
				
				
		String chromeDriverType =prop.getProperty("chromeDriverType");                 
		String chromeDriverPath= prop.getProperty("chromeDriverPath");
	      
		String FirefoxDriverType= prop.getProperty("FirefoxDriverType");
	      String FirefoxDriverPath = prop.getProperty("FirefoxDriverPath");
	      
				
		if (browser.equalsIgnoreCase("chrome"))
		{	
		    System.setProperty(chromeDriverType,chromeDriverPath);
	         driver = new ChromeDriver();
	         
		}else if (browser.equalsIgnoreCase("Firefox"))
		{
	      System.setProperty(FirefoxDriverType,FirefoxDriverPath);
	      driver = new FirefoxDriver();
	      
		}
	     
		
		driver.get("https://www.Craftsvilla.com");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	      //System.out.println(driver.getPageSource());
	      System.out.println(driver.getWindowHandle());
	      
	      System.out.println(driver.getClass());
	      
	      
	      
		}

	
}	
	
	
	

