package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopCartPage {
	WebDriver driver;
	public DemoWebShopCartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[@class='remove-from-cart']//input[@name='removefromcart' and @type='checkbox']")
	private WebElement removeFromCartCheckBox;
	public WebElement getremoveFromCartCheckBox() {
		return removeFromCartCheckBox;
	}
	
	@FindBy(xpath = "//div[@class='common-buttons']//input[@name='updatecart']")
	private WebElement updateShoppingCartButton;
	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}
	
	@FindBy(xpath = "//input[@name='itemquantity2977102']")
	private WebElement cartQuantityTextField;
	public WebElement getCartQuantityTextField() {
		return cartQuantityTextField;
	}
	
	@FindBy(xpath = "//td[@class='product']")
	private WebElement simpleComputerArea;
	public WebElement getSimpleComputerArea() {
		return simpleComputerArea;
	}
	
	@FindBy(xpath = "//input[@value='Continue shopping']")
	private WebElement cartContinueShoppingButton;
	public WebElement getCartContinueShoppingButton() {
		return cartContinueShoppingButton;
	}
	
	@FindBy(xpath = "//input[@id='termsofservice' and @type='checkbox']")
	private WebElement termsAndServiceCheckBox;
	public WebElement getTermsAndServiceCheckBox() {
		return termsAndServiceCheckBox;
	}
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkOutButton;
	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	
	
	
	
	
	
	
	
	
	

}
