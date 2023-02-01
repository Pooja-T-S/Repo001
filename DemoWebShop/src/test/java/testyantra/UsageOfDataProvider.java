package testyantra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsageOfDataProvider {
	
	
	@DataProvider(name = "loginData")
	public Object[][] sample(){
		Object[][] objArr = new Object[3][2];
		
		objArr[0][0] = "Zeke";
		objArr[0][1] = "zeke@123";
		
		objArr[1][0] = "Cal";
		objArr[1][1] = "cal@123";
		
		objArr[2][0] = "Michela";
		objArr[2][1] = "michela@123";
		
		return objArr;
		
	}
	
	@Test(dataProvider = "loginData")
	public void login(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		
	}

}
