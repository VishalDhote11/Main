package testClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilityClasses.Screenshot;


public class TestBaseClass 
{
	 WebDriver driver;
	 @Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws IOException
	{
		 if(browserName.equals("chrome"))
		 {
		System.setProperty("webdriver.chrome.driver", "D:\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		 }
		 else
		 {
			 System.setProperty("webdriver.edge.driver", "D:\\DriverFiles\\msedgedriver.exe");
				driver =new EdgeDriver();
		 }
		 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		Screenshot.ss(driver, "BrowserOpen");
	}
	@AfterMethod
	public void TearDown() throws Throwable
	{
		driver.quit();
		finalize();
	}
	

}
