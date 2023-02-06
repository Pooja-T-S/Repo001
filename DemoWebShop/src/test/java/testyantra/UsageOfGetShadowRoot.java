package testyantra;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetShadowRoot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost1 = driver.findElement(By.cssSelector("div[id='shadow_host']"));
		SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
		
		WebElement textField = shadowRoot1.findElement(By.cssSelector("input[type='text']"));
		textField.sendKeys("abcd");
		WebElement checkBox = shadowRoot1.findElement(By.cssSelector("input[type='checkbox']"));
		checkBox.click();
        
		Thread.sleep(2000);
		
		WebElement chooseFile = shadowRoot1.findElement(By.cssSelector("input[type='file']"));
		chooseFile.click();
		
		WebElement link = shadowRoot1.findElement(By.cssSelector("a[href='scroll.html']"));
		link.click();
		
		
		
//		WebElement shadowHost2 = shadowRoot1.findElement(By.cssSelector("div[id='nested_shadow_host']"));
//		SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
//		String ele1 = shadowRoot2.findElement(By.cssSelector("div[id='nested_shadow_content'] > div")).getText();
//		System.out.println(ele1);
		
		
		
		
		
	}

}
