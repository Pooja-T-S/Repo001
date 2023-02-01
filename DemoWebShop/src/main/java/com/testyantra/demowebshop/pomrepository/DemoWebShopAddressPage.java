package com.testyantra.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopAddressPage {
	WebDriver driver;
	public DemoWebShopAddressPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewButton;
	public WebElement getAddNewButton() {
		return addNewButton;
	}
	
	@FindBy(id = "Address_FirstName")
	private WebElement addressFirstNameTextField;
	public WebElement getAddressFirstNameTextField() {
		return addressFirstNameTextField;
	}
	
	@FindBy(id = "Address_LastName")
	private WebElement addressLastNameTextField;
	public WebElement getAddressLastNameTextField() {
		return addressLastNameTextField;
	}
	@FindBy(id = "Address_Email")
	private WebElement addressEmailTextField;
	public WebElement getAddressEmailTextField() {
		return addressEmailTextField;
	}
	
	@FindBy(xpath = "//select[@id='Address_CountryId']")
	private WebElement countryDropDown;
	public WebElement getCountryDropDown() {
		return countryDropDown;
	}
	
	@FindBy(xpath = "//select[@id='Address_StateProvinceId']")
	private WebElement stateDropDown;
	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	@FindBy(xpath = "//input[@id='Address_City']")
	private WebElement cityTextField;
	public WebElement getCityTextField() {
		return cityTextField;
	}
	
	@FindBy(xpath = "//input[@id='Address_Address1']")
	private WebElement address1TextField;
	public WebElement getAddress1TextField() {
		return address1TextField;
	}
	
	@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
	private WebElement postalCodeTextField;
	public WebElement getPostalCodeTextField() {
		return postalCodeTextField;
	}
	
	@FindBy(xpath = "//input[@id='Address_PhoneNumber']")
	private WebElement phoneNumberTextField;
	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement addressSaveButton;
	public WebElement getAddressSaveButton() {
		return addressSaveButton;
	}
	
	@FindBy(xpath = "//span[text()='Wait...']")
	private WebElement invStateDropDown;
	public WebElement getInvStateDropDown() {
		return invStateDropDown;
	}
	
	
	
	
	
	
	
	
	

}
