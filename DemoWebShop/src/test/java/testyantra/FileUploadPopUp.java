package testyantra;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopUp {
	
	
	@Test
	public void test() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		
		Runtime.getRuntime().exec("./AutoIT/FileUploadPopUp.exe");
		driver.quit();
		 
	}

}
