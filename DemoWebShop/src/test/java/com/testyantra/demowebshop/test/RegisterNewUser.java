package com.testyantra.demowebshop.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testyantra.demowebshop.genericutility.BaseClass;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopRegisterPage;

public class RegisterNewUser extends BaseClass {
	
	@Test
	public void registerNewUser() throws EncryptedDocumentException, IOException {
		dwsHomePage = new DemoWebShopHomePage(driver);
		if(driver.getTitle().equals(excelUtils.readStringData("testcasedata", 0, 1))) {
			Reporter.log("Homepage is displayed upon verification of title.");
		}
		else {
			Reporter.log("Homepage is not displayed upon verification of title.");
		}
		webdriverUtils.visibilityOfEle(driver, dwsHomePage.getRegisterLinkText());
		dwsHomePage.getRegisterLinkText().click();
		dwsRegisterPage = new DemoWebShopRegisterPage(driver);
		if(dwsRegisterPage.getFemaleRadioButton().isSelected()) {
		    Reporter.log("Fail : Female radio button is not in selectable state.");
		}else {
			dwsRegisterPage.getFemaleRadioButton().click();
			Reporter.log("Pass : Female radio button is in selectable state & it is selected.");
		}
		webdriverUtils.visibilityOfEle(driver, dwsRegisterPage.getFirstNameTextField());
		dwsRegisterPage.getFirstNameTextField().sendKeys(excelUtils.readStringData("testcasedata", 1, 1));
		webdriverUtils.visibilityOfEle(driver, dwsRegisterPage.getLastNameTextField());
		dwsRegisterPage.getLastNameTextField().sendKeys(excelUtils.readStringData("testcasedata", 2, 1));
		webdriverUtils.visibilityOfEle(driver, dwsRegisterPage.getEmailTextField());
		dwsRegisterPage.getEmailTextField().sendKeys(excelUtils.readStringData("testcasedata", 3, 1));
		webdriverUtils.visibilityOfEle(driver, dwsRegisterPage.getPasswordTextField());
		dwsRegisterPage.getPasswordTextField().sendKeys(excelUtils.readStringData("testcasedata", 4, 1));
		webdriverUtils.visibilityOfEle(driver, dwsRegisterPage.getConfirmPasswordTextField());
		dwsRegisterPage.getConfirmPasswordTextField().sendKeys(excelUtils.readStringData("testcasedata", 5, 1));
		dwsRegisterPage.getRegisterButton().click();
		webdriverUtils.visibilityOfEle(driver, dwsRegisterPage.getLogoutLinkText());
		dwsRegisterPage.getLogoutLinkText().click();

}
}
