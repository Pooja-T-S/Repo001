package com.testyantra.demowebshop.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.testyantra.demowebshop.pomrepository.DemoWebShopAddressPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopApparelAndShoesPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopBooksPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopCartPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopChangePasswordPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopCheckOutPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopCompareProductsPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopDigiDownloadsPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopGiftCardsPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopHomePage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopLoginPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopOrdersPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopRegisterPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopShirtPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopSimpleComputerPage;
import com.testyantra.demowebshop.pomrepository.DemoWebShopWishlistPage;
import com.testyantra.demowebshop.pomrepository.DemoWebSopJewelryPage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fileUtils = new FileUtility();
	public ExcelUtility excelUtils = new ExcelUtility();
	public WebDriverUtility webdriverUtils = new WebDriverUtility();
	public DemoWebShopHomePage dwsHomePage;
	public DemoWebShopRegisterPage dwsRegisterPage;
	public DemoWebShopLoginPage dwsLoginPage;
	public DemoWebSopJewelryPage dwsJewelryPage;
	public DemoWebShopBooksPage dwsBooksPage;
	public DemoWebShopDigiDownloadsPage dwsDigiDownloadsPage;
	public DemoWebShopWishlistPage dwsWishlist;
	public DemoWebShopApparelAndShoesPage dwsApparelAndShoesPage;
	public DemoWebShopShirtPage dwsShirtPage;
	public DemoWebShopCompareProductsPage dwsCompareProductsPage;
	public DemoWebShopCartPage dwsCartPage;
	public DemoWebShopSimpleComputerPage dwsSimpleComputerPage;
	public DemoWebShopAddressPage dwsAddressPage;
	public DemoWebShopGiftCardsPage dwsGiftCardPage;
	public DemoWebShopCheckOutPage dwsCheckOutPage;
	public DemoWebShopOrdersPage dwsOrdersPage;
	public DemoWebShopChangePasswordPage dwsChangePasswordPage;
	
	@BeforeClass
	public void configBeforeMethod() throws IOException {
		String browserName = fileUtils.readPropertyFileData("browser");
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtils.readPropertyFileData("url"));
	} 
	
	@AfterClass
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
