package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopSimpleComputerPage {
	WebDriver driver;
	public DemoWebShopSimpleComputerPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='radio' and @id='product_attribute_75_6_32_99']")
	private WebElement radioButton8gbRAM;
	public WebElement getRadioButton8gbRAM() {
		return radioButton8gbRAM;
	}
	
	@FindBy(xpath = "//input[@type='radio' and @id='product_attribute_75_3_33_103']")
	private WebElement radioButton400gbHDD;
	public WebElement getRadioButton400gbHDD() {
		return radioButton400gbHDD;
	}
	
	@FindBy(xpath = "//input[@type='radio' and @id='product_attribute_75_5_31_96']")
	private WebElement radioButtonProcessor;
	public WebElement getRadioButtonProcessor() {
		return radioButtonProcessor;
	}
	
	@FindBy(xpath = "//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
	private WebElement simpleComputerAddToCart;
	public WebElement getSimpleComputerAddToCart() {
		return simpleComputerAddToCart;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
