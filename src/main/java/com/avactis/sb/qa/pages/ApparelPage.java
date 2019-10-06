package com.avactis.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avactis.sb.qa.base.ProjectBase;

public class ApparelPage extends ProjectBase {
	
	
	//Page Factory
	
	@FindBy(xpath="//a//h3[text()=\"Avactis T-Shirt\"]")
	WebElement productone;
	
	
	public ApparelPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatePageTitile() {
		return driver.getTitle();
	}
	
	public ProductDetailPage gotoProductDetails(){
		
		productone.click();
		
		return new ProductDetailPage();
	}
	
}



