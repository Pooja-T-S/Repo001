package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopCartPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopSimpleComputerPage;

public class SimpleComputerDetails extends BaseClass {
	
	@Test
	public void getSimpleComputerDetails() throws EncryptedDocumentException, IOException {
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
	    dwsHomePage.getSearchTextField().sendKeys(excelUtils.readStringData("testcasedata", 17, 1));
		dwsHomePage.getSearchButton().click();
		dwsHomePage.getSimpleComputerLinkText().click();
		dwsSimpleComputerPage = new DemoWebShopSimpleComputerPage(driver);
		dwsSimpleComputerPage.getRadioButtonProcessor().click();
		dwsSimpleComputerPage.getRadioButton8gbRAM().click();
		dwsSimpleComputerPage.getRadioButton400gbHDD().click();
		dwsSimpleComputerPage.getSimpleComputerAddToCart().click();
		dwsHomePage.getHomeShoppingCartLinkText().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 12 , 1))) {
			Reporter.log("ShoppingCartPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("ShoppingCartPage is not displayed upon verification of its URL.");
		}
		dwsCartPage = new DemoWebShopCartPage(driver);
		String details = dwsCartPage.getSimpleComputerArea().getText();
		Reporter.log("Simple Computer details : " + details);
		dwsHomePage.getHomeLogoutLinkText().click();
	}

}
