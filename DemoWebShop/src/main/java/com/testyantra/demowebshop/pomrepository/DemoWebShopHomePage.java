package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopHomePage {
	WebDriver driver;
	public DemoWebShopHomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLinkText;
	public WebElement getRegisterLinkText() {
		return registerLinkText;
	}
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement loginLinkText;
	public WebElement getLoginLinkText() {
		return loginLinkText;
	}
	
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement homeLogoutLinkText;
	public WebElement getHomeLogoutLinkText() {
		return homeLogoutLinkText;
	}
	
	@FindBy(xpath = "//li[@class='inactive']//a[contains(text(),'Jewelry')]")
	private WebElement jewelryLinkText;
	public WebElement getJewelryLinkText() {
		return jewelryLinkText;
	}
	
	@FindBy(xpath = "//li[@class='inactive']//a[contains(text(),'Books')]")
	private WebElement booksLinkText;
	public WebElement getBooksLinkText() {
		return booksLinkText;
	}
	
	@FindBy(xpath = "//li[@class='inactive']//a[contains(text(),'Electronics')]")
	private WebElement electronicsLinkText;
	public WebElement getElectronicsLinkText() {
		return electronicsLinkText;
	}
	
	@FindBy(xpath = "//li[@class='inactive']//a[contains(text(),'Computers')]")
	private WebElement computersLinkText;
	public WebElement getComputersLinkText() {
		return computersLinkText;
	}
	
	@FindBy(xpath = "//li[@class='inactive' and (contains(.,'Digital downloads'))]")
	private WebElement digitalDownloadsLinkText;
	public WebElement getdigitalDownloadsLinkTextLinkText() {
		return digitalDownloadsLinkText;
	}
	
	@FindBy(xpath = "//ul[@class='list']//a[contains(text(),'Apparel & Shoes')]")
	private WebElement apparelAndShoes;
	public WebElement getApparelAndShoes() {
		return apparelAndShoes;
	} 
	
	
	
	@FindBy(xpath = "//a[text()='New products']")
	private WebElement newProducts;
	public WebElement getNewProducts() {
		return newProducts;
	}
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishListLinkText;
	public WebElement getWishListLinkText() {
		return wishListLinkText;
	}
	
	@FindBy(xpath = "//span[@class='wishlist-qty']")
	private WebElement numberOfItemsInWishlist;
	public WebElement getNumberOfItemsInWishlist() {
		return numberOfItemsInWishlist;
	}
	
	@FindBy(xpath = "//a[text()='shirt']")
	private WebElement shirtLinkText;
	public WebElement getShirtLinkText() {
		return shirtLinkText;
	}
	
	@FindBy(xpath = "//div[@class='header']//img[@alt='Tricentis Demo Web Shop']")
	private WebElement ApplicationLogo;
	public WebElement getApplicationLogo() {
		return ApplicationLogo;
	}
	
	@FindBy(xpath = "//li[@id='topcartlink']//span[text()='Shopping cart']")
	private WebElement homeShoppingCartLinkText;
	public WebElement getHomeShoppingCartLinkText() {
		return homeShoppingCartLinkText;
	}
	
	@FindBy(xpath = "//input[@value='Search store']")
	private WebElement searchTextField;
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	@FindBy(xpath = "//div[@class='item-box']//a[text()='Simple Computer']")
	private WebElement simpleComputerLinkText;
	public WebElement getSimpleComputerLinkText() {
		return simpleComputerLinkText;
	}
	
	@FindBy(xpath = "//a[text()='Addresses']")
	private WebElement addressLinkText;
	public WebElement getAddressLinkText() {
		return addressLinkText;
	}
	
	@FindBy(xpath = "//a[text()='My account']")
	private WebElement myAccount;
	public WebElement getMyAccount() {
		return myAccount;
	}
	
	@FindBy(xpath = "//li[@class='inactive']//a[contains(text(),'Gift Cards')]")
	private WebElement giftCardsLinkText;
	public WebElement getGiftCardsLinkText() {
		return giftCardsLinkText;
	}
	
	
	@FindBy(xpath = "//a[text()='Orders']")
	private WebElement ordersLinkText;
	public WebElement getOrdersLinkText() {
		return ordersLinkText;
	}
	
	@FindBy(xpath = "//a[text()='Change password']")
	private WebElement changePasswordLinkText;
	public WebElement getChangePasswordLinkText() {
		return changePasswordLinkText;
	}
	
	@FindBy(xpath = "//span[@class='cart-qty']")
	private WebElement numberOfItemsInCart;
	public WebElement getNumberOfItemsInCart() {
		return numberOfItemsInCart;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
