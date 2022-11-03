package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_for_insta 
{
	WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.out.println("Open Browser");
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Tushar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void url() throws InterruptedException
	{
		System.out.println(" Enter url");
		
		driver.get("https://www.instagram.com/accounts/login/?__coig_restricted=1");
		Thread.sleep(2000);
	}
	
	@BeforeClass
	public void maximize() throws InterruptedException
	{
		System.out.println("Max Brower");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void getcookies()
	{
		System.out.println("gt cookies");
	}

	@Test
	public void BusinessLogic() throws InterruptedException
	{
		System.out.println("Test completed");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tussharkhade");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8392984293");
	    Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.xpath("//input[@name='username']")).clear();
		Thread.sleep(9000);
		
	    driver.findElement(By.xpath("//input[@name='password']")).clear();
	    Thread.sleep(6000);
	
	    String title=driver.getTitle();
	    System.out.println("title");
	    
	    }
	
	
	@AfterMethod
	public void takecreenshot()
	{
		System.out.println("Take screen shot");
	}
	
	@AfterClass
	public void dltcookies()
	{
		System.out.println("dlt cookies");
	}
	
	@AfterTest
	public void dbconnectionclosed()
	{
		System.out.println("db connection");
	}
	
	@AfterSuite
	public void browserclose()
	{
		System.out.println("Browser closed");
	}
	
}
