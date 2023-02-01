package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopCheckOutPage {
	WebDriver driver;
	public DemoWebShopCheckOutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingAddressContinueButton;
	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}
	
	@FindBy(xpath = "//input[@onclick='Shipping.save()' and @value='Continue']")
	private WebElement shippingAddressContinueButton;
	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}
	
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']//input[@value='Continue']")
	private WebElement shippingMethodContinueButton;
	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}
	
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']//input[@value='Continue']")
	private WebElement paymentMethodContinueButton;
	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}
	
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']//input[@value='Continue']")
	private WebElement paymentInfoContinueButton;
	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}
	
	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']//input[@value='Confirm']")
	private WebElement confirmButton;
	public WebElement getConfirmButton() {
		return confirmButton;
	}
	
	@FindBy(xpath = "//input[@class='button-2 order-completed-continue-button']")
	private WebElement orderPlacedContinueButton;
	public WebElement getOrderPlacedContinueButton() {
		return orderPlacedContinueButton;
	}
	
	
	
	
	
	
	
	
	
	
	

}
