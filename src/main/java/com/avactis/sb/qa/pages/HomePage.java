package com.avactis.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.avactis.sb.qa.base.ProjectBase;

public class HomePage extends ProjectBase{
	
	
	
	//Page Factory
	
	@FindBy(xpath="//h3//a[text()='Apparel']")
	WebElement apparelLink;
	
	@FindBy(xpath="//div[@class=\"header-navigation\"]//a[text()='Computers']")
	WebElement computerLink;
	
	@FindBy(xpath="//div[@class=\"header-navigation\"]//a[text()='DVD']")
	WebElement dvdLink;

	@FindBy(xpath="//div[@class=\"header-navigation\"]//a[text()='Furniture']")
	WebElement furnitureLink;
	
	@FindBy(xpath="//div[@class=\"header-navigation\"]//a[text()='Sport']")
	WebElement sportLink;
	
	@FindBy(xpath="//div[@class=\"header-navigation\"]//a[text()='Digital Distribution']")
	WebElement digitalDistributionLink;

	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public ApparelPage goToApparelPage() {
		wait.until(ExpectedConditions.visibilityOf(apparelLink)).click();
		return new ApparelPage();
	}
	
	public ComputersPage goToComputersPage() {
		computerLink.click();
		return new ComputersPage();
	}
	
	public DvdPage goToDVDPage() {
		dvdLink.click();
		return new DvdPage();
	}
	
	public SportPage goToSportPage() {
		sportLink.click();
		return new SportPage();
	}
	
	public FurniturePage goToFurniturePage() {
		furnitureLink.click();
		return new FurniturePage();
	}
	
	
	public DigitalDistributionPage goToDigitalDistributionPage() {
		digitalDistributionLink.click();
		return new DigitalDistributionPage();
	}
	
	
	
}


