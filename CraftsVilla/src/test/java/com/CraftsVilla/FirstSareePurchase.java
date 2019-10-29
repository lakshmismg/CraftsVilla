package com.CraftsVilla;


import org.testng.annotations.Test;

import com.CraftVillaPages.HomePage;



public class FirstSareePurchase extends BaseClass {

	

	
		

		@Test
	public void SareePurchase()  
	{
			
		HomePage hpage = new HomePage(driver);
	
		hpage.SearchBox();

	}
	}
	

