package com.CraftVillaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class HomePage  {
WebDriver driver;
	



public HomePage(WebDriver driver2) {
	this.driver = driver2;
}

 
public void SearchBox()
         {
	              
	   WebElement SearchBOx1 = driver.findElement(By.xpath("//input[@id='searchval']"));
	   SearchBOx1.sendKeys("Saree");
	        
	                                                                     
	  WebElement Magnifingicon = driver.findElement(By.xpath("//i[@class='icon cv-search']"));
	  Magnifingicon.click();
     
	  	WebElement firstsaree= driver.findElement(By.xpath("//img[@src='https://img6.craftsvilla.com/image/upload/w_300,h_450/C/V/CV-36267-MCRAF88922597130-1562745721-Craftsvilla_1.jpg']"));
	 firstsaree.click();
	
}







	
	
}

