package testyantra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class AssertsPractice {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String expectedTitle = "Demo Web Shop";
		String actualTitle = driver.getTitle();
		
		//Assert.assertEquals(actualTitle, "demo web shop", "Pass");
//		Reporter.log("Title is found correct", true);
		
		SoftAssert asrt = new SoftAssert();
		asrt.assertEquals(actualTitle, expectedTitle, "Pass");
		Reporter.log("Title is found correct", true);
		System.out.println("Why So Serious?!");
		
		asrt.assertAll();
		driver.quit();
	}

}
