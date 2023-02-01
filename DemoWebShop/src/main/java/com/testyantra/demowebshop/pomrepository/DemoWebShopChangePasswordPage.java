package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopChangePasswordPage {
	WebDriver driver;
	public DemoWebShopChangePasswordPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='OldPassword']")
	private WebElement oldPasswordTextField;
	public WebElement getOldPasswordTextField() {
		return oldPasswordTextField;
	}
	
	@FindBy(xpath = "//input[@id='NewPassword']")
	private WebElement newPasswordTextField;
	public WebElement getNewPasswordTextField() {
		return newPasswordTextField;
	}
	
	@FindBy(xpath = "//input[@id='ConfirmNewPassword']")
	private WebElement confirmNewPasswordTextField;
	public WebElement getConfirmNewPasswordTextField() {
		return confirmNewPasswordTextField;
	}
	
	@FindBy(xpath = "//input[@value='Change password']")
	private WebElement changePasswordButton;
	public WebElement getChangePasswordButton() {
		return changePasswordButton;
	}
	
	

}
