package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopBooksPage {
	WebDriver driver;
	public DemoWebShopBooksPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement dropDown;
	public WebElement getDropDown() {
		return dropDown;
	}
	
	@FindBy(xpath = "//div[@class='details']//a[text()='Fiction']")
	private WebElement fictionLinkText;
	public WebElement getFictionLinkText() {
		return fictionLinkText;
	}
	
	@FindBy(xpath = "//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
	private WebElement booksAddToCart;
	public WebElement getBooksAddToCart() {
		return booksAddToCart;
	}
	
	@FindBy(xpath = "//div[@class='details']//a[text()='Health Book']")
	private WebElement healthBook;
	public WebElement getHealthBook() {
		return healthBook;
	}
	
	
	
	
	
	

}
