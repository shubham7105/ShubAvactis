package com.avactis.sb.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.avactis.sb.qa.base.ProjectBase;
import com.avactis.sb.qa.pages.ApparelPage;
import com.avactis.sb.qa.pages.HomePage;

public class UserHomePageTest extends ProjectBase {
	
	HomePage homePage;
	ApparelPage apparelPage;
	
	public UserHomePageTest() {
		super();
	}
	
	
	@BeforeClass
	public void setUp() {
		
		homePage = new HomePage();
	}
	
	
	
  @Test
  public void apparelStroe () {
	  apparelPage =   homePage.goToApparelPage();
	  
  }
  
}
