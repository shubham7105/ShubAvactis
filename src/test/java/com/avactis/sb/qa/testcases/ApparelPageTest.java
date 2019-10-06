package com.avactis.sb.qa.testcases;

import org.testng.annotations.Test;

import com.avactis.sb.qa.base.ProjectBase;
import com.avactis.sb.qa.pages.ApparelPage;
import com.avactis.sb.qa.pages.ProductDetailPage;

import org.testng.annotations.BeforeClass;

public class ApparelPageTest extends ProjectBase {
	
	ApparelPage apparelPage;
	ProductDetailPage productDetail;
	
   public ApparelPageTest() {
		super();
	}
	
  @BeforeClass
  public void beforeClass() {
	  apparelPage = new ApparelPage();
  }
  
  @Test
  public void verifyTitile() {
	  apparelPage.validatePageTitile();
  }
  
  @Test
  public void selectProduct () {
	  productDetail = apparelPage.gotoProductDetails();
  }
}
