package com.avactis.sb.qa.testcases;

import org.testng.annotations.Test;

import com.avactis.sb.qa.base.ProjectBase;
import com.avactis.sb.qa.pages.CheckOutPage;
import com.avactis.sb.qa.pages.OrderDetailsPage;

import org.testng.annotations.BeforeClass;

public class CheckOutPageTest extends ProjectBase{
	
	CheckOutPage checkOutPage;
	OrderDetailsPage orderDetailsPage;
	
	 public CheckOutPageTest() {
			super();
		}
	
	 
	 @BeforeClass
	  public void beforeClass() {
		 checkOutPage = new CheckOutPage();
	  }
	
	 @Test(priority=1)
	 public void verifyTitile() {
		 checkOutPage.validatePageTitile();
	  }
 
	 @Test(priority=2)
	 public void checkOut() {
		 orderDetailsPage = checkOutPage.usercheckOut();
	  }
	 
	 @Test(priority=1, enabled=false)
	 public void useShopping() {
		 checkOutPage.backToShopping();
	  }
	 
	
}
