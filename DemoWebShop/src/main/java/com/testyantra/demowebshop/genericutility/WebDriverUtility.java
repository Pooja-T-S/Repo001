package com.testyantra.demowebshop.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * It provides us the WebDriver related functionalities
 * 
 * @author Pooja TS
 *
 */
public class WebDriverUtility {
	
	/**
	 * It helps us to provide time delay for every invocation of findElement(s) methods & its associated annotations
	 * @param driver
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
		
//		public boolean explicitWaitForCompleteTitle(WebDriver driver, String sheetName, int rowIndex, int colIndex) {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.titleIs(excelUtils.readStringData(sheetName, rowIndex, colIndex)));
//			return true;
//		}
	
		public boolean explicitWaitForCompleteTitle(WebDriver driver, String completeTitle) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			Boolean ref = wait.until(ExpectedConditions.titleIs(completeTitle));
			return ref;
		}
		
		public boolean waitForDOMToLoad(WebDriver driver, WebElement elementForWait, String attName, String attValue) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Boolean ref = wait.until(ExpectedConditions.domAttributeToBe(elementForWait, attName, attValue));
			return ref;
		}
		public WebElement visibilityOfEle(WebDriver driver,WebElement eleToLocate){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(95));
			WebElement ele = wait.until(ExpectedConditions.visibilityOf(eleToLocate));
			return ele;
		}
		public Boolean invisibilityOfEle(WebDriver driver, WebElement invisibleEle) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(95));
			Boolean ele = wait.until(ExpectedConditions.invisibilityOf(invisibleEle));
			return ele;
		}
		
		

		
		/**
		 * It transfers driver control to the frame based on index value
		 * @param driver
		 * @param index
		 */
		public void frameAsIndex(WebDriver driver,int index) {
			driver.switchTo().frame(index);
		}
		
		/**
		 * It transfers driver control to the frame based on id or name attribute
		 * @param driver
		 * @param IdOrName
		 */
		public void frameAsIdOrName(WebDriver driver,String IdOrName) {
			driver.switchTo().frame(IdOrName);
		}
		
		/**
		 * It transfers driver control to the frame based on WebElement identified on driver reference
		 * @param driver
		 * @param frameElement
		 */
		public void frameAsWebElement(WebDriver driver,WebElement frameElement) {
			driver.switchTo().frame(frameElement);
		}
		
		public int selectByIndex(Select select, int index) {
			select.selectByIndex(index);
			return index;
		}
		
		public String selectByValue(Select select, String value) {
			select.selectByValue(value);
			return value;
		}
		public String selectByVisibleText(Select select, String visibleText) {
			select.selectByVisibleText(visibleText);
			return visibleText;
		}
	}


