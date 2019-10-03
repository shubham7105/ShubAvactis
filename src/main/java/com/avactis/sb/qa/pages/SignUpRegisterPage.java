package com.avactis.sb.qa.pages;

import com.avactis.sb.qa.base.ProjectBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpRegisterPage extends ProjectBase {

	@FindBy(xpath ="//span/a[contains(text(),'Sign In')]")
	WebElement signIn;
	
	
	
	public SignUpRegisterPage () {
		
		PageFactory.initElements(driver, this);
	}
	
}
