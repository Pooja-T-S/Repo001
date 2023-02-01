package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopRegisterPage {
	WebDriver driver;
	public DemoWebShopRegisterPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	public WebElement getRegisterButton() {
		return registerButton;
	} 
	
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logoutLinkText;
	public WebElement getLogoutLinkText() {
		return logoutLinkText;
	}
	
	
	

}
