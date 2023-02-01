package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopShirtPage {
	WebDriver driver;
	public DemoWebShopShirtPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Custom T-Shirt']")
	private WebElement customTShirt;
	public WebElement getCustomTShirt() {
		return customTShirt;
	}
	
	@FindBy(xpath = "//div[@class='details']//a[text()=\"Men's Wrinkle Free Long Sleeve\"]")
	private WebElement wrinkleFreeShirt;
	public WebElement getWrinkleFreeShirt() {
		return wrinkleFreeShirt;
	}

	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement addToCompareList;
	public WebElement getAddToCompareList() {
		return addToCompareList;
	}
	
	@FindBy(xpath = "//div[@class='column customer-service']//a[text()='Compare products list']")
	private WebElement compareProductsListLinkText;
	public WebElement getCompareProductsListLinkText() {
		return compareProductsListLinkText;
	}
	
	
	
	
	
	
	
	
	
}
