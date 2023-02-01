package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopLoginPage {
	WebDriver driver;
	public DemoWebShopLoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement loginEmailTextField;
	public WebElement getLoginEmailTextField() {
		return loginEmailTextField;
	}
	
	@FindBy(id = "Password")
	private WebElement loginPasswordTextField;
	public WebElement getLoginPasswordTextField() {
		return loginPasswordTextField;
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginSubmitButton;
	public WebElement getLoginSubmitButton() {
		return loginSubmitButton;
	}

}
