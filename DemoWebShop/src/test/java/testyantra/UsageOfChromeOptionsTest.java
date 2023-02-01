package testyantra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class UsageOfChromeOptionsTest {
	    
	
	    @Test
	    public void chromeOptions() {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//options.addArguments("start-maximized");
		//options.addArguments("headless");
		//options.addArguments("--incognito");
		options.addArguments("start-maximized","--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
	}
}


