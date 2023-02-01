package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopBooksPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopCartPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopCheckOutPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;

public class PlacingOrder extends BaseClass {
	
	@Test
	public void placingOrder() throws EncryptedDocumentException, IOException {
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
		dwsHomePage.getBooksLinkText().click();
		dwsBooksPage = new DemoWebShopBooksPage(driver);
		dwsBooksPage.getHealthBook().click();
		dwsBooksPage.getBooksAddToCart().click();
		dwsHomePage.getHomeShoppingCartLinkText().click();
		dwsCartPage = new DemoWebShopCartPage(driver);
		dwsCartPage.getTermsAndServiceCheckBox().click();
		dwsCartPage.getCheckOutButton().click();
		dwsCheckOutPage = new DemoWebShopCheckOutPage(driver);
		dwsCheckOutPage.getBillingAddressContinueButton().click();
		webdriverUtils.visibilityOfEle(driver,dwsCheckOutPage.getShippingAddressContinueButton());
		dwsCheckOutPage.getShippingAddressContinueButton().click();
		webdriverUtils.visibilityOfEle(driver,dwsCheckOutPage.getShippingMethodContinueButton());
		dwsCheckOutPage.getShippingMethodContinueButton().click();
		webdriverUtils.visibilityOfEle(driver,dwsCheckOutPage.getPaymentMethodContinueButton());
		dwsCheckOutPage.getPaymentMethodContinueButton().click();
		webdriverUtils.visibilityOfEle(driver,dwsCheckOutPage.getPaymentInfoContinueButton());
		dwsCheckOutPage.getPaymentInfoContinueButton().click();
		webdriverUtils.visibilityOfEle(driver,dwsCheckOutPage.getConfirmButton());
		dwsCheckOutPage.getConfirmButton().click();
		webdriverUtils.visibilityOfEle(driver,dwsCheckOutPage.getOrderPlacedContinueButton());
		dwsCheckOutPage.getOrderPlacedContinueButton().click();
		dwsHomePage.getHomeLogoutLinkText().click();
	}

}
