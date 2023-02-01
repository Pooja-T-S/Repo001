package testyantra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick1Test {
	
	
	@Test
	public void doubleClick() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert pop-up text : " + alertText);
		driver.switchTo().alert().accept();
		//driver.quit();
	}
}