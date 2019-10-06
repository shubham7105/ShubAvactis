package com.avactis.sb.qa.testcases;

import com.avactis.sb.qa.base.ProjectBase;
import com.avactis.sb.qa.pages.HomePage;
import com.avactis.sb.qa.pages.LogInPage;
import com.avactis.sb.qa.pages.RegisterPage;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class LoginPageTest extends ProjectBase{
	LogInPage loginPage;
	HomePage homePage;
	RegisterPage registerPage;
	
	
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
	
	@Test(priority=2)
	public void loginTest() {
		homePage =loginPage.login(prop.getProperty("uname"), prop.getProperty("pass"));
	}
	
	@Test(priority=3, enabled=false)
	public void registerForm() {
		registerPage = loginPage.registerUser();
	}
	
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
