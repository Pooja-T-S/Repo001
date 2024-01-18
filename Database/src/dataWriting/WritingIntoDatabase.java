package dataWriting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WritingIntoDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));		
		search.sendKeys("poco x5 pro 5g");
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();
		List<WebElement> titles = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));
		
		String prodTitle = null;
		for (WebElement title : titles) {
			prodTitle = title.getText();
			System.out.println(prodTitle);			
		}
		System.out.println(prodTitle.length());

		String prodPrice = null;
		for (WebElement price : prices) {
			prodPrice = price.getText();
			System.out.println(prodPrice);
		}
		System.out.println(prodPrice.length());

		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Amazon", "root", "Flink@54");
			Statement st = connect.createStatement();
			//connect.prepareStatement("insert into Amazon.details")
			
		} catch (Exception e) {
			
		}
		
		
		
		
		
		
		driver.quit();
		
	}

}
