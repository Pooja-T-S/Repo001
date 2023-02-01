package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopCompareProductsPage {
	WebDriver driver;
	public DemoWebShopCompareProductsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='page-body']//a[text()='Clear list']")
	private WebElement clearListLinkText;
	public WebElement getClearListLinkText() {
		return clearListLinkText;
	}
	
	
	
	
	
	
	
}
