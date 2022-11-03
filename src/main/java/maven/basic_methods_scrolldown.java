package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_methods_scrolldown 
{
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tushar\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tus.io/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)","");
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@id='js-file-input']")).sendKeys("F:\\mannual testing\\GBK Automation-Testcase.xlsx");
	    Thread.sleep(3000);
	    
	    js.executeScript("window.scrollBy(0,-300)", "");
	    Thread.sleep(2000);
	    
	    driver.close();
	    Thread.sleep(15000);
		
		
	}

}
