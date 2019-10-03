package com.avactis.sb.qa.testcases;

import com.avactis.sb.qa.base.ProjectBase;
import com.avactis.sb.qa.pages.HomePage;
import com.avactis.sb.qa.pages.LogInPage;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class LoginPageTest extends ProjectBase{
	LogInPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		loginPage = new LogInPage();
	}
	
	@Test(priority=1)
	public void loginPageTitileTest() {
		String title =loginPage.validatePageTitile();
		Assert.assertEquals(title, "Avactis Demo Store");
		
	}
	
	//@Test(priority=2)
	public void logoImgTest() {
		boolean flag = loginPage.logoImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage =loginPage.login(prop.getProperty("uname"), prop.getProperty("pass"));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
