package Base;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
		@BeforeSuite
		public void TimeStamp() {
			 Date date = new Date();  
	         Timestamp ts=new Timestamp(date.getTime());  
	         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	         System.out.println(formatter.format(ts));
		}
		
		
		
		
		@BeforeTest
		public void driveriniation() {
			System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\kurap\\\\eclipse-workspace\\\\Chrome\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}
		
		
		@BeforeClass
		public void login() {
			driver.get("https://www.google.com/");
			driver.navigate().to("https://adactinhotelapp.com/");
			driver.manage().deleteAllCookies();
			driver.findElement(By.id("//input[@id='username']")).sendKeys("phanindra1234");
		    ((WebElement) driver.findElements(By.id("//input[@id='password']"))).sendKeys("123456");
			driver.findElement(By.id("//input[@type='submit']")).click();
		
			
		}
		
		@AfterTest
		
		public void driverclose() {
			driver.close();
		}
			
	    
		@AfterSuite
		public void suiteafter() {
			 Date date = new Date();  
	         Timestamp ts=new Timestamp(date.getTime());  
	         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	         System.out.println(formatter.format(ts));  

		}

}
