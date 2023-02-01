package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopCartPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopGiftCardsPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;

public class SendingGiftcard extends BaseClass {
	
	@Test
	public void sendingGiftCard() throws EncryptedDocumentException, IOException {
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
		dwsHomePage.getGiftCardsLinkText().click();
		dwsGiftCardPage = new DemoWebShopGiftCardsPage(driver);
		dwsGiftCardPage.getVirtual$5GiftCard().click();
		dwsGiftCardPage.getRecipientNameTextField().sendKeys(excelUtils.readStringData("testcasedata", 29, 1));
		dwsGiftCardPage.getRecipientMailTextField().sendKeys(excelUtils.readStringData("testcasedata", 30, 1));
		dwsGiftCardPage.getRecipientMessageTextArea().sendKeys(excelUtils.readStringData("testcasedata", 31, 1));
		dwsGiftCardPage.getGiftPageAddToCart().click();
		dwsHomePage.getHomeShoppingCartLinkText().click();
		dwsCartPage = new DemoWebShopCartPage(driver);
		dwsCartPage.getCartContinueShoppingButton().click();
		dwsHomePage.getHomeLogoutLinkText().click();
	}

}
