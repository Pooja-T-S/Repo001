package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopOrdersPage {
	WebDriver driver;
	public DemoWebShopOrdersPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Details']")
	private WebElement orderDetailsButton;
	public WebElement getOrderDetailsButton() {
		return orderDetailsButton;
	}
	
	@FindBy(xpath = "//a[text()='PDF Invoice']")
	private WebElement pdfInvoiceButton;
	public WebElement getPdfInvoiceButton() {
		return pdfInvoiceButton;
	}
	
	
	
	
	
	
	
	
	
	

}
