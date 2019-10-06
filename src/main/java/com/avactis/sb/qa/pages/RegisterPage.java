package com.avactis.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.avactis.sb.qa.base.ProjectBase;

public class RegisterPage extends ProjectBase {

	@FindBy(xpath="//input[@name=\"customer_info[Customer][Email]\"]")
	public
	WebElement userEmail;
	
	@FindBy(xpath="customer_info[Customer][Password]")
	public
	WebElement userPass;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][RePassword]\"]")
	public
	WebElement confirmPass;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][FirstName]\"]")
	public
	WebElement fName;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][LastName]\"]")
	public
	WebElement lName;
	
	@FindBy(xpath="//select[@id=\"customer_info_Customer_Country\"]")
	public
	WebElement userCountry;
	
	@FindBy(xpath="//select[@id=\"customer_info_Customer_State\"]")
	public
	WebElement userState;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][ZipCode]\"]")
	public
	WebElement userZipCode;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][City]\"]")
	public
	WebElement userCity;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][Streetline1]\"]")
	public
	WebElement userAddress1;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][Streetline2]\"]")
	public
	WebElement userAddress2;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][Phone]\"]")
	public
	WebElement userContact;
	
	@FindBy(xpath="//input[@value=\"Register\"]")
	public
	WebElement registerbutton;
	
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public HomePage registerUser(String email, String password, String firstName, String lastname, String country, String state, 
			String zipcode, String city, String address1, String address2, String contact) {
		
		userEmail.clear();
		userEmail.sendKeys(email);
		
		userPass.clear();
		userPass.sendKeys(password);
		
		confirmPass.clear();
		confirmPass.sendKeys(password);
		
		fName.clear();
		fName.sendKeys(firstName);
		
		lName.clear();
		lName.sendKeys(lastname);
		
		Select select = new Select(userCountry);
		select.selectByVisibleText(country);
		
		Select selectState = new Select(userState);
		selectState.selectByVisibleText(state);
		
		userZipCode.clear();
		userZipCode.sendKeys(zipcode);
		
		userCity.clear();
		userCity.sendKeys(city);
		
		userAddress1.clear();
		userAddress1.sendKeys(address1);
		
		userAddress2.clear();
		userAddress2.sendKeys(address2);
		
		userContact.clear();
		userContact.sendKeys(contact);
		
		return new HomePage();
	}
	
}


