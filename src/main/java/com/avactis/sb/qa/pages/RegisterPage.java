package com.avactis.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avactis.sb.qa.base.ProjectBase;

public class RegisterPage extends ProjectBase {

	@FindBy(xpath="//input[@name=\"customer_info[Customer][Email]\"]")
	WebElement userEmail;
	
	@FindBy(xpath="customer_info[Customer][Password]")
	WebElement userPass;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][RePassword]\"]")
	WebElement confirmPass;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][FirstName]\"]")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][LastName]\"]")
	WebElement lastName;
	
	@FindBy(xpath="//select[@id=\"customer_info_Customer_Country\"]")
	WebElement country;
	
	@FindBy(xpath="//select[@id=\"customer_info_Customer_State\"]")
	WebElement state;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][ZipCode]\"]")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][Streetline1]\"]")
	WebElement address1;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][Streetline2]\"]")
	WebElement address2;
	
	@FindBy(xpath="//input[@name=\"customer_info[Customer][Phone]\"]")
	WebElement contact;
	
	@FindBy(xpath="//input[@value=\"Register\"]")
	WebElement registerbutton;
	
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}


