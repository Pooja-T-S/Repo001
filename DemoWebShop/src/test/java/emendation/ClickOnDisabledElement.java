package emendation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickOnDisabledElement {
	
	@Test
	public void javascriptClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.xpath("//a[text()='jdk-8u361-linux-aarch64.tar.gz']")).click();
		driver.findElement(By.xpath("//a[text()='Download jdk-8u361-linux-aarch64.tar.gz']")).click();
		driver.quit();
		
	}

}
