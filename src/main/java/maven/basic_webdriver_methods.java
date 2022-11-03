package maven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_webdriver_methods 
{
	public static void main (String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tushar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		//String title=driver.getTitle();
		//System.out.println(title);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement flipkart=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		Thread.sleep(2000);
		boolean TTrue=flipkart.isDisplayed();
		
		if(TTrue)
		{
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
		else
		{
			driver.close();
		}
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Pink, 128 GB)')]")).click();
		Thread.sleep(2000);
		
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		Thread.sleep(1000);
		
		for(String x: allwindows)
		{
			driver.switchTo().window(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
}
