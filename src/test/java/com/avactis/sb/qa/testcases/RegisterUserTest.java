package com.avactis.sb.qa.testcases;

import org.testng.annotations.Test;

import com.avactis.sb.qa.base.ProjectBase;
import com.avactis.sb.qa.pages.HomePage;
import com.avactis.sb.qa.pages.LogInPage;
import com.avactis.sb.qa.pages.RegisterPage;
import com.avactis.sb.qa.util.TestUtil;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class RegisterUserTest extends ProjectBase {
		LogInPage loginPage;
		HomePage homePage;
		RegisterPage registerPage;
			
		public RegisterUserTest() {
			super();
		}
		
		@BeforeClass
		public void setUp() {
			initialization();
			loginPage = new LogInPage();
			registerPage = new RegisterPage();
		}
		
		
		@DataProvider
		public Iterator<Object[]> getTestData() {
			ArrayList<Object[]> testdata = TestUtil.getDataFromExcel();
			return testdata.iterator();
			
		}

		
		
		@Test(dataProvider="getTestData")
		public HomePage registerUserTest(String email, String password, String firstName, String lastname, String country, String state, 
				String zipcode, String city, String address1, String address2, String contact){
			
			
			registerPage.registerUser(email, password, firstName, lastname, country, state, zipcode, city, address1, address2, contact);
			return new HomePage();
		}
		
		
		
		//@Test
		/*public HomePage registerUserTest(String email, String password, String firstName, String lastname, String country, String state, 
				String zipcode, String city, String address1, String address2, String contact) {
			
			//enter Data
		
			registerPage.userEmail.clear();
			registerPage.userEmail.sendKeys(email);
			
			registerPage.userPass.clear();
			registerPage.userPass.sendKeys(password);
			
			registerPage.confirmPass.clear();
			registerPage.confirmPass.sendKeys(password);
			
			registerPage.fName.clear();
			registerPage.fName.sendKeys(firstName);
			
			registerPage.lName.clear();
			registerPage.lName.sendKeys(lastname);
			
			Select select = new Select(registerPage.userCountry);
			select.selectByVisibleText(country);
			
			Select selectState = new Select(registerPage.userState);
			selectState.selectByVisibleText(state);
			
			registerPage.userZipCode.clear();
			registerPage.userZipCode.sendKeys(zipcode);
			
			registerPage.userCity.clear();
			registerPage.userCity.sendKeys(city);
			
			registerPage.userAddress1.clear();
			registerPage.userAddress1.sendKeys(address1);
			
			registerPage.userAddress2.clear();
			registerPage.userAddress2.sendKeys(address2);
			
			registerPage.userContact.clear();
			registerPage.userContact.sendKeys(contact);
			
			registerPage.registerbutton.click();
			
			return new HomePage();
		}
*/		


}
