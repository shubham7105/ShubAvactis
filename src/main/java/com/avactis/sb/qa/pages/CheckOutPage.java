package com.avactis.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.avactis.sb.qa.base.ProjectBase;

public class CheckOutPage extends ProjectBase{
	
	//Page Factory
	
	@FindBy(xpath="//input[@name=\"checkbox_shipping_same_as_billing\"]")
	WebElement shippingchkbox;
	
	@FindBy(xpath="//input[@name=\"full_tax_exempt_status\"]")
	WebElement taxExempt;
	
	@FindBy(xpath="//input[@value=\"Continue Checkout\" and contains(@onclick,\"submitStep(1)\")]")
	WebElement checkoutButton1;
	
	@FindBy(xpath="//a[text()=\"Continue Shopping\"]")
	WebElement continueShopping;
	
	@FindBy(xpath="//label[text()=\" Delivery on Next Business Day\"]//input[@name=\"shippingModuleAndMethod[method_code]\"]")
	WebElement shippingOption;
	
	@FindBy(xpath="//input[@value=\"Continue Checkout\" and contains(@onclick,\"submitStep(2);\")]")
	WebElement checkOutButton2;
	
	@FindBy(xpath="//input[@value=\"Place Order\"]")
	WebElement placeOrderButton;
	
	public CheckOutPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatePageTitile() {
		return driver.getTitle();
	}
	
	
	public OrderDetailsPage usercheckOut() {
		shippingchkbox.click();
		taxExempt.click();
		checkoutButton1.click();
		wait.until(ExpectedConditions.visibilityOf(shippingOption)).click();
		
		checkOutButton2.click();
		wait.until(ExpectedConditions.visibilityOf(placeOrderButton)).click();
		
		return new OrderDetailsPage();
	}
	
	public void backToShopping() {
		continueShopping.click();
	}
	
	 
	
	
}
