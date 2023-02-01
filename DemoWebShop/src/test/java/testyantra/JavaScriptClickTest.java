package testyantra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptClickTest {
	
	@Test
	public void disableButtonClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[text()='jdk-8u361-linux-x64.rpm']")).click();
		WebElement disabledLink = driver.findElement(By.xpath("//a[text()='Download jdk-8u361-linux-x64.rpm']"));
		jse.executeScript("arguments[0].click()", disabledLink);
		driver.quit();
	}
	
	
//	@Test
//	public void demo() {
//		System.out.println("Demo");
//	}

}
