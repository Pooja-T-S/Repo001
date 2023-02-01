package testyantra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript2Test {
	
	@Test
	public void disableTextField(){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		WebElement books = driver.findElement(By.xpath("//a[text()='shirt']"));
//		jse.executeScript("arguments[0].scrollIntoView(false);", books);
		WebElement disabledTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
		jse.executeScript("arguments[0].value='abcgsrd';", disabledTextField);
		//driver.quit();
	}
	
//	@Test
//	public void example() {
//		System.out.println("Hello");
//	}

}
