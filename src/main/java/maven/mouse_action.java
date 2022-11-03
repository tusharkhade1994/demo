package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action 
{
	public static void main (String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Tushar\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement source= driver.findElement(By.xpath("(//div[contains(text(),'Oslo')])[2]"));
		WebElement target= driver.findElement(By.xpath("//div[@id='box104']"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source,target).build().perform();
		Thread.sleep(2000);
		
		driver.close();
		  
		
		
		
	}

}
