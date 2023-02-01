package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopWishlistPage {
	WebDriver driver;
	public DemoWebShopWishlistPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "removefromcart")
	private WebElement removeFromWishlistCheckBox;
	public WebElement getremoveFromWishlist() {
		return removeFromWishlistCheckBox;
	}
	
	@FindBy(xpath = "//input[@value='Update wishlist']")
	private WebElement updateWishlist;
	public WebElement getUpdateWishlist() {
		return updateWishlist;
	}
	
	@FindBy(xpath = "//input[@name='addtocart' and @type='checkbox']")
	private WebElement addToCartCheckBox;
	public WebElement getAddToCartCheckBox() {
		return addToCartCheckBox;
	}
	
	@FindBy(name = "addtocartbutton")
	private WebElement addToCartButton;
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	
	
	

}
