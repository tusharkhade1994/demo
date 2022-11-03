package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class single_test 
{
	WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.out.println("Open Browser");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tushar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }
	
	@BeforeTest
	public void url() throws InterruptedException
	{
		System.out.println("Enter url");
		
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
	}
	
	@BeforeClass
	public void maximize()
	{
		System.out.println("Max Browser");
		
		driver.manage().window().maximize();
    }
	
	@BeforeMethod
	public void getcookies()
	{
		System.out.println("Get Cookies");
	}
    
	@Test
	public void BusinessLogic() throws InterruptedException
	{
		System.out.println("Test completed ");
		
		Actions act =new Actions(driver);
		
		act.click(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"))).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@data-target='#modalLogin'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_email")).sendKeys("tusharkhade1994.tk@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("sign_user_password")).sendKeys("Tushar1994");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
		Thread.sleep(2000);
		
		WebElement x=driver.findElement(By.xpath("//button[@class='close open_parent']"));
		
		boolean TTrue= x.isDisplayed();
		if(TTrue)
		{
			x.click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sign_user_email")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sign_user_password")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sign_user_email")).sendKeys("tusharkhade1994.tk@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.id("sign_user_password")).sendKeys("heywhatsbeauty");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[contains(text(),'Log in')])[1]")).click();
			Thread.sleep(2000);
			}
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		act.click(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]"))).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Profile')]/../following-sibling::li[2]/a)[2]")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void takescreenshot()
	{
		System.out.println("take scrn shot");
	}
	
	@AfterClass
	public void dltcookies()
	{
		System.out.println("dlt cookies");
	}
	
	@AfterTest
	public void dbconnectionclosed()
	{
		System.out.println("dbconnection");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("close Browser");
	    driver.close();
	}
	
	
}
