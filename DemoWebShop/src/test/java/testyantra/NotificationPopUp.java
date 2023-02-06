package testyantra;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NotificationPopUp {
	
	@Test
	public void testCase() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("./AutoIT/NotificationPopUp.exe");
		
		
	}

}
