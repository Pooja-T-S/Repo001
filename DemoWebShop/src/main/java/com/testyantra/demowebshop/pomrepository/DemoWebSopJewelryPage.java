package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebSopJewelryPage {
	WebDriver driver;
	public DemoWebSopJewelryPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='details']//a[text()='Black & White Diamond Heart']")
	private WebElement blackAndWhiteHeart;
	public WebElement getBlackAndWhiteHeart() {
		return blackAndWhiteHeart;
	}
	
	@FindBy(xpath = "//input[@value='Add to cart' and @id]")
	private WebElement bAndWHeartAddToCart;
	public WebElement getbAndWHeartAddToCart() {
		return bAndWHeartAddToCart;
	}
	
	@FindBy(xpath = "//li[@id='topcartlink']//span[text()='Shopping cart']")
	private WebElement shoppingCartLinkText;
	public WebElement getShoppingCartLinkText() {
		return shoppingCartLinkText;
	}

	@FindBy(xpath = "//tr[@class='cart-item-row']")
	private WebElement numberOfCartItems;
	public WebElement getNumberOfCartItems() {
		return numberOfCartItems;
	}
	

	
	
	
	
	
}
