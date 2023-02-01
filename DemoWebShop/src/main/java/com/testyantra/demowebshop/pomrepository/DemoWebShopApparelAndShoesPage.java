package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopApparelAndShoesPage {
	WebDriver driver;
	public DemoWebShopApparelAndShoesPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='details']//a[text()='Blue and green Sneaker']")
	private WebElement blueAndGreenSneaker;
	public WebElement getBlueAndGreenSneaker() {
		return blueAndGreenSneaker;
	}
	
	@FindBy(xpath = "//input[@value='Add to wishlist']")
	private WebElement apparelAddToWishlist;
	public WebElement getApparelAddToWishlist() {
		return apparelAddToWishlist;
	}
	
	@FindBy(xpath = "//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
	private WebElement apparelAddToCart;
	public WebElement getApparelAddToCart() {
		return apparelAddToCart;
	}
	
	

}
