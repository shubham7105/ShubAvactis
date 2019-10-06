package com.avactis.sb.qa.testcases;

import org.testng.annotations.Test;

import com.avactis.sb.qa.base.ProjectBase;
import com.avactis.sb.qa.pages.CheckOutPage;
import com.avactis.sb.qa.pages.ProductDetailPage;

import org.testng.annotations.BeforeClass;

public class ProductDetailsPageTest extends ProjectBase {
  
	ProductDetailPage productDetail;
	CheckOutPage checkOut;
	
	public ProductDetailsPageTest() {
		super();
	}
	
 
  @BeforeClass
  public void beforeClass() {
	  productDetail = new ProductDetailPage();
  }
  
  @Test(priority=1)
  public void verifyTitleProductDetail() {
	  productDetail.validatePageTitile();
  }
  
  @Test(priority=2)
  public void getPorduct() {
	  productDetail.addtoCart();
	  
  }
  
  @Test(priority=3)
  public void checkOutUserCart() {
	  productDetail.seeTheCart();
	  checkOut = productDetail.checkOutCart();
  }

  
  
}
