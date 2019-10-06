package com.avactis.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avactis.sb.qa.base.ProjectBase;

public class ProductDetailPage extends ProjectBase {

	//Page Factory
	
	@FindBy(xpath="//input[@value=\"Add To Cart\"]")
	WebElement addCartButton;
	
	@FindBy(xpath="//div[@class=\"top-cart-block\"]")
	WebElement userCart;
	
	@FindBy(xpath="//a[text()=\"Checkout\" and  @class=\"btn btn-primary\"]")
	WebElement checkOut;
	
	public ProductDetailPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatePageTitile() {
		return driver.getTitle();
	}
	
	
	public void addtoCart() {
		addCartButton.click();
	}
	
	public void seeTheCart() {
		builder.moveToElement(userCart).build().perform();
	}
	
	public CheckOutPage checkOutCart() {
		checkOut.click();
	
		return new CheckOutPage();
	}
}
