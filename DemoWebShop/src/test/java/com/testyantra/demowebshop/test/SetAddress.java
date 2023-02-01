package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopAddressPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;

public class SetAddress extends BaseClass {
	
	@Test
	public void setAddress() throws EncryptedDocumentException, IOException, InterruptedException {
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
		dwsHomePage.getAddressLinkText().click();
		dwsAddressPage = new DemoWebShopAddressPage(driver);
		dwsAddressPage.getAddNewButton().click();
		dwsAddressPage.getAddressFirstNameTextField().sendKeys(excelUtils.readStringData("testcasedata", 18, 1));
		dwsAddressPage.getAddressLastNameTextField().sendKeys(excelUtils.readStringData("testcasedata", 19, 1));
		dwsAddressPage.getAddressEmailTextField().sendKeys(excelUtils.readStringData("testcasedata", 20, 1));
		Select select = new Select(dwsAddressPage.getCountryDropDown());
		webdriverUtils.selectByVisibleText(select, "Canada");
		webdriverUtils.visibilityOfEle(driver, dwsAddressPage.getStateDropDown());

		//webdriverUtils.visibilityOfEle(driver, dwsAddressPage.getStateDropDown());
		webdriverUtils.invisibilityOfEle(driver, dwsAddressPage.getInvStateDropDown());
		Select select1 = new Select(dwsAddressPage.getStateDropDown());
		webdriverUtils.selectByIndex(select1, 7);

		dwsAddressPage.getCityTextField().sendKeys(excelUtils.readStringData("testcasedata", 21, 1));
		dwsAddressPage.getAddress1TextField().sendKeys(excelUtils.readStringData("testcasedata", 22, 1));
	    dwsAddressPage.getPostalCodeTextField().sendKeys(excelUtils.readNumericData("testcasedata", 23, 1));	
		dwsAddressPage.getPhoneNumberTextField().sendKeys(excelUtils.readNumericData("testcasedata", 24, 1));
		dwsAddressPage.getAddressSaveButton().click();
		if(driver.getCurrentUrl().contains(excelUtils.readStringData("testcasedata", 25, 1))){
			Reporter.log("AddressesPage is displayed upon verification of its URL.");
		}else {
			Reporter.log("AddressessPage is not displayed upon verification of its URL.");
		}
		//driver.switchTo().alert().dismiss();
		//dwsHomePage.getHomeLogoutLinkText().click();
	}

}
