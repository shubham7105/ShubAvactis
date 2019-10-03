package com.avactis.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avactis.sb.qa.base.ProjectBase;

public class LogInPage extends ProjectBase {
	
	//Page Factory
	
	@FindBy(id="sign_in_box_email")
	WebElement userEmail;
	
	@FindBy(id="sign_in_box_password")
	WebElement userPass;
	
	@FindBy(xpath="//input[@type=\"submit\" and @value=\"Sign In\"]")
	WebElement logInButton;
	
	@FindBy(xpath="//a[text()=Register")
	WebElement RegisterLink;

	@FindBy(xpath="//a[@class=site-logo]")
	WebElement avactisLogo;
	
	public LogInPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatePageTitile() {
		return driver.getTitle();
	}
	
	public boolean logoImage() {
		return avactisLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pass) {
		userEmail.sendKeys(un);
		userPass.sendKeys(pass);
		logInButton.click();
		
		return new HomePage();
	}
	
	
	
}


