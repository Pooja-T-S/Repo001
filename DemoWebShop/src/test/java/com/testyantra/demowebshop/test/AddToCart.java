package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;
import com.testyantra.demowebshop.pomrepository.DemoWebSopJewelryPage;

public class AddToCart extends BaseClass {
	
	@Test
	public void addToCart() throws EncryptedDocumentException, IOException {
		dwsHomePage = new DemoWebShopHomePage(driver);
		if(driver.getTitle().equals(excelUtils.readStringData("testcasedata", 0, 1))) {
			Reporter.log("Homepage is displayed upon verification of title.");
		}
		else {
			Reporter.log("Homepage is not displayed upon verification of title.");
		}
		dwsHomePage.getLoginLinkText().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 6, 1))){
			Reporter.log("LoginPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("LoginPage is not displayed upon verification of its URL.");
		}
		dwsLoginPage = new DemoWebShopLoginPage(driver);
		dwsLoginPage.getLoginEmailTextField().sendKeys(excelUtils.readStringData("testcasedata", 3, 1));
		dwsLoginPage.getLoginPasswordTextField().sendKeys(excelUtils.readStringData("testcasedata", 4, 1));
		dwsLoginPage.getLoginSubmitButton().submit();
		
//		String numberOfItems = dwsHomePage.getNumberOfItemsInCart().getText();
//		Reporter.log("Total number of items before adding any items to the cart : " + numberOfItems);
		
		dwsHomePage.getJewelryLinkText().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 7, 1))) {
			Reporter.log("JewelryPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("JewelryPage is not displayed upon verification of its URL.");
		}
		dwsJewelryPage = new DemoWebSopJewelryPage(driver);
		dwsJewelryPage.getBlackAndWhiteHeart().click();
		dwsJewelryPage.getbAndWHeartAddToCart().click();
		
//		String items = dwsHomePage.getNumberOfItemsInCart().getText();
//		Reporter.log("Total number of items after adding items to the cart : " + items);
		
		dwsJewelryPage.getShoppingCartLinkText().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 12 , 1))) {
			Reporter.log("ShoppingCartPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("ShoppingCartPage is not displayed upon verification of its URL.");
		}
		dwsHomePage.getHomeLogoutLinkText().click();
		
	}

}
