package testClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pra 
{
	@FindBy(xpath="//input[@id='vfb-5']")
	static WebElement FirstName;
	public static void enterFirstName()
	{
		FirstName.sendKeys("charli");
	}
	
	@Test
	public void method()
	{
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
		enterFirstName();
		
	}

}
