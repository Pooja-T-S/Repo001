package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopDigiDownloadsPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopWishlistPage;

public class RemoveFromWishlist extends BaseClass {
	
	@Test
	public void removeFromWishList() throws EncryptedDocumentException, IOException {
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
		dwsHomePage.getdigitalDownloadsLinkTextLinkText().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 11, 1))){
			Reporter.log("DigitalDownloadsPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("DigitalDownloadsPage is not displayed upon verification of its URL.");
		}
		dwsDigiDownloadsPage = new DemoWebShopDigiDownloadsPage(driver);
		dwsDigiDownloadsPage.getThirdAlbum().click();
		dwsDigiDownloadsPage.getDigiDownloadsaddToWishList().click();
		
//		dwsDigiDownloadsPage.getAddToWishList().click();
//		webdriverUtils.visibilityOfEle(driver, dwsHomePage.getNumberOfItemsInWishlist());
//		String itemList = dwsHomePage.getNumberOfItemsInWishlist().getText();
//        Reporter.log("Total no. of items present in the wishlist : " + itemList);
		
        dwsHomePage.getWishListLinkText().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 14, 1))){
			Reporter.log("WishListPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("WishListPage is not displayed upon verification of its URL.");
		}
		dwsWishlist = new DemoWebShopWishlistPage(driver);
		dwsWishlist.getremoveFromWishlist().click();
		dwsWishlist.getUpdateWishlist().click();
		dwsHomePage.getHomeLogoutLinkText().click();
	}

}
