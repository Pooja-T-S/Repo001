package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopDigiDownloadsPage {
	WebDriver driver;
	public DemoWebShopDigiDownloadsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='details']//a[text()='3rd Album']")
	private WebElement thirdAlbum;
	public WebElement getThirdAlbum() {
		return thirdAlbum;
	}
	
	@FindBy(xpath = "//input[@value='Add to wishlist']")
	private WebElement digiDownloadsaddToWishList;
	public WebElement getDigiDownloadsaddToWishList() {
		return digiDownloadsaddToWishList;
	}
	
	

}
