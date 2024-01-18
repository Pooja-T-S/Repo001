package dataReading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenDefaultChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("GoogleChrome", true);
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\");
		options.addArguments("disable-infobars");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	
		driver.get("https://allensolly.abfrl.in/");
	}

}
