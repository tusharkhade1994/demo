package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amezon 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tushar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tussharkhade");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("heywhatsbeauty");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]/..")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@class='_aa8j'])[1]/../../../..")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_aagw']/../../.")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='s8sjc6am mczi3sny pxtik7zl b0ur3jhr']")).click();
		//Thread.sleep(30000);
		
		
		
		
		
		
		
		
		
		
		
	}

}
