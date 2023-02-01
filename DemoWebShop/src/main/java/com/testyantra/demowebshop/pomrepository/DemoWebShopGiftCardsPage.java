package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopGiftCardsPage {
	WebDriver driver;
	public DemoWebShopGiftCardsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='$5 Virtual Gift Card']")
	private WebElement virtual$5GiftCard;
	public WebElement getVirtual$5GiftCard() {
		return virtual$5GiftCard;
	}
	
	@FindBy(xpath = "//input[@id='giftcard_1_RecipientName']")
	private WebElement recipientNameTextField;
	public WebElement getRecipientNameTextField() {
		return recipientNameTextField;
	}
	
	@FindBy(xpath = "//input[@id='giftcard_1_RecipientEmail']")
	private WebElement recipientMailTextField;
	public WebElement getRecipientMailTextField() {
		return recipientMailTextField;
	}
	
	@FindBy(xpath = "//textarea[@id='giftcard_1_Message']")
	private WebElement recipientMessageTextArea;
	public WebElement getRecipientMessageTextArea() {
		return recipientMessageTextArea;
	}
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-1']")
	private WebElement giftPageAddToCart;
	public WebElement getGiftPageAddToCart() {
		return giftPageAddToCart;
	}
	
	
	
	
	
	
	
	
	
	

}
