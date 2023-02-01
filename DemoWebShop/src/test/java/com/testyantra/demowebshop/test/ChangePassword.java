package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopChangePasswordPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;

public class ChangePassword extends BaseClass {
	
	@Test
	public void changePassword() throws EncryptedDocumentException, IOException {
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
		dwsHomePage.getMyAccount().click();
		dwsHomePage.getChangePasswordLinkText().click();
		dwsChangePasswordPage = new DemoWebShopChangePasswordPage(driver);
		dwsChangePasswordPage.getOldPasswordTextField().sendKeys(excelUtils.readStringData("testcasedata", 26, 1));
		dwsChangePasswordPage.getNewPasswordTextField().sendKeys(excelUtils.readStringData("testcasedata", 27, 1));
		dwsChangePasswordPage.getConfirmNewPasswordTextField().sendKeys(excelUtils.readStringData("testcasedata", 28, 1));
		dwsChangePasswordPage.getChangePasswordButton().click();
		dwsHomePage.getHomeLogoutLinkText().click();
	}

}
