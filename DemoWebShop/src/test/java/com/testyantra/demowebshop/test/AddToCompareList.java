package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopShirtPage;

public class AddToCompareList extends BaseClass {
	
	@Test
	public void addToCompareList() throws EncryptedDocumentException, IOException {
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
		dwsHomePage.getShirtLinkText().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 16, 1))){
			Reporter.log("ShirtPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("ShirtPage is not displayed upon verification of its URL.");
		}
		dwsShirtPage = new DemoWebShopShirtPage(driver);
		dwsShirtPage.getCustomTShirt().click();
		dwsShirtPage.getAddToCompareList().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 32, 1))){
			Reporter.log("CompareProductsPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("CompareProductsPage is not displayed upon verification of its URL.");
		}
		dwsHomePage.getApplicationLogo().click();
		webdriverUtils.visibilityOfEle(driver, dwsHomePage.getApplicationLogo());
		String logoTitle = dwsHomePage.getApplicationLogo().getAttribute("alt");
		Reporter.log("Title of the logo : " + logoTitle);
		if(driver.getTitle().equals(excelUtils.readStringData("testcasedata", 0, 1))) {
			Reporter.log("Homepage is displayed upon verification of title.");
		}
		else {
			Reporter.log("Homepage is not displayed upon verification of title.");
		}
		dwsHomePage.getShirtLinkText().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 16, 1))){
			Reporter.log("ShirtPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("ShirtPage is not displayed upon verification of its URL.");
		}
		dwsShirtPage.getWrinkleFreeShirt().click();
		dwsShirtPage.getAddToCompareList().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 32, 1))){
			Reporter.log("CompareProductsPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("CompareProductsPage is not displayed upon verification of its URL.");
		}
		dwsHomePage.getHomeLogoutLinkText().click();
	}

}
